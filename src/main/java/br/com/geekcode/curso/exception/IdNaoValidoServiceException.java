package br.com.geekcode.curso.exception;

public class IdNaoValidoServiceException extends RuntimeException {

    public IdNaoValidoServiceException(String message) {
        super(message);
    }
}
