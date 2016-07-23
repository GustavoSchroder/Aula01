package br.com.floresfontana.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Calculadora {

	private Double valor;

	public Calculadora() {
		super();
		this.valor = 0.0;
	}

	public void calculadora() {
		String operacao = "";
		String log = "";
		try {

			// Leitura de um Arquivo
			FileReader arquivo = new FileReader("calcular.txt");
			BufferedReader reader = new BufferedReader(arquivo);

			// Leitura de um Stream
			// InputStreamReader buffer2 = new InputStreamReader(System.in);

			String linha = null;

			while (reader.ready()) {

				// String caracter = new
				// String(Character.toChars(buffer.read()));
				// System.out.print(caracter);

				linha = reader.readLine();

				if (linha.contains(";")) {
					String[] pedacos = linha.split(";");
					if (operacao.equals("")) {
						throw new IOException("Nenhuma operação foi definida");
					} else {
						for (int i = 0; i < pedacos.length; i++) {
							log += retornaLogOp(operacao, valor, Integer.parseInt(pedacos[i].trim()));
							valor = calcular(operacao, valor, Integer.parseInt(pedacos[i].trim()));
						}
					}
				} else {
					operacao = linha.trim();
				}
			}
			escrever(log, "\n\n" + "Resultado da operação: " + valor);
			reader.close();
			arquivo.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void escrever(String log, String value) {

		String pasta = "Resulucao";

		File dir = new File(pasta);

		if (!dir.exists()) {
			dir.mkdirs();
		}

		try {
			String arq = "";
			if (pasta != null) {
				arq = pasta + "/";
			}
			arq += "saida.txt";

			FileWriter arquivo = new FileWriter(arq, false);
			BufferedWriter buffer = new BufferedWriter(arquivo);
			log += value;
			buffer.append(log);
			buffer.newLine();

			buffer.close();

			System.out.println("Arquivo gravado com sucesso!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public String retornaLogOp(String operacao, Double nu1, Integer nu2){
		Double n1 = nu1;
		Integer n2 = nu2;
		if (operacao.equals("/")) {
			return ("Divisao de " + n1 + " por " + n2 + " ->  " +  n1 / n2 + "\n");
		} else if (operacao.equals("+")) {
			return ("Soma de " + n1 + " por " + n2 + " ->  " + (n1 + n2) + "\n");
		} else if (operacao.equals("-") ) {
			return ("Subt de " + n1 + " por " + n2 + " ->  "+  (n1 - n2) + "\n");
		} else {
			return ("Mult de " + n1 + " por " + n2 + " ->  "+  (n1 - n2) + "\n");
		}
	}

	public Double calcular(String operacao, Double n1, Integer n2) {
		if (operacao.equals("/")) {
			return n1 / n2;
		} else if (operacao.equals("+")) {
			return n1 + n2;
		} else if (operacao.equals("-")) {
			return n1 - n2;
		} else {
			return n1 * n2;
		}
	}
	
	public static void main (String [] args){
		Calculadora c = new Calculadora();
		c.calculadora();
	}
}
