package lrvendas.modelo.entites;

import lrvendas.modelo.excessoes.MyException;

public interface ISetupVenda {

	public void addVenda(Venda venda)throws MyException;
	public void removeVenda(Venda venda)throws MyException;
}
