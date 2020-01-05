package lrvendas.modelo.entites;

import lrvendas.modelo.excessoes.MyException;

public interface ISetupNotaFiscal {
	
	public void addNotaFiscal(NotaFiscal notaFiscal) throws MyException;

	public void removeNotaFiscal(NotaFiscal notaFiscal) throws MyException;
}
