
package cod.mvc;

import java.util.ArrayList;

public class Model {

    public static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche con los parametros especificados
     * @param matricula variable para el nuevo objecto
     * @param modelo variable para el nuevo objecto
     * @param velocidad variable para el nuevo objecto
     * @return coche creado
     */


    public static Coche crearCoche(String matricula,String modelo,Integer velocidad){
        Coche cocheNuevo = new Coche(matricula,modelo,velocidad);
        parking.add(cocheNuevo);
        return cocheNuevo;
    }

    /**
     * Busca un coche por matricula y lo retorna de haberlo encontrado
     * @param matricula identificador unico del coche
     * @return coche encontrado o null en caso de no existir el coche
     */
    public static Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    /**
     * Cambia la velocidad del coche cuya matricula a sido especificada
     * @param matricula identificador unico del coche
     * @param velocidad variable por la que cambiar la velocidad
     * @return nueva velocidad
     */
    public static Integer cambiarVelocidad(String matricula,Integer velocidad){
        Coche coche = getCoche(matricula);
        coche.velocidad = velocidad;
        return coche.velocidad;
    }

    /**
     * Retorna la velocidad del coche especificado
     * @param matricula identificador unico del coche
     * @return velocidad del coche
     */
    public static Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        return coche.velocidad;
    }
}