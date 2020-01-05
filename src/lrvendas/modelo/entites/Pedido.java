package lrvendas.modelo.entites;

public class Pedido {

	private Integer pedid;
	private Integer pedproqtd;
	private Double pedvalor;
	private Integer fkpedproid;
	private Integer fkpedvenid;
	private Produto produto;
	private Venda venda;

	public Pedido() {

	}

	public Pedido(Integer pedproqtd, Produto produto) {
		this.pedproqtd = pedproqtd;
		this.produto = produto;
	}

	public Integer getPedid() {
		return pedid;
	}

	public void setPedid(Integer pedid) {
		this.pedid = pedid;
	}

	public Integer getPedproqtd() {
		return pedproqtd;
	}

	public void setPedproqtd(Integer pedproqtd) {
		this.pedproqtd = pedproqtd;
	}

	public Double getPedvalor() {
		this.setPedvalor();
		return pedvalor;
	}

	private void setPedvalor() {
		this.pedvalor = pedproqtd * produto.getPropreco();
	}

	public Integer getFkpedproid() {
		return fkpedproid;
	}

	public void setFkpedproid(Integer fkpedproid) {
		this.fkpedproid = fkpedproid;
	}

	public Integer getFkpedvenid() {
		return fkpedvenid;
	}

	public void setFkpedvenid(Integer fkpedvenid) {
		this.fkpedvenid = venda.getVenid();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}
