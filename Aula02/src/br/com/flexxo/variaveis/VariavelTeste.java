package br.com.flexxo.variaveis;

public class VariavelTeste {

	public static void main(String[] args) {

		Variavel v1 = new Variavel();
		v1.executarMetodo(1);
		
		Variavel.variavelClasse = 30;
		// Variavel.variavelClasseFinal;
		
		System.out.println();
		
		System.out.println(Variavel.VARIAVEL_FINAL);
		
		Variavel v2 = new Variavel();
		v2.executarMetodo(1);
	}
}