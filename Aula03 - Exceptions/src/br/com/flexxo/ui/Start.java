package br.com.flexxo.ui;

import java.io.IOException;

import br.com.flexxo.exception.ErroInesperado;
import br.com.flexxo.service.Programa;

public class Start {

	public static void main(String[] args) {

		Programa p = new Programa();

		try {
			p.testar();
		} catch (ErroInesperado e) {

			System.out.println("Oi usuario: " + e.getMessage());

		}

	}

}
