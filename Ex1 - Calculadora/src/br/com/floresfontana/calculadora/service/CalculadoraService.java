package br.com.floresfontana.calculadora.service;

import java.util.List;

import br.com.floresfontana.calculadora.exceptions.DivisaoZeroException;
import br.com.floresfontana.calculadora.exceptions.OperacaoException;

public class CalculadoraService {

    public Double somar(Double d1, Double d2) {

	return d1 + d2;

    }

    public Double subtrair(Double d1, Double d2) {

	return d1 - d2;

    }

    public Double dividir(Double d1, Double d2) throws DivisaoZeroException {

	if (d2 == 0)
	    throw new DivisaoZeroException();

	return d1 / d2;

    }

    public Double multiplicar(Double d1, Double d2) {

	return d1 * d2;

    }

    public Double calcularListaValores(List<Double> lista, String operacao) {

	Double resultado = 0.0;

	for (Double d : lista) {

	    switch (operacao) {
	    case "+":
		resultado += d;
		break;
	    case "-":
		if (resultado == 0.0) {
		    resultado = d;
		} else {
		    resultado -= d;
		}
		break;
	    case "*":
		if (resultado != 0.0) {
		    resultado *= d;
		} else {
		    resultado = d;
		}
		break;
	    case "/":
		if (resultado != 0.0) {
		    resultado /= d;
		} else {
		    resultado = d;
		}
		break;
	    }
	}

	return resultado;
    }

    public void validarOperacao(String operacao) throws OperacaoException {

	if (operacao.indexOf(" + - * / ") < 0) {
	    throw new OperacaoException();
	}
    }

}
