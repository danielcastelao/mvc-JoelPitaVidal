package cod.mvc;

import cod.mvc.controller.Controller;
import cod.mvc.model.Model;

public class App {
    public static void main(String[] args) {
        Model miModel = new Model();

        Controller miController = new Controller(miModel);

        miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");

        miController.cambiarVelocidad("SBC 1234", 30);
        miController.cambiarVelocidad("HYU 4567", 150);

        miModel.buscarCoche();

    }
}