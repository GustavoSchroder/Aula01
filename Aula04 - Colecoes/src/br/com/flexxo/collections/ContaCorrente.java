package br.com.flexxo.collections;

public class ContaCorrente implements Comparable<ContaCorrente> {

	private int saldo;

	public void depositar(int valor) {
		this.saldo = valor;
	}

	public int compareTo(ContaCorrente outra) {
		if (this.saldo < outra.saldo) {
			return -1;
		}

		if (this.saldo > outra.saldo) {
			return 1;
		}

		return 0;
	}

	@Override
	public String toString() {
		return "Saldo: " + saldo;
	}

}
