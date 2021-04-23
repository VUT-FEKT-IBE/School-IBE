package com.vutbr.feec.cviceni3.CustomExceptions;

public class chyba extends RuntimeException {
	public chyba(String message) {
		throw new NullPointerException(message);
	}

	public chyba(String message, Throwable cause) {

	}

	public chyba(Throwable cause) {

	}

	public chyba(String message, Throwable cause, boolean enableSuppresion, boolean writableStackTrace) {

	}

	public chyba() {

	}

}
