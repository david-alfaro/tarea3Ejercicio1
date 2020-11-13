package alfaroviquez.david.bl.entidades;

import java.time.LocalDate;

public class OtroMaterial extends Material {
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public OtroMaterial() {
    }

    public OtroMaterial(int signatura, Boolean restringido, String tema, LocalDate fechaCompra, String descripcion) {
        super(signatura, restringido, tema, fechaCompra);
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "OtroMaterial{" +
                "descripcion='" + descripcion + '\'' +
                ", signatura='" + signatura + '\'' +
                ", restringido=" + restringido +
                ", tema='" + tema + '\'' +
                ", fechaCompra=" + fechaCompra +
                "} " + super.toString();
    }
}
