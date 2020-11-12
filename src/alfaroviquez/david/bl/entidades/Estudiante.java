package alfaroviquez.david.bl.entidades;

public class Estudiante extends Persona {

    private String carne;
    private String carrera;
    private int creditos;

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String carne, String carrera, int creditos) {
        super(nombre, apellido);
        this.carne = carne;
        this.carrera = carrera;
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carne='" + carne + '\'' +
                ", carrera='" + carrera + '\'' +
                ", creditos=" + creditos +
                "} " + super.toString();
    }
}
