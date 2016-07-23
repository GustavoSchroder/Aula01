package br.com.floresfontana.io;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) {

		System.out.println("| ----------------------------- |");
		System.out.println("| 	        Leitura 	    |");
		System.out.println("| ----------------------------- |");

		Leitor l = new Leitor();

		l.ler();

		System.out.println("| ----------------------------- |");
		System.out.println("| 	        Escrita 	    |");
		System.out.println("| ----------------------------- |");

		Escritor e = new Escritor();

		String pasta = "Nova Pasta";
		e.criarDiretorio(pasta);

		e.escrever(pasta);

		List<String> lista = new ArrayList<String>();

		for (String s : lista) {

			System.out.println(s);

		}

		Iterator<String> i = lista.iterator();

		while (i.hasNext()) {

			String s1 = i.next();

			if (i.hasNext()) {
				System.out.println(s1);
			}
		}

		for (int j = 0; j < lista.size(); j++) {

			String s = lista.get(j);

			System.out.println(s);

		}

	}

}
