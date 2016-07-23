package br.survey.view;

import br.survey.controller.GeradorInfo;
import util.LeituraConsole;

public class Main {
	public GeradorInfo info;
	
	public Main() {
		this.info = new GeradorInfo();
		info.geraVariasPessoas();
		menu();
	}
	
	public void cadastrarUmaPessoa() throws IndexOutOfBoundsException{
		String nome = LeituraConsole.lerDadoEntradaTexto("Nome: ");
		Integer idade = LeituraConsole.lerDadoEntradaInteiro("Idade:");
		Double peso = LeituraConsole.lerDadoEntradaNumerico("Peso: ");
		Double altura = LeituraConsole.lerDadoEntradaNumerico("Altura: ");
		String corOlhos = LeituraConsole.lerDadoEntradaTexto("Cor dos olhos: ");
		String corCabelos = LeituraConsole.lerDadoEntradaTexto("Cor dos Cabelos: ");
		info.addPessoa(nome, idade, peso, altura, info.retornaCodCorOlhos(corOlhos), info.retornaCodCorCabelos(corCabelos));
		System.out.println("Pessoa " + nome + " inserida com sucesso.");
	}
	
	public void menu(){
		System.out.println("------------------------------------------------------------------------");
		System.out.println("                      Bem vindo!                                        ");
		System.out.println("1 - Incluir Pessoa");
		System.out.println("2 - Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos");
		System.out.println("3 - Media das idades das pessoas co0m altura superior a 1.70");
		System.out.println("4 - Porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas");
		System.out.println("5 - Qntd de pessoas ruivas que nao possuem olhos azuis");
		System.out.println("0 - Sair");
		int escolha;
		while(true){
			escolha = LeituraConsole.lerDadoEntradaInteiro("O que deseja fazer?");
			switch (escolha){
			case 1:
				try{
				cadastrarUmaPessoa();
				break;
				}catch(IndexOutOfBoundsException e){
					System.out.println("Infelizmente sua versao suporta apenas 5 pessoas, fale com nosso representante de vendas para mais informacoes");
					return;
				}
			case 2:
				quantidadePessoas50();
				break;
			case 3:
				mediaIdades();
				break;
			case 4:
				olhosAzuis();
				break;
			case 5:
				qntdRuivas();
				break;
			case 0:
				return;
			}	
		}
	}
	
	public void quantidadePessoas50(){
		System.out.println("A quantidade de pessoas que possuem 50 anos ou mais e tem peso inferior "
				+ "a 50 quilos e de: " + info.qntdPessoas50Mais() + " pessoas");
	}
	
	public void mediaIdades(){
		System.out.println("A media de idades das pessoas com altura superior a 1.70 e: " + info.mediaIdade());
	}
	
	public void olhosAzuis(){
		System.out.println("A porcentagem de pessoas que possuem  olhos azuis e "+ info.porcentagemOlhosAzuis());
	}
	
	public void qntdRuivas(){
		System.out.println("A quantidade de pessoas ruivas que nao possuem olhos azuis e de: " + info.qntdRuivasSemAzul());
	}
 

	public GeradorInfo getInfo() {
		return info;
	}

	public void setInfo(GeradorInfo info) {
		this.info = info;
	}
}
