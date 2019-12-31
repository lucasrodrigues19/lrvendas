package lrvendas.modelo.entites;

import java.util.ArrayList;
import java.util.List;

import lrvendas.modelo.enums.StatusVenda;
import lrvendas.modelo.excessoes.MyException;

public class Vendedor implements ISetupVenda {

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
	@Override
	public void addVenda(Venda venda)throws MyException {
		if(venda.getStatus().equals(StatusVenda.valueOf("ANDAMENTO"))) {
		this.getVendas().add(venda);
		}else {
			throw new MyException("nemhuma venda pode ser adicionado, a venda ja foi concluida");
		}
		
	}
	@Override
	public void removeVenda(Venda venda)throws MyException {
		if(venda.getStatus().equals(StatusVenda.valueOf("ANDAMENTO"))) {
		this.getVendas().remove(venda);
		}else {
			throw new MyException("nemhuma venda pode ser removida, a venda ja foi concluida");
		}
		
	}
	
}
