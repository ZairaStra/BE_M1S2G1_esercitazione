package ES3.exceptions;

//alla creazione della classe di default estendeva da RuntimeException, ma in quel caso è unchecked giusto???

public class BancaException extends Exception {
    public BancaException(String message) {
        super(message);
    }
}
