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

    public Profesor(String nombre, String apellido, String ID, LocalDate fechaContratacion, tipoContrato contrato) {
        super(nombre, apellido, ID);
        this.fechaContratacion = fechaContratacion;
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "fechaContratacion=" + fechaContratacion +
                ", contrato=" + contrato +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ID='" + ID + '\'' +
                "} " + super.toString();
    }
}
