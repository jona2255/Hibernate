package model;

public class Estadisticas {

    private String temporada;
    private int jugador;
    private float Puntos_por_partido;
    private float Asistencias_por_partido;
    private float Tapones_por_partido;
    private float Rebotes_por_partido;

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    public float getPuntos_por_partido() {
        return Puntos_por_partido;
    }

    public void setPuntos_por_partido(float puntos_por_partido) {
        Puntos_por_partido = puntos_por_partido;
    }

    public float getAsistencias_por_partido() {
        return Asistencias_por_partido;
    }

    public void setAsistencias_por_partido(float asistencias_por_partido) {
        Asistencias_por_partido = asistencias_por_partido;
    }

    public float getTapones_por_partido() {
        return Tapones_por_partido;
    }

    public void setTapones_por_partido(float tapones_por_partido) {
        Tapones_por_partido = tapones_por_partido;
    }

    public float getRebotes_por_partido() {
        return Rebotes_por_partido;
    }

    public void setRebotes_por_partido(float rebotes_por_partido) {
        Rebotes_por_partido = rebotes_por_partido;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "temporada='" + temporada + '\'' +
                ", jugador=" + jugador +
                ", Puntos_por_partido=" + Puntos_por_partido +
                ", Asistencias_por_partido=" + Asistencias_por_partido +
                ", Tapones_por_partido=" + Tapones_por_partido +
                ", Rebotes_por_partido=" + Rebotes_por_partido +
                '}';
    }
}
