package br.com.flexxo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Programa {

	public Programa() {

	}

	public void adicionarElemento() {

		List<String> nomes = new LinkedList<String>();

		nomes.add("João");
		nomes.add("Maria");

		System.out.println(nomes);

	}

	public void removerElemento() {

		Collection<Integer> fila = new ArrayList<Integer>();
		fila.add(1);
		fila.add(2);

		System.out.println("Lista: " + fila);

		fila.remove(2);

		System.out.println("Lista: " + fila);

	}

	public void buscarElemento() {

		Set<String> vogais = new LinkedHashSet<String>();

		vogais.add("A");
		vogais.add("E");
		vogais.add("I");
		vogais.add("O");
		vogais.add("U");
		vogais.add("A");

		System.out.println("Contém a vogal I ? " + vogais.contains("I"));

		System.out.println("Lista das vogais: " + vogais);

	}

	public void ordenarElementos() {

		List<String> lista = new ArrayList<>();
		lista.add("Zico");
		lista.add("Paulo");
		lista.add("Ana");

		// repare que o toString de ArrayList foi sobrescrito:
		System.out.println(lista);

		Collections.sort(lista);

		System.out.println(lista);

	}

	public void ordenarObjetos() {

		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(500);

		ContaCorrente c2 = new ContaCorrente();
		c2.depositar(200);

		ContaCorrente c3 = new ContaCorrente();
		c3.depositar(150);

		List<ContaCorrente> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c3);
		contas.add(c2);

		Collections.sort(contas);

		System.out.println(contas);

	}

}
