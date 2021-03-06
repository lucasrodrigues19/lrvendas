package lrvendas.modelo.entites;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private Integer proid;
	private Integer progrupo;
	private Double propreco;
	private String prodesc;
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	public Produto(Integer progrupo, Double propreco, String prodesc) {
		this.progrupo = progrupo;
		this.propreco = propreco;
		this.prodesc = prodesc;
	}

	public Produto() {

	}

	public Integer getProid() {
		return proid;
	}

	public void setProid(Integer proid) {
		this.proid = proid;
	}

	public Integer getProgrupo() {
		return progrupo;
	}

	public void setProgrupo(Integer progrupo) {
		this.progrupo = progrupo;
	}

	public Double getPropreco() {
		return propreco;
	}

	public void setPropreco(Double propreco) {
		this.propreco = propreco;
	}

	public String getProdesc() {
		return prodesc;
	}

	public void setProdesc(String prodesc) {
		this.prodesc = prodesc;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void removePedido(Pedido pedido) {
		pedidos.remove(pedido);
	}

}
