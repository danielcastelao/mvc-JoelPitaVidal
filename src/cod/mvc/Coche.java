package cod.mvc;

public class Coche {
    String matricula;
    String modelo ;
    Integer velocidad;

    public Coche(String newMarticula, String newModelo,Integer newVelocidad) {
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}


