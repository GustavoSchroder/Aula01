package br.com.flexxo.fluxo;

public class Decisao {

	public static void main(String args[]) {

		boolean imprimir = true;

		if (imprimir) {

			System.out.println("Imprimindo...");

		} else {

			// nada

		}

		int mes = 8;
		String mesTexto;
		
		switch (mes) {
		case 1:
			mesTexto = "Janeiro";
			break;
		case 2:
			mesTexto = "Fevereiro";
			break;
		case 3:
			mesTexto = "Março";
			break;
		case 4:
			mesTexto = "Abril";
			break;
		case 5:
			mesTexto = "Maio";
			break;
		case 6:
			mesTexto = "Junho";
			break;
		case 7:
			mesTexto = "Julho";
			break;
		case 8:
			mesTexto = "Agosto";
			break;
		case 9:
			mesTexto = "Setembro";
			break;
		case 10:
			mesTexto = "Outubro";
			break;
		case 11:
			mesTexto = "Novembro";
			break;
		case 12:
			mesTexto = "Dezembro";
			break;
		default:
			mesTexto = "Mês não encontrado";
			break;
		}
		
		System.out.println(mesTexto);

	}

}
