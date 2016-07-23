package br.com.flexxo.conversao;

public class NumeroParaString {

	public static void main(String[] args) {

		double d = 858.48;
		String s = Double.toString(d);

		int dot = s.indexOf('.');

		System.out.println(dot + " digitos " + "antes do pointo");
		System.out.println((s.length() - dot - 1) + " digitos depois do ponto");

	}

}
