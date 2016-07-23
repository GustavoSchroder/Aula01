package br.com.flexxo.variaveis;

public class Variavel {
	
	public int variavelInstancia = 1;
	
	public static int variavelClasse = 2;
	
	public final static int VARIAVEL_FINAL = 22;
	
	public void executarMetodo(int variavelParametro) {
		
		int variavelLocal = 3;
		
		System.out.println("Variável Instancia:" + variavelInstancia);
		System.out.println("Variável Classe:" + variavelClasse);
		System.out.println("Variável Local:" + variavelLocal);
		System.out.println("Variável Parametro:" + variavelParametro);
		
	}
}
