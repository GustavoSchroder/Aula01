package br.com.flexxo.conversao;

public class StringParaNumero {

	public static void main(String[] args) {

		String s1 = "5.6";
		String s2 = "7.3";

		float a = (Float.valueOf(s1)).floatValue();
		float b = (Float.valueOf(s2)).floatValue();

		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));

	}

}
