import cod.mvc.controller.Controller;
import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    private Controller controller;
    private Model model;

    @BeforeEach
    void setUp() {
        model = new Model();
        controller = new Controller(model);
    }

    @Test
    void testCrearCoche() {
        String modelo = "Toyota";
        String matricula = "1234ABC";
        controller.crearCoche(modelo, matricula);

        Coche coche = model.buscarCoche(matricula);
        assertNotNull(coche, "El coche debería existir");
        assertEquals(modelo, coche.getModelo(), "El modelo del coche debería ser Toyota");
    }

    @Test
    void testCambiarVelocidad() {
        String modelo = "Toyota";
        String matricula = "1234ABC";
        controller.crearCoche(modelo, matricula);

        Integer nuevaVelocidad = 80;
        controller.cambiarVelocidad(matricula, nuevaVelocidad);

        Coche coche = model.buscarCoche(matricula);
        assertNotNull(coche, "El coche debería existir");
        assertEquals(nuevaVelocidad, coche.getVelocidad(), "La velocidad del coche debería ser 80");
    }

    @Test
    void testSubirVelocidad() {
        String modelo = "Toyota";
        String matricula = "1234ABC";
        controller.crearCoche(modelo, matricula);

        Integer incremento = 20;
        controller.subirVelocidad(matricula, incremento);

        Coche coche = model.buscarCoche(matricula);
        assertNotNull(coche, "El coche debería existir");
        assertEquals(Integer.valueOf(50), coche.getVelocidad(), "La velocidad del coche debería ser 50");
    }

    @Test
    void testBajarVelocidad() {
        String modelo = "Toyota";
        String matricula = "1234ABC";
        controller.crearCoche(modelo, matricula);

        Integer decremento = 10;
        controller.bajarVelocidad(matricula, decremento);

        Coche coche = model.buscarCoche(matricula);
        assertNotNull(coche, "El coche debería existir");
        assertEquals(Integer.valueOf(20), coche.getVelocidad(), "La velocidad del coche debería ser 20");
    }
}