package br.com.floresfontana.calculadora.exceptions;

public class DivisaoZeroException extends Exception {

	public DivisaoZeroException() {

		super("Divisão por zero não permitido! Tente novamente.");

	}

	public DivisaoZeroException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DivisaoZeroException(String message, Throwable cause) {
		super(message, cause);
	}

	public DivisaoZeroException(String message) {
		super(message);
	}

	public DivisaoZeroException(Throwable cause) {
		super(cause);
	}

}
