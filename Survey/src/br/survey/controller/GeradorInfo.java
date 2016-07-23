package br.survey.controller;

import br.survey.model.Pessoa;

public class GeradorInfo {
	private Pessoa[] pessoas;

	public GeradorInfo() {
		this.pessoas = new Pessoa[5];
	}
	
	public void addPessoa(String nome, Integer idade, Double peso, Double altura, Character corOlhos, Character corCabelos) throws IndexOutOfBoundsException{
		int i = verificaPosLivre();
		if(i != -1){
			pessoas[i] = new Pessoa(nome, idade, peso, altura, corOlhos, corCabelos);
		}else{
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void geraVariasPessoas(){
		pessoas[0] = new Pessoa("Tevez", 35, 82.00, 1.55, 'P', 'R');
		pessoas[1] = new Pessoa("Carlitos", 70, 25.00, 1.70, 'A', 'L');
		pessoas[2] = new Pessoa("Maradona", 91, 118.00, 1.45, 'V', 'P');
		pessoas[3] = new Pessoa("Messi", 28, 45.00, 1.60, 'P', 'P');
		pessoas[4] = new Pessoa("Riquelme", 48, 90.00, 1.80, 'V', 'C');		
	}

	private int verificaPosLivre(){
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] == null) {
				return i;
			}
		}
		return -1;
	}

	public Integer qntdPessoas50Mais() {
		Integer qntd = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() > 50 && pessoas[i].getPeso() < 60) {
				qntd++;
			}
		}
		return qntd;
	}

	public Double mediaIdade() {
		Integer idade = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getAltura() > 1.70) {
				idade += pessoas[i].getIdade();
			}
		}
		return (idade.doubleValue()/pessoas.length);
	}
	
	public Double porcentagemOlhosAzuis(){
		Integer qntd = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getCorOlhos() == 'A') {
				qntd++;
			}
		}
		return qntd.doubleValue()/pessoas.length;
	}
	
	public Integer qntdRuivasSemAzul(){
		Integer qntd = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getCorCabelos() == 'R' && pessoas[i].getCorOlhos() != 'A') {
				qntd++;
			}
		}
		return qntd;
	}
	
	public Character retornaCodCorOlhos(String cor){
		if(cor.equalsIgnoreCase("Verde")){
			return 'V';
		}else if(cor.equalsIgnoreCase("Azul")){
			return 'A';
		}else if(cor.equalsIgnoreCase("Preto")){
			return 'P';
		}else if(cor.equalsIgnoreCase("Castanho")){
			return 'C';
		}else{
			return null;
		}
	}
	
	public Character retornaCodCorCabelos(String cor){
		if(cor.equalsIgnoreCase("Ruivo")){
			return 'R';
		}else if(cor.equalsIgnoreCase("Louro")){
			return 'L';
		}else if(cor.equalsIgnoreCase("Preto")){
			return 'P';
		}else if(cor.equalsIgnoreCase("Castanho")){
			return 'C';
		}else{
			return null;
		}
	}

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
}
