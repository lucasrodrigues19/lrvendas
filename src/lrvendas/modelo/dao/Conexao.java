package lrvendas.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

	private final static String URL = "jdbc:mysql://localhost/lrvendas";
	private final static String USER = "root";
	private final static String SENHA = "";
	protected static Connection con;
	protected static PreparedStatement pst;
	protected static ResultSet rs;

	protected static void conectar() {
		try {
			Conexao.con = DriverManager.getConnection(URL, USER, SENHA);
			System.out.println("Conexao realizada");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected static void fechar() {
		try {
			Conexao.con.close();
			System.out.println("Conexao fechada");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
