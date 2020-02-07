package model;

public class Partidos {

    private int codigo;
    private String equipo_local;
    private String equipo_visitante;
    private int puntos_local;
    private int puntos_visitante;
    private String temporada;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEquipo_local() {
        return equipo_local;
    }

    public void setEquipo_local(String equipo_local) {
        this.equipo_local = equipo_local;
    }

    public String getEquipo_visitante() {
        return equipo_visitante;
    }

    public void setEquipo_visitante(String equipo_visitante) {
        this.equipo_visitante = equipo_visitante;
    }

    public int getPuntos_local() {
        return puntos_local;
    }

    public void setPuntos_local(int puntos_local) {
        this.puntos_local = puntos_local;
    }

    public int getPuntos_visitante() {
        return puntos_visitante;
    }

    public void setPuntos_visitante(int puntos_visitante) {
        this.puntos_visitante = puntos_visitante;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Partidos{" +
                "codigo=" + codigo +
                ", equipo_local='" + equipo_local + '\'' +
                ", equipo_visitante='" + equipo_visitante + '\'' +
                ", puntos_local=" + puntos_local +
                ", puntos_visitante=" + puntos_visitante +
                ", temporada='" + temporada + '\'' +
                '}';
    }
}
