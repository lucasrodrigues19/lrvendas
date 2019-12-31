package lrvendas.modelo.entites;

import lrvendas.modelo.excessoes.MyException;

public interface ISetupPedido {

	public void addPedido(Pedido pedido)throws MyException;
	public void removePedido(Pedido pedido)throws MyException;
}
