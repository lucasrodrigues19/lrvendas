package lrvendas.modelo.entites;

import java.util.Date;

import lrvendas.modelo.utils.DataUtil;

public class NotaFiscal {

	private Integer nfid;
	private Date nfdata;
	private Integer fknfcliid;
	private Double nfvalor = 0.0;
	private Venda venda;
	private Cliente cliente;

	public NotaFiscal() {

	}

	public NotaFiscal(Integer nfid, Date nfdata, Cliente cliente) {
		this.nfid = nfid;
		this.nfdata = nfdata;
		this.cliente = cliente;
	}

	public Integer getNfid() {
		return nfid;
	}

	public void setNfid(Integer nfid) {
		this.nfid = nfid;
	}

	public String getNfdata() {
		return DataUtil.SDF_HD.format(nfdata);
	}

	public void setNfdata(Date nfdata) {
		this.nfdata = nfdata;
	}

	public Integer getFknfcliid() {
		return fknfcliid;
	}

	public void setFknfcliid(Integer fknfcliid) {
		this.fknfcliid = fknfcliid;
	}

	public Double getNfvalor() {
		this.setNfvalor();
		return nfvalor;
	}

	private void setNfvalor() {
		this.nfvalor = venda.getVenvalor();
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
