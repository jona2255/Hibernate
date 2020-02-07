package model;

public class Jugadores {

    private int codigo;
    private String Nombre;
    private String Procedencia;
    private String Altura;
    private int Peso;
    private String Posicion;
    private String Nombre_equipo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String procedencia) {
        Procedencia = procedencia;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String altura) {
        Altura = altura;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String posicion) {
        Posicion = posicion;
    }

    public String getNombre_equipo() {
        return Nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        Nombre_equipo = nombre_equipo;
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "codigo=" + codigo +
                ", Nombre='" + Nombre + '\'' +
                ", Procedencia='" + Procedencia + '\'' +
                ", Altura='" + Altura + '\'' +
                ", Peso=" + Peso +
                ", Posicion='" + Posicion + '\'' +
                ", Nombre_equipo='" + Nombre_equipo + '\'' +
                '}';
    }
}
