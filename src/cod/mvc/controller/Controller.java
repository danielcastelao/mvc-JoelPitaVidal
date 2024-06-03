package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;


public class Controller {

    private final Model miModel = new Model();

    public Controller(Model miModel) {

        ObserverVelocidad ObVelocida = new ObserverVelocidad();
        miModel.addObserver(ObVelocida);

        ObserverLimite ObLimite = new ObserverLimite();
        miModel.addObserver(ObLimite);

    }

    /**
     * Crea un coche
     * @param modelo del coche
     * @param matricula por la que buscar el coche
     */
    public void crearCoche(String modelo, String matricula){
        miModel.crearCoche(matricula,modelo);
    }

    /**
     * Cambiar la velocidad de un coche
     * @param matricula por la que buscar el coche
     * @param velocidad nueva
     * */
    public void cambiarVelocidad(String matricula, Integer velocidad){
        miModel.cambiarVelocidad(matricula, velocidad);
    }



    public void subirVelocidad(String matricula,Integer velocidad){
        miModel.cambiarVelocidad(matricula,30);
        miModel.subirVelocidad(matricula, velocidad);
    }

    public void bajarVelocidad(String matricula,Integer velocidad){
        miModel.cambiarVelocidad(matricula,30);
        miModel.bajarVelocidad(matricula, velocidad);
    }

}