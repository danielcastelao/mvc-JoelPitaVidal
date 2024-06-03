package cod.mvc.controller;
import cod.mvc.model.Coche;

public interface Observer {
    void update(Coche arg);
    void velocidad(Coche arg);
    void velocidadMenos(Coche arg);
}