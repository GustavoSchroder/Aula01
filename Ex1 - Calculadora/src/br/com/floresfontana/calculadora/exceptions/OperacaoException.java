package br.com.floresfontana.calculadora.exceptions;

public class OperacaoException extends Exception {

	public OperacaoException() {

		super("Operação não cadastrada! Tente novamente.");

	}

	public OperacaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public OperacaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public OperacaoException(String message) {
		super(message);
	}

	public OperacaoException(Throwable cause) {
		super(cause);
	}

}
