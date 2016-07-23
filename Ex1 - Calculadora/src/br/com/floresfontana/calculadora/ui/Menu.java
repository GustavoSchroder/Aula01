package br.com.floresfontana.calculadora.ui;

import java.util.Scanner;

import br.com.floresfontana.calculadora.service.Calculadora;
import br.com.floresfontana.calculadora.service.CalculadoraBasica;

public class Menu {

	public Menu() {

		Calculadora calc = new CalculadoraBasica();

		System.out.println("| ----------- |");
		System.out.println("| Calculadora |");
		System.out.println("| ----------- |");
		System.out.println();

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o valor 1:");
		double valor1 = teclado.nextDouble();

		System.out.println("Informe o valor 2:");
		double valor2 = teclado.nextDouble();

		double resultado = calc.somar(valor1, valor2);

		System.out.println(resultado);

		teclado.close();

	}
}
