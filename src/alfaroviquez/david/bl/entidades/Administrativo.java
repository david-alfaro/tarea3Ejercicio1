package alfaroviquez.david.bl.entidades;

import alfaroviquez.david.bl.interfaces.SerializacionCSV;
import alfaroviquez.david.bl.tipos.tipoNombramiento;

public class Administrativo extends Persona  {
    private tipoNombramiento nombramiento;
    private int horasAsignadas;

    public tipoNombramiento getNombramiento() {
        return nombramiento;
    }

    public void setNombramiento(tipoNombramiento nombramiento) {
        this.nombramiento = nombramiento;
    }

    public int getHorasAsignadas() {
        return horasAsignadas;
    }

    public void setHorasAsignadas(int horasAsignadas) {
        this.horasAsignadas = horasAsignadas;
    }

    public Administrativo() {
    }

    public Administrativo(String nombre, String apellido, int ID, tipoNombramiento nombramiento, int horasAsignadas) {
        super(nombre, apellido, ID);
        this.nombramiento = nombramiento;
        this.horasAsignadas = horasAsignadas;
    }
    public Administrativo(String sourcelines){
        String[] datos = sourcelines.split(",");
        this.nombre=datos[0];
        this.apellido = datos[1];
        this.ID = Integer.parseInt(datos[2]);
        this.nombramiento = tipoNombramiento.valueOf(datos[3]);
        this.horasAsignadas = Integer.parseInt(datos[4]);
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "nombramiento=" + nombramiento +
                ", horasAsignadas=" + horasAsignadas +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ID='" + ID + '\'' +
                "} ";
    }

    @Override
    public String toCSVLine() {
        return this.nombre+","+this.apellido+","+this.ID+","+this.nombramiento+","+this.horasAsignadas;
    }
}
