package lrvendas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Vendedor implements ISetupVenda {

	private Integer vendid;
	private String vendnome;
	private List<Venda> vendas = new ArrayList<Venda>();
	
	
	
	public Vendedor(Integer vendid, String vendnome, List<Venda> vendas) {
		this.vendid = vendid;
		this.vendnome = vendnome;
		this.vendas = vendas;
	}
	public Vendedor() {
		
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
	@Override
	public void addVenda(Venda venda) {
		this.getVendas().add(venda);
	}
	
}
