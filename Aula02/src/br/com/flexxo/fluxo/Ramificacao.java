package br.com.flexxo.fluxo;

public class Ramificacao {

	public static void main(String args[]) {

		// BREAK

		int[] array = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		int busca = 12;

		int i;
		boolean encontrou = false;

		for (i = 0; i < array.length; i++) {
			if (array[i] == busca) {
				encontrou = true;
				break;
			}
		}

		if (encontrou) {
			System.out.println("Encontrado " + busca + " na posição " + i);
		} else {
			System.out.println(busca + " não está na lista");
		}

		// CONTINUE

		String texto = "Flexxo";
		int max = texto.length();
		int num = 0;

		for (int j = 0; j < max; j++) {

			if (texto.charAt(j) != 'x')
				continue;

			num++;
		}
		System.out.println("Encontrado " + num + " 'x' no texto");

	}

}
