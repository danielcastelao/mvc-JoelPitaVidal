package cod.mvc.view;

import cod.mvc.model.Model;

public class View {
    /**
     * Muestra la velocidad actual del coche cuya matricula se le haya proporcionado
     * @param matricula identificador unico del coche
     * @param velocidad variable que se quiere mostrar
     */
    public static void muestraVelocidad(String matricula,int velocidad){
        System.out.println("La velocidad del coche con matricula "+matricula+", es "+ velocidad+" Km/h");
    }

    public static void velocidadSubida(Integer velocidad,Integer v1){
        System.out.println("La velocidad del coche a subido de "+velocidad+" hasta "+v1+" Km/h ");
    }

    public static void velocidadBajada(Integer velocidad,Integer v2){
        System.out.println("LA velocidad del coche a bajado de "+velocidad+" hasta "+v2+" Km/h");
    }
}