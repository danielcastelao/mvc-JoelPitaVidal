package cod.mvc;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Model {

    private static ArrayList<Coche> parking= new ArrayList<>();

    public static ArrayList<Coche> crearCoche (String newMatricula, String newModelo, Integer newVelocidad){
    parking.add (new Coche (newMatricula , newModelo , newVelocidad));
    return parking;

    }
}
