package br.tur.reservafacil.fts.controller.error;

public class ErrorInfo {

    public String url;
    public String exception;

    public ErrorInfo() {}

    public ErrorInfo(String url, Exception exception) {
        this.url = url;
        if (exception != null) {
            this.exception = exception.getMessage();
        }
    }

    public String getUrl() {
        return url;
    }

    public String getException() {
        return exception;
    }
}