package lrvendas.modelo;

import lrvendas.modelo.enums.StatusPedido;

public class Pedido {

	private Integer pedid;
	private Integer pedproqtd;
	private Double pedvalor;
	private Integer fkpednfid;
	private Integer fkpedproid;
	private Integer fkpedcliid;
	private StatusPedido status;
	private Produto produto;
	private NotaFiscal notaFiscal;
	private Cliente cliente;

	

	public Pedido(Integer pedid, Integer pedproqtd, Integer fkpednfid, Integer fkpedproid,
		Integer fkpedcliid, StatusPedido status, Produto produto, NotaFiscal notaFiscal, Cliente cliente) {
		this.pedid = pedid;
		this.pedproqtd = pedproqtd;
		this.setPedvalor();
		this.fkpednfid = fkpednfid;
		this.fkpedproid = fkpedproid;
		this.fkpedcliid = fkpedcliid;
		this.status = status;
		this.produto = produto;
		this.notaFiscal = notaFiscal;
		this.cliente = cliente;
	}

	public Integer getPedid() {
		return pedid;
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

	private void setPedvalor() {
		this.pedvalor = this.pedproqtd * this.produto.getPropreco();
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Integer getFkpednfid() {
		return fkpednfid;
	}

	public Integer getFkpedproid() {
		return fkpedproid;
	}

	public Integer getFkpedcliid() {
		return fkpedcliid;
	}

	public Produto getProduto() {
		return produto;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
	
	
	
}
