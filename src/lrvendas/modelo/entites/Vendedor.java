package lrvendas.modelo.entites;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

	private Integer vendid;
	private String vendnome;
	private List<Venda> vendas = new ArrayList<Venda>();

	public Vendedor(String vendnome) {
		this.vendnome = vendnome;
	}

	public Vendedor() {
	}

	public void setVendid(Integer vendid) {
		this.vendid = vendid;
	}

	public Integer getVendid() {
		return vendid;
	}

	public String getVendnome() {
		return vendnome;
	}

	public void setVendnome(String vendnome) {
		this.vendnome = vendnome;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void addVenda(Venda venda) {
		this.getVendas().add(venda);
	}

	public void removeVenda(Venda venda) {
		this.getVendas().remove(venda);
	}

}
