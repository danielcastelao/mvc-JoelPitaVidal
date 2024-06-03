package cod.mvc.controller;
import cod.mvc.model.Coche;
import cod.mvc.view.View;

public class ObserverVelocidad implements Observer{
    /**
     * Notifica a la clase view cuando se realiza un cambio de velocidad de un coche
     * @param coche el objeto tipo coche que se a actualizado
     */
    @Override
    public void update(Coche coche) {
        View.muestraVelocidad(coche.matricula,coche.velocidad);
    }
    @Override
    public void velocidad(Coche coche){
        View.velocidadSubida(coche.velocidad,coche.v1);
    }

    @Override
    public void velocidadMenos(Coche coche) {
        View.velocidadBajada(coche.velocidad,coche.v2);
    }
}