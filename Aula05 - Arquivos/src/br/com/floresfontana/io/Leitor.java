package br.com.floresfontana.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {

	public void ler() {

		try {

			// Leitura de um Arquivo
			FileReader arquivo = new FileReader("java.txt");
			BufferedReader buffer = new BufferedReader(arquivo);

			// Leitura de um Stream
			// InputStreamReader buffer2 = new InputStreamReader(System.in);

			String linha = null;

			while (buffer.ready()) {

				// String caracter = new
				// String(Character.toChars(buffer.read()));
				// System.out.print(caracter);

				linha = buffer.readLine();

				String[] pedacos = linha.split(";");

				System.out.println(linha);

			}

			buffer.close();

			arquivo.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
