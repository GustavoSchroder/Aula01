package br.com.flexxo.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.flexxo.exception.ErroInesperado;

public class Programa {

	private List<Integer> list;
	private static final int SIZE = 10;

	public Programa() {

		list = new ArrayList<Integer>(SIZE);

		for (int i = 0; i < SIZE; i++) {
			list.add(new Integer(i));
		}

	}

	public void executar(String[] args) throws ErroInesperado {

		// Implicitas
		String valor = args[2];
		String variavel = "flexxo";
		// está sendo chamado o equals porém não é garantido que a variavel
		// valor será diferente de null

		if (variavel.equals(valor)) {
			System.out.println("Sucesso!");

		} else {

			System.out.println("Erro!");
		}

		try {

			writeList();

		} catch (IOException e) {

			throw new ErroInesperado();

		}

	}

	public Integer writeList() throws IOException {

		Integer cont = 0;

		try {

			// Checked Exception
			// O FileWriter throws IOException, deve ser tratado
			PrintWriter out = new PrintWriter(new FileWriter("e:/saida.txt"));
			
			// Unchecked
			for (int i = 0; i < SIZE + 8; i++) {
					// O get(int) throws IndexOutOfBoundsException, deve ser tratado
					out.println("Value at: " + i + " = " + list.get(i));

			}

			out.close();
			cont = list.size();

		} catch (Exception e) {

			System.out.println("arquivo e:/saida.txt nao esta acessivel" );
			
			throw e;
			

		}

		return cont;
	}
	
	
	
	
	

	public void testar() {

		if (1 != 2) {

			throw new ErroInesperado();

		}
	}
	
	
	
	
	
	
	

}
