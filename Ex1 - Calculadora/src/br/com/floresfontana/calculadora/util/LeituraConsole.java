package br.com.floresfontana.calculadora.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LeituraConsole {

	public static Integer lerDadoEntradaInteiro() {
		return (Integer) lerDadoEntrada("Inteiro", null);
	}

	public static Integer lerDadoEntradaInteiro(String mensagem) {
		return (Integer) lerDadoEntrada("Inteiro", mensagem);
	}

	public static Double lerDadoEntradaNumerico(String mensagem) {
		return (Double) lerDadoEntrada("Numerico", mensagem);
	}

	public static String lerDadoEntradaTexto(String mensagem) {
		return (String) lerDadoEntrada("Texto", mensagem);
	}

	public static Calendar lerDadoEntradaData(String mensagem) {
		return (Calendar) lerDadoEntrada("Data", mensagem);
	}

	private static Object lerDadoEntrada(String tipoValorEntrada, String mensagem) {

		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			if (mensagem != null)
				System.out.println(mensagem);

			Object opcao = null;

			do {
				try {

					switch (tipoValorEntrada) {
					case "Inteiro":
						opcao = Integer.valueOf(reader.readLine());
						break;
					case "Numerico":
						opcao = Double.valueOf(reader.readLine());
						break;
					case "Data":

						try {
							String dataDigitada = reader.readLine();

							DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

							Calendar dataConvertida = Calendar.getInstance();
							dataConvertida.setTime(sdf.parse(dataDigitada));

							opcao = dataConvertida;

						} catch (ParseException e) {
							e.printStackTrace();
						}
						break;

					default:
						opcao = reader.readLine();
					}
				} catch (NumberFormatException e) {
					System.out.println("Valor não é " + tipoValorEntrada + ", favor digite novamente!");
				}
			} while (opcao == null);

			return opcao;

		} catch (IOException e) {
			return 0;
		}

	}

}
