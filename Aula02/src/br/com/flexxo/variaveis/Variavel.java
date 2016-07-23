package br.com.flexxo.variaveis;

public class Variavel {
	
	public int variavelInstancia = 1;
	
	public static int variavelClasse = 2;
	
	public final static int VARIAVEL_FINAL = 22;
	
	public void executarMetodo(int variavelParametro) {
		
		int variavelLocal = 3;
		
		System.out.println("Vari�vel Instancia:" + variavelInstancia);
		System.out.println("Vari�vel Classe:" + variavelClasse);
		System.out.println("Vari�vel Local:" + variavelLocal);
		System.out.println("Vari�vel Parametro:" + variavelParametro);
		
	}
}
