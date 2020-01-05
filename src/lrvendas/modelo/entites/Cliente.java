package lrvendas.modelo.entites;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private Integer cliid;
	private String clinome;
	private String clicpf;
	private List<NotaFiscal> notaFiscal = new ArrayList<NotaFiscal>();

	public Cliente(String clinome, String clicpf) {
		this.clinome = clinome;
		this.clicpf = clicpf;
	}

	public Cliente() {

	}

	public Integer getCliid() {
		return cliid;
	}

	public void setCliid(Integer cliid) {
		this.cliid = cliid;
	}

	public String getClinome() {
		return clinome;
	}

	public void setClinome(String clinome) {
		this.clinome = clinome;
	}

	public String getClicpf() {
		return clicpf;
	}

	public void setClicpf(String clicpf) {
		this.clicpf = clicpf;
	}

	public List<NotaFiscal> getNotaFiscal() {
		return notaFiscal;
	}

	public void addNotaFiscal(NotaFiscal notaFiscal) {

		this.getNotaFiscal().add(notaFiscal);
	}

	public void removeNotaFiscal(NotaFiscal notaFiscal) {

		this.getNotaFiscal().remove(notaFiscal);
	}

}
