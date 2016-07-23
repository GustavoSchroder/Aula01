package br.survey.model;

public class Pessoa {
	private String nome;
	private Integer idade;
	private Double peso;
	private Double altura;
	private Character corOlhos;
	private Character corCabelos;
	
	public Pessoa(){
	}
		
	public Pessoa(String nome, Integer idade, Double peso, Double altura, Character corOlhos, Character corCabelos) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.corOlhos = corOlhos;
		this.corCabelos = corCabelos;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Character getCorOlhos() {
		return corOlhos;
	}
	public void setCorOlhos(Character corOlhos) {
		this.corOlhos = corOlhos;
	}
	public Character getCorCabelos() {
		return corCabelos;
	}
	public void setCorCabelos(Character corCabelos) {
		this.corCabelos = corCabelos;
	}
	
	
}
