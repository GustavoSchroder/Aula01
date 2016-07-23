package br.com.flexxo.arrays;

import java.util.Arrays;

class MeuArray {

	public static void main(String[] args) {

		// declaração
		int[] umArray;

		// alocação do tamanho
		umArray = new int[10];

		// inicializacao do primeiro elemento, segundo...
		umArray[0] = 100;
		umArray[1] = 200;
		umArray[2] = 300;
		umArray[3] = 400;

		System.out.println("Elemento na posição 0: " + umArray[0]);
		System.out.println("Elemento na posição 1: " + umArray[1]);
		System.out.println("Elemento na posição 2: " + umArray[2]);
		System.out.println("Elemento na posição 3: " + umArray[3]);
		
		int[] outroArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		
		System.out.println(Arrays.toString(outroArray));
	}
}




