package lrvendas.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import lrvendas.modelo.entites.NotaFiscal;

public class NotaFiscalDAO {

	private String sql;

	public void salvar(NotaFiscal notaFiscal) {
		try {
			Conexao.conectar();
			sql = "INSERT INTO notafiscal (nfdata,nfvalor,fknfcliid) VALUES (?,?,?)";
			Conexao.pst = Conexao.con.prepareStatement(sql);
			Conexao.pst.setString(1, notaFiscal.getNfdata());
			Conexao.pst.setDouble(2, notaFiscal.getNfvalor());
			Conexao.pst.setInt(3, notaFiscal.getFknfcliid());
			Conexao.pst.execute();
			System.out.println("dados salvos");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Conexao.fechar();
		}
	}

	public void deletar(int id) {
		try {
			Conexao.conectar();
			sql = "DELETE FROM notaFiscal WHERE nfid = ?";
			Conexao.pst = Conexao.con.prepareStatement(sql);
			Conexao.pst.setInt(1, id);
			Conexao.pst.execute();
			System.out.println("Dados da notafiscal (" + id + ") deletados");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Conexao.fechar();
		}
	}

	public List<NotaFiscal> listarByCliente(int fknfcliid) {
		List<NotaFiscal> lista = new ArrayList<NotaFiscal>();
		NotaFiscal nf;
		try {
			Conexao.conectar();
			sql = "SELECT * FROM notafiscal WHERE fknfcliid = ?";
			Conexao.pst = Conexao.con.prepareStatement(sql);
			Conexao.pst.setInt(1, fknfcliid);
			Conexao.rs = Conexao.pst.executeQuery();

			while (Conexao.rs.next()) {
				nf = new NotaFiscal();
				nf.setNfid(Conexao.rs.getInt("nfid"));
				nf.setNfdata(Conexao.rs.getDate("nfdata"));
				nf.setFknfcliid(Conexao.rs.getInt("fknfcliid"));
				lista.add(nf);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			Conexao.fechar();
		}
		return lista;

	}

	public NotaFiscal listarById(int nfid) {
		NotaFiscal nf = null;
		try {
			Conexao.conectar();
			sql = "SELECT * FROM notafiscal WHERE nfid = ?";
			Conexao.pst = Conexao.con.prepareStatement(sql);
			Conexao.pst.setInt(1, nfid);
			Conexao.rs = Conexao.pst.executeQuery();

			while (Conexao.rs.next()) {

				nf = new NotaFiscal();
				nf.setNfid(Conexao.rs.getInt("nfid"));
				nf.setNfdata(Conexao.rs.getDate("nfdata"));
				nf.setFknfcliid(Conexao.rs.getInt("fknfcliid"));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			Conexao.fechar();
		}
		return nf;

	}
}
