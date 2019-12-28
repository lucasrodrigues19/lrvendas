package lrvendas.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Cliente implements ISetupNotaFiscal, ISetupPedido {

	private Integer cliid;
	private String clinome;
	private String clicpf;
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	private List<NotaFiscal> notaFiscal = new ArrayList<NotaFiscal>();
	

	
	public Cliente(Integer cliid, String clinome, String clicpf, List<Pedido> pedidos, List<NotaFiscal> notaFiscal) {
		this.cliid = cliid;
		this.clinome = clinome;
		this.clicpf = clicpf;
		this.pedidos = pedidos;
		this.notaFiscal = notaFiscal;
	}


	public Integer getCliid() {
		return cliid;
	}

	public String getClinome() {
		return clinome;
	}
	public void setClinome(String clinome) {
		this.clinome = clinome;
	}

	public String getClicpf() {
		return clicpf;
	}

	public void setClicpf(String clicpf) {
		this.clicpf = clicpf;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public List<NotaFiscal> getNotaFiscal() {
		return notaFiscal;
	}


	@Override
	public void addNotaFiscal(NotaFiscal notaFiscal) {
		this.getNotaFiscal().add(notaFiscal);	
	}
	@Override
	public void removeNotaFiscal(NotaFiscal notaFiscal) {
		this.getNotaFiscal().remove(notaFiscal);
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
