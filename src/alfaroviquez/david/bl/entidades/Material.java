package alfaroviquez.david.bl.entidades;

import java.time.LocalDate;

public abstract class Material {
    protected String signatura;
    protected Boolean restringido;
    protected String tema;
    protected LocalDate fechaCompra;

    public String getSignatura() {
        return signatura;
    }

    public void setSignatura(String signatura) {
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

    public Material(String signatura, Boolean restringido, String tema, LocalDate fechaCompra) {
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
