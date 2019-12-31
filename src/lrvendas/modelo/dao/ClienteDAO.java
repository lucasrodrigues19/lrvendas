package lrvendas.modelo.dao;


import java.util.ArrayList;
import java.util.List;

import lrvendas.modelo.entites.Cliente;

public class ClienteDAO {
private String sql;

	public void salvar(Cliente cliente) {
		try {
			Conexao.conectar();
			sql =  "INSERT INTO cliente (clinome,clicpf) VALUES (?,?)";
			Conexao.pst = Conexao.con.prepareStatement(sql);
			Conexao.pst.setString(1, cliente.getClinome());
			Conexao.pst.setString(2, cliente.getClicpf());
			Conexao.pst.execute();
			System.out.println("dados salvos");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Conexao.fechar();
		}
	}
	
	public void deletar(int id) {
		try {
			Conexao.conectar();
			sql  = "DELETE FROM cliente WHERE cliid = ?";
			Conexao.pst = Conexao.con.prepareStatement(sql);
			Conexao.pst.setInt(1, id);
			Conexao.pst.execute();
			System.out.println("Dados do cliente ("+ id+") deletados");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Conexao.fechar();
		}
	}
	public void update(int id, String nome) {
		try {
			Conexao.conectar();
			sql = "UPDATE cliente set clinome = ? where cliid= ?";
			Conexao.pst = Conexao.con.prepareStatement(sql);
			Conexao.pst.setString(1, nome);
			Conexao.pst.setInt(2, id);
			Conexao.pst.execute();
			System.out.println("Dados do cliente ("+id+") atualizados");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexao.fechar();
		}
	}
	
	public List<Cliente> listar(String cpf){
		List<Cliente> lista = new ArrayList<Cliente>();
		Cliente c;
		try {
			Conexao.conectar();
			sql = "SELECT * FROM cliente WHERE clicpf = ?";
			Conexao.pst = Conexao.con.prepareStatement(sql);
			Conexao.pst.setString(1, cpf);
			Conexao.rs = Conexao.pst.executeQuery();
			while(Conexao.rs.next()) {
				c = new Cliente();
				c.setCliid(Conexao.rs.getInt("cliid"));
				c.setClinome(Conexao.rs.getString("clinome"));
				c.setClicpf(Conexao.rs.getString("clicpf"));
				lista.add(c);
			}
		
		} catch (Exception e) {
		}finally {
			Conexao.fechar();
		}
		return lista;
		
		
	}
	
}
