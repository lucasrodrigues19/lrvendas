package lrvendas.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lrvendas.modelo.excessoes.MyException;

public class NotaFiscal implements ISetupPedido {

	private Integer nfid;
	private Date nfddata;
	private Integer fknfcliid;
	private Double nfvalor = 0.0;
	private Venda venda;
	private Cliente cliente;
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public NotaFiscal(Integer nfid, Date nfddata, Integer fknfcliid, Venda venda, Cliente cliente,
			List<Pedido> pedidos) {
		this.nfid = nfid;
		this.nfddata = nfddata;
		this.fknfcliid = fknfcliid;
		this.venda = venda;
		this.cliente = cliente;
		this.pedidos = pedidos;
	}

	public Integer getNfid() {
		return nfid;
	}

	public String getNfddata() throws  MyException {
		return sdf.format(nfddata);
	}

	public Integer getFknfcliid() {
		return fknfcliid;
	}

	public Venda getVenda() {
		return venda;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public Double getNfvalor() {
		return nfvalor;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	//metodos especiais
	
	public void valorNotaFiscal() {
		//pega todos os pedidos e seus valores
		for(Pedido p: this.getPedidos()) {
			if(p != null && p.getPedvalor() != null) {
			this.nfvalor+= p.getPedvalor();	
			}
		}
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
