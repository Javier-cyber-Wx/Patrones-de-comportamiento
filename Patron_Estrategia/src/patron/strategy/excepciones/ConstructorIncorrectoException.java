package patron.strategy.excepciones;

// Excepción de constructor incorrecto.
public class ConstructorIncorrectoException extends Exception {

    public ConstructorIncorrectoException() {
        super("El constructor utilizado no se corresponde con la figura.");
    }

}
