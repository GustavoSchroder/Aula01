package br.com.flexxo.fluxo;

public class Laco {

	public static void main(String args[]) {
		
		/* FOR ---------------------------------------------- */

		for (int i = 1; i < 11; i++) {
			System.out.println("Cont é: " + i);
		}

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int item : nums) {
			System.out.println("Cont é: " + item);
		}

		/* WHILE --------------------------------------------- */

		int cont1 = 1;
		while (cont1 < 11) {
			System.out.println("Cont é: " + cont1);
			cont1++;
		}
		
		/* DO-WHILE ------------------------------------------ */

		int cont2 = 1;
		do {
			System.out.println("Cont é: " + cont2);
			cont2++;
		} while (cont2 < 11);
		
		/* --------------------------------------------------- */

	}

}
