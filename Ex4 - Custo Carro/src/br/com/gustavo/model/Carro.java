package br.com.gustavo.model;

public class Carro {
	private String nome;
	private String fabrica;
	private Double custoTotal;
	private Double custoFabricacao;
	private Integer id;
	

	public Carro(Integer id, String nome, String fabrica, Double custoTotal, Double custoFabricacao) {
		this.id = id;
		this.nome = nome;
		this.fabrica = fabrica;
		this.custoTotal = custoTotal;
		this.custoFabricacao = custoFabricacao;
	}
	
	public Double getCustoFabricacao() {
		return custoFabricacao;
	}

	public void setCustoFabricacao(Double custoFabricacao) {
		this.custoFabricacao = custoFabricacao;
	}

	public void setCustoTotal(Double custoTotal) {
		this.custoTotal = custoTotal;
	}

	public Double getCustoTotal() {
		return custoTotal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabrica() {
		return fabrica;
	}

	public void setFabrica(String fabrica) {
		this.fabrica = fabrica;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
