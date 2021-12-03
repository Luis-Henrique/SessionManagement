package br.com.luish.management.services.exceptions;

public class ObjectDuplicated extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ObjectDuplicated(String msg) {
		super(msg);
	}

	public ObjectDuplicated(String msg, Throwable throwable) {
		super(msg, throwable);
	}

}
