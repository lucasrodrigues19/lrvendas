package lrvendas.modelo;

public class Venda {

	private Integer venid;
	private Integer fkvennfid;
	private Integer fkvenvendid;
	private NotaFiscal notaFiscal;
	private Vendedor vendedor;
	

	public Integer getVenid() {
		return venid;
	}

	public Integer getFkvennfid() {
		return fkvennfid;
	}

	public Integer getFkvenvendid() {
		return fkvenvendid;
	}

	
	
}
