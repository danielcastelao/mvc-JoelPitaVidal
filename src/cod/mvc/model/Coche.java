package cod.mvc.model;

public class Coche {

    public String matricula;
    public String modelo;
    public Integer velocidad;
    public Integer v;

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = 0;
        this.v=0;
    }

}