package lrvendas.modelo.dao;

import lrvendas.modelo.entites.Venda;

public class VendaDAO {
	private String sql;

	public Venda listarByNotaFiscal(int fkvennfid) {
		Venda ven = null;
		try {
			Conexao.conectar();
			sql = "SELECT * FROM venda WHERE fkvennfid = ?";
			Conexao.pst = Conexao.con.prepareStatement(sql);
			Conexao.pst.setInt(1, fkvennfid);
			Conexao.rs = Conexao.pst.executeQuery();

			while (Conexao.rs.next()) {
				ven = new Venda();
				ven.setVenid(Conexao.rs.getInt("venid"));
				ven.setFkvennfid(Conexao.rs.getInt("fkvennfid"));
				ven.setFkvenvendid(Conexao.rs.getInt("fkvenvendid"));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			Conexao.fechar();
		}
		return ven;

	}
}
