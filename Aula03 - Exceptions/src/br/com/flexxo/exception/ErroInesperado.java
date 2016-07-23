package br.com.flexxo.exception;

public class ErroInesperado extends RuntimeException {

	public ErroInesperado() {
		super("Ocorreu um erro inesperado");
	}

	public ErroInesperado(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ErroInesperado(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ErroInesperado(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ErroInesperado(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	


}
