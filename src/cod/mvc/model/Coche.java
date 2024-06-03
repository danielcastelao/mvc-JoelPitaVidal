package cod.mvc.model;

public class Coche {

    public String matricula;
    public String modelo;
    public Integer velocidad;
    public Integer v1;
    public Integer v2;

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = 0;
        this.v1=0;
        this.v2=0;
    }

}