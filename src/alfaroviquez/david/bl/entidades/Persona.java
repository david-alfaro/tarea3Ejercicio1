package alfaroviquez.david.bl.entidades;

import alfaroviquez.david.bl.interfaces.SerializacionCSV;

public abstract class Persona implements SerializacionCSV {
    protected String nombre;
    protected String apellido;
    protected int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, int ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    public Persona(String sourceLineas){
        String[] datos = sourceLineas.split(",");
        this.nombre = datos[0];
        this.apellido=datos[1];
        this.ID = Integer.parseInt(datos[2]);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }


}
