package lr.vendas.controle.helper;

import lrvendas.modelo.entites.ISetupPedido;
import lrvendas.modelo.entites.ISetupVenda;
import lrvendas.modelo.entites.Pedido;
import lrvendas.modelo.entites.Venda;
import lrvendas.modelo.entites.Vendedor;
import lrvendas.modelo.enums.StatusVenda;
import lrvendas.modelo.excessoes.MyException;

public class VenderHelper implements ISetupPedido, ISetupVenda {

	// adicionar e remove pedidos para a venda

	/*
	 * adiciona pedidos para a venda
	 */
	@Override
	public void addPedido(Pedido pedido, Venda venda) throws MyException {

		if (pedido == null) {
			throw new MyException("O pedido esta nulo");
		}

		if (venda.getStatus().equals(StatusVenda.valueOf("ANDAMENTO"))) {
			venda.getPedidos().add(pedido);
		} else {
			throw new MyException("nemhum pedido pode ser adicionado, a venda ja foi concluida");
		}

	}

	/*
	 * remove pedidos para a venda
	 */
	@Override
	public void removePedido(Pedido pedido, Venda venda) throws MyException {

		if (pedido == null) {
			throw new MyException("O pedido esta nulo");
		}
		if (venda.getStatus().equals(StatusVenda.valueOf("ANDAMENTO"))) {

			venda.getPedidos().remove(pedido);
		} else {
			throw new MyException("nemhum pedido pode ser removido, a venda ja foi concluida");
		}
	}
	// adicionar e remover vendas para o vendedor

	/*
	 * adiciona vendas para o vendedor
	 */
	@Override
	public void addVenda(Venda venda, Vendedor vendedor) throws MyException {
		if (venda == null) {
			throw new MyException("A venda esta nula");
		}
		if (venda.getStatus().equals(StatusVenda.valueOf("ANDAMENTO"))) {
			vendedor.getVendas().add(venda);
		} else {
			throw new MyException("nemhuma venda pode ser adicionado, a venda ja foi concluida");
		}

	}

	/*
	 * remove vendas para o vendedor
	 */
	@Override
	public void removeVenda(Venda venda, Vendedor vendedor) throws MyException {
		if (venda == null) {
			throw new MyException("A venda esta nula");
		}
		if (venda.getStatus().equals(StatusVenda.valueOf("ANDAMENTO"))) {
			vendedor.getVendas().remove(venda);
		} else {
			throw new MyException("nemhuma venda pode ser removida, a venda ja foi concluida");
		}
	}

}
