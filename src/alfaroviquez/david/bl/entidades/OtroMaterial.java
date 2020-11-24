package alfaroviquez.david.bl.entidades;

import alfaroviquez.david.bl.tipos.formatoAudio;

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

    public OtroMaterial(String sourceLines) {
        String[] datos = sourceLines.split(",");
        this.signatura = Integer.parseInt(datos[0]);
        this.restringido = Boolean.valueOf(datos[1]);
        this.tema = datos[2];
        this.fechaCompra = LocalDate.parse(datos[3]);
        this.descripcion = datos[4];
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

    @Override
    public String toCSVLine() {
        return this.signatura + "," + this.restringido + "," + this.tema + "," + this.fechaCompra + "," + this.descripcion;
    }
}
