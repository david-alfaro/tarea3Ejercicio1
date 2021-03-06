package alfaroviquez.david.bl.entidades;

import alfaroviquez.david.bl.interfaces.SerializacionCSV;

import java.time.LocalDate;

public abstract class Material implements SerializacionCSV {
    protected int signatura;
    protected Boolean restringido;
    protected String tema;
    protected LocalDate fechaCompra;

    public int getSignatura() {
        return signatura;
    }

    public void setSignatura(int signatura) {
        this.signatura = signatura;
    }

    public Boolean getRestringido() {
        return restringido;
    }

    public void setRestringido(Boolean restringido) {
        this.restringido = restringido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Material() {
    }

    public Material(int signatura, Boolean restringido, String tema, LocalDate fechaCompra) {
        this.signatura = signatura;
        this.restringido = restringido;
        this.tema = tema;
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Material{" +
                "signatura='" + signatura + '\'' +
                ", restringido=" + restringido +
                ", tema='" + tema + '\'' +
                ", fechaCompra=" + fechaCompra +
                '}';
    }


}
