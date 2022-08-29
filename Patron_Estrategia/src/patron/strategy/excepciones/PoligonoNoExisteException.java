package patron.strategy.excepciones;

// Excepcion para polígonos que no existen.
public class PoligonoNoExisteException extends Exception {

    public PoligonoNoExisteException() {
        super("El polígono no existe.");
    }

    public PoligonoNoExisteException(String string) {
        super(string);
    }

}

