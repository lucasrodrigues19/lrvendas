package lrvendas.modelo.entites;

import java.util.ArrayList;
import java.util.List;

import lrvendas.modelo.enums.StatusVenda;

public class Venda {

	private Integer venid;
	private Double venvalor = 0.0;
	private Integer fkvennfid;
	private Integer fkvenvendid;
	private NotaFiscal notaFiscal;
	private Vendedor vendedor;
	private StatusVenda status;
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	public Venda() {
	}

	public Venda(Vendedor vendedor, StatusVenda status) {
		this.vendedor = vendedor;
		this.status = status;
	}

	public Integer getVenid() {
		return venid;
	}

	public void setVenid(Integer venid) {
		this.venid = venid;
	}

	public Double getVenvalor() {
		this.setVenvalor();
		return venvalor;
	}

	private void setVenvalor() {
		for (Pedido p : getPedidos()) {
			if (p != null && p.getPedvalor() != null) {
				venvalor += p.getPedvalor();
			}
		}
	}

	public Integer getFkvennfid() {
		return fkvennfid;
	}

	public void setFkvennfid(Integer fkvennfid) {
		this.fkvennfid = fkvennfid;
	}

	public Integer getFkvenvendid() {
		return fkvenvendid;
	}

	public void setFkvenvendid(Integer fkvenvendid) {
		this.fkvenvendid = fkvenvendid;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public StatusVenda getStatus() {
		return status;
	}

	public void setStatus(StatusVenda status) {
		this.status = status;
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
