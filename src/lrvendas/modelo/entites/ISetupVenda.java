package lrvendas.modelo.entites;

import lrvendas.modelo.excessoes.MyException;

public interface ISetupVenda {

	public void addVenda(Venda venda, Vendedor vendedor) throws MyException;

	public void removeVenda(Venda venda, Vendedor vendedor) throws MyException;
}
