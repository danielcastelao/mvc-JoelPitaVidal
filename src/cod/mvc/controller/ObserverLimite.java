package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class ObserverLimite implements Observer{

    final static int vlimite = 120;


    @Override
    public void update(Coche arg) {

        if (arg.getVelocidad() > vlimite) {
            System.out.println(arg.getVelocidad());
            System.out.println("(ObserverLimite) Velocidad por encima del límite");
            Model.cambiarVelocidad(arg.getMatricula(),Model.getVelocidad(arg.getMatricula())-10);
            System.out.println("La velocidad a sido reducida en 10 km/h");
        }
    }
}