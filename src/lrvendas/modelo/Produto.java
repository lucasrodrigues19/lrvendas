package lrvendas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Produto implements ISetupPedido {

	private Integer proid;
	private Integer progrupo;
	private Double propreco;
	private String prodesc;
     private List<Pedido> pedidos= new ArrayList<Pedido>();
	
	
	public Produto(Integer proid, Integer progrupo, Double propreco, String prodesc, List<Pedido> pedidos) {
		this.proid = proid;
		this.progrupo = progrupo;
		this.propreco = propreco;
		this.prodesc = prodesc;
		this.pedidos = pedidos;
	}

	public Produto() {
		
	}

	public Integer getProid() {
		return proid;
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

	@Override
	public void addPedido(Pedido pedido) {
		this.getPedidos().add(pedido);
		
	}

	@Override
	public void removePedido(Pedido pedido) {
		this.getPedidos().remove(pedido);		
	}
	
	
	
}
