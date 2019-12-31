package lrvendas.modelo.entites;

import java.util.Date;

import lrvendas.modelo.utils.DataUtil;

public class NotaFiscal {

	private Integer nfid;
	private Date nfddata;
	private Integer fknfcliid;
	private Double nfvalor = 0.0;
	private Venda venda;
	private Cliente cliente;
	
		
 public NotaFiscal() {
	 
 }


public NotaFiscal(Integer nfid, Date nfddata, Cliente cliente) {
	this.nfid = nfid;
	this.nfddata = nfddata;
	this.cliente = cliente;
}


public Integer getNfid() {
	return nfid;
}


public void setNfid(Integer nfid) {
	this.nfid = nfid;
}


public String getNfddata() {
	return DataUtil.SDF_HD.format(nfddata);
}


public void setNfddata(Date nfddata) {
	this.nfddata = nfddata;
}


public Integer getFknfcliid() {
	return fknfcliid;
}


public void setFknfcliid() {
	this.fknfcliid = cliente.getCliid();
}


public Double getNfvalor() {
	return nfvalor;
}


public void setNfvalor() {
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
