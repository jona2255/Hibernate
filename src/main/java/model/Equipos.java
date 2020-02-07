package model;

public class Equipos {

    private String Nombre;
    private String Ciudad;
    private String Conferencia;
    private String Division;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getConferencia() {
        return Conferencia;
    }

    public void setConferencia(String conferencia) {
        Conferencia = conferencia;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "Nombre='" + Nombre + '\'' +
                ", Ciudad='" + Ciudad + '\'' +
                ", Conferencia='" + Conferencia + '\'' +
                ", Division='" + Division + '\'' +
                '}';
    }
}
