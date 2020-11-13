package alfaroviquez.david.bl.entidades;

public class Persona {
    protected String nombre;
    protected String apellido;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    protected String ID;

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

    public Persona(String nombre, String apellido, String ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
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
