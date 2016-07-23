package br.com.floresfontana.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritor {

	public void criarDiretorio(String nome) {

		// Files.move(source, target, options);
		// Files.getLastModifiedTime(path, options);

		File dir = new File(nome);

		if (!dir.exists()) {
			dir.mkdirs();
		}

	}

	public void escrever(String pasta) {

		try {

			// Incluir texto no final do arquivo, caso exista o arquivo
			// FileWriter arquivo = new FileWriter("saida.txt", true);

			String arq = "";
			if (pasta != null) {
				arq = pasta + "/";
			}
			arq += "saida.txt";
			
			FileWriter arquivo = new FileWriter(arq, false);
			BufferedWriter buffer = new BufferedWriter(arquivo);

			String linha = "";

			// Classe utilitária para fazer leituras do console
			Scanner in = new Scanner(System.in);

			System.out.println("Escreva o conteúdo do arquivo: ");
			linha = in.nextLine();

			buffer.append(linha);
			buffer.newLine();

			buffer.close();

			in.close();

			System.out.println("Arquivo gravado com sucesso!");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
}
