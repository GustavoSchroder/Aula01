package br.com.floresfontana.calculadora.service;

public class CalculadoraBasica implements Calculadora {

	public double somar(double d1, double d2) {
		return d1 + d2;
	}

	public double subtrair(double d1, double d2) {
		return d1 - d2;
	}

	public double dividir(double d1, double d2) {
		return d1 / d2;
	}

	public double multiplicar(double d1, double d2) {
		return d1 * d2;
	}
}
