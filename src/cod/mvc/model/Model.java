package cod.mvc.model;

import cod.mvc.App;
import cod.mvc.controller.Observer;

import java.util.ArrayList;
import java.util.Scanner;

public class Model implements Observable {

    public static ArrayList<Coche> parking = new ArrayList<>();

    public static ArrayList<Observer> observers = new ArrayList<>();

    /**
     * Añade un objecto de tipo observer al arraylist [observers]
     * @param observer objecto a añadir al list
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Elimina un objecto de tipo observer del arraylist [observers]
     * @param observer objecto a eliminar del list
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Recorre los observers del arraylist y los notifica de un cambio
     * @param coche el objecto en el que se ha producido un cambio
     */
    public void notifyObservers(Coche coche) {
        for(Observer observer : observers){
            observer.update(coche);
            observer.velocidad(coche);
        }
    }

    /**
     * Crea un coche con los parametros especificados
     * @param matricula variable para el nuevo objecto
     * @param modelo variable para el nuevo objecto
     * @return coche creado
     */

    public Coche crearCoche(String matricula,String modelo){
        Coche cocheNuevo = new Coche(matricula,modelo);
        parking.add(cocheNuevo);
        return cocheNuevo;
    }

    /**
     * Busca un coche por matricula y lo retorna de haberlo encontrado
     * @param matricula identificador unico del coche
     * @return coche encontrado o null en caso de no existir el coche
     */
    public Coche getCoche(String matricula) {
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
     * */
    public Integer cambiarVelocidad(String matricula,Integer velocidad){
        Coche coche = getCoche(matricula);
        coche.velocidad = velocidad;
        notifyObservers(coche);
        return coche.velocidad;
    }




    /**
     * método subirVelocidad
     *
     */
    public Integer subirVelocidad(String matricula,Integer v){
        Coche coche = getCoche(matricula);
        coche.v = coche.velocidad + 10;
        notifyObservers(coche);
        return coche.v;
    }

    /**
     * Retorna la velocidad del coche especificado
     * @param matricula identificador unico del coche
     * @return velocidad del coche
     */
    public Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        return coche.velocidad;
    }

    /**
     * En mi código lo que ocurre es que se crean
     * automáticamente dos coches, por lo que
     * el proceso es pedir al usuário por consola
     * que escriba la matrícula del coche deseado
     * para en un if comparar la matrícula que el usuário
     * escribe con las que se crean, y si hay una coincidencia
     * con las que ya hay se muestran los datos del coche
     * en cuestion
     */

    public void buscarCoche () {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserte la matrícula del coche que deséa buscar");
        String buscador= sc.nextLine();
        String mat1 = "SBC 1234";
        String mat2 = "HYU 4567";
            if (buscador.equals(mat1)) {
                System.out.println("el coche es modelo LaFerrari, y tiene una velocidad de 30km/h");
            } else if (buscador.equals(mat2)) {
                System.out.println("El coche es un modelo Alpine, y tiene una velocidad de 150km/h");
            }else {
                System.out.println("Coche no encontrado");
            }
     }

}