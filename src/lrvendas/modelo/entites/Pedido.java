package lrvendas.modelo.entites;

import lrvendas.modelo.enums.StatusPedido;

public class Pedido {

	private Integer pedid;
	private Integer pedproqtd;
	private Double pedvalor;
	private Integer fkpedproid;
	private Integer fkpedvenid;
	private StatusPedido status;
	private Produto produto;
	private Venda venda;
	

	public Pedido() {

	}


	public Pedido(Integer pedproqtd, StatusPedido status, Produto produto) {
		this.pedproqtd = pedproqtd;
		this.status = status;
		this.produto = produto;
	}


	public Integer getPedid() {
		return pedid;
	}


	public void setPedid(Integer pedid) {
		this.pedid = pedid;
	}


	public Integer getPedproqtd() {
		return pedproqtd;
	}


	public void setPedproqtd(Integer pedproqtd) {
		this.pedproqtd = pedproqtd;
	}


	public Double getPedvalor() {
		return pedvalor;
	}


	public void setPedvalor() {
		this.pedvalor = pedproqtd * produto.getPropreco();
	}


	public Integer getFkpedproid() {
		return fkpedproid;
	}


	public void setFkpedproid() {
		this.fkpedproid = produto.getProid();
	}


	public Integer getFkpedvenid() {
		return fkpedvenid;
	}


	public void setFkpedvenid() {
		this.fkpedvenid = venda.getVenid();
	}


	public StatusPedido getStatus() {
		return status;
	}


	public void setStatus(StatusPedido status) {
		this.status = status;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Venda getVenda() {
		return venda;
	}


	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	
		
	
	
	
	
}
