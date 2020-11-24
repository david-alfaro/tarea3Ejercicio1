package alfaroviquez.david.bl.entidades;

import alfaroviquez.david.bl.tipos.tipoContrato;

import java.time.LocalDate;

public class Profesor extends Persona {

    private LocalDate fechaContratacion;
    private tipoContrato contrato;



    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public tipoContrato getContrato() {
        return contrato;
    }

    public void setContrato(tipoContrato contrato) {
        this.contrato = contrato;
    }

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int ID, LocalDate fechaContratacion, tipoContrato contrato) {
        super(nombre, apellido, ID);
        this.fechaContratacion = fechaContratacion;
        this.contrato = contrato;
    }

    public Profesor(String sourceLines){
        String[] datos = sourceLines.split(",");
        this.nombre = datos[0];
        this.apellido = datos[1];
        this.ID = Integer.parseInt(datos[2]);
        this.contrato = tipoContrato.valueOf(datos[3]);
        this.fechaContratacion = LocalDate.parse(datos[4]);

    }
    @Override
    public String toString() {
        return "Profesor{" +
                "fechaContratacion=" + fechaContratacion +
                ", contrato=" + contrato +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ID='" + ID + '\'' +
                "} ";
    }

    @Override
    public String toCSVLine() {
        return this.nombre+","+this.apellido+","+this.ID+","+this.contrato+","+this.fechaContratacion;
    }
}
