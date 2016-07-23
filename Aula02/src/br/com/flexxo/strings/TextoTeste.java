package br.com.flexxo.strings;

public class TextoTeste {

	public static void main(String[] args) {

		String palindromo = "OMISSÍSSIMO";
		int len = palindromo.length();

		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];

		// coloca o texto em um array
		for (int i = 0; i < len; i++) {
			tempCharArray[i] = palindromo.charAt(i);
		}

		// reverte a posicao dos caracteres
		for (int j = 0; j < len; j++) {
			charArray[j] = tempCharArray[len - 1 - j];
		}

		System.out.println(palindromo);
		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);
	}

	public void formatar() {

		float floatVar = 1.0f;
		int intVar = 2;
		String stringVar = "flexxo";

		System.out.printf("O valor da variavel float é %f, do inteiro é %d, e a string é %s", floatVar, intVar, stringVar);

		String fs;
		fs = String.format("O valor da variavel float é %f, do inteiro é %d, e a string é %s", floatVar, intVar, stringVar);
		System.out.println(fs);

	}

}
