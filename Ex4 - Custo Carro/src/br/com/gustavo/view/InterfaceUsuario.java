package br.com.gustavo.view;

import java.util.List;

import br.com.gustavo.controller.CadastroVeiculos;
import br.com.gustavo.model.Carro;
import br.com.gustavo.util.LeituraConsole;

public class InterfaceUsuario {
	CadastroVeiculos cadastro;

	public InterfaceUsuario() {
		System.out.println("| -------------------------- |");
		System.out.println("| Sistema de Calcular Carros |");
		System.out.println("| -------------------------- |");

		this.cadastro = new CadastroVeiculos();
		this.cadastro.carregarDados();
	}

	private void montarMenu() {

		System.out.println("| Escolha umas das op��es:      |");

		System.out.println("  [ 1 ] Incluir ");
		System.out.println("  [ 2 ] Alterar ");
		System.out.println("  [ 3 ] Excluir ");
		System.out.println("  [ 4 ] Listar ");
		System.out.println("  [ 0 ] Sair ");
	}

	private boolean cadastrarNovo() {
		String nome = LeituraConsole.lerDadoEntradaTexto("Informe o nome:");
		String fabrica = LeituraConsole.lerDadoEntradaTexto("Informe a Fabrica:");
		Double valorTotal = LeituraConsole.lerDadoEntradaNumerico("Valor total do ve�culo");

		return this.cadastro.adicionarCarro(nome, fabrica, valorTotal);
	}

	private void abrirTelaEditar() {

		System.out.println("Informe o c�digo do Carro a ser alterada");
		Integer codigo = LeituraConsole.lerDadoEntradaInteiro();

		System.out.println("C�digo: " + codigo);

		String nome = LeituraConsole.lerDadoEntradaTexto("Informe o nome:");
		String fabrica = LeituraConsole.lerDadoEntradaTexto("Informe a Fabrica:");
		Double valorTotal = LeituraConsole.lerDadoEntradaNumerico("Valor total do ve�culo");

		this.cadastro.alterarCarro(codigo, nome, fabrica, valorTotal);
	}

	private void abrirTelaExcluir() {

		System.out.println("Informe o c�digo do Carro a ser exclu�da");
		Integer codigo = LeituraConsole.lerDadoEntradaInteiro();

		Boolean excluiu = cadastro.removerCarro(codigo);
		if (excluiu) {
			System.out.println("Carro exclu�da com sucesso!");
		} else {
			System.out.println("N�o foi poss�vel excluir. Carro n�o encontrada.");
		}
	}

	private void imprimir() {
		try {
			List<Carro> lista = cadastro.listaCarros();
			System.out.println("-----------------------------------------------------------------------------------------------");
			System.out.println("Codigo\t\tNome\t\tFabrica\t\tCusto Total\t\tCusto F�brica");
			System.out.println("-----------------------------------------------------------------------------------------------");
			for (Carro carro : lista) {
				System.out.println(carro.getId() + "\t\t" + carro.getNome() + "\t\t" + carro.getFabrica() + "\t\t"
						+ carro.getCustoTotal() + "\t\t" + carro.getCustoFabricacao() + "\n\n");
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

	public void ligar() {

		Integer opcao = -1;

		do {
			montarMenu();

			opcao = LeituraConsole.lerDadoEntradaInteiro();

			switch (opcao) {
			case 1:
				cadastrarNovo();
				break;
			case 2:
				abrirTelaEditar();
				break;
			case 3:
				abrirTelaExcluir();
				break;
			case 4:
				imprimir();
				break;
			case 0:
				break;
			default:
				System.out.println("Op��o incorreta! Tente novamente.");
				break;
			}

		} while (opcao != 0);
	}

}
