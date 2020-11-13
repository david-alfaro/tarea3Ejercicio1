package alfaroviquez.david.bl.entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prestamo {
    private Persona usuario;
    private ArrayList<Material> listaMateriales;
    private LocalDate fechaDevolucion;

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Material> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(ArrayList<Material> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Prestamo() {
    }

    public Prestamo(Persona usuario, ArrayList<Material> listaMateriales, LocalDate fechaDevolucion) {
        this.usuario = usuario;
        this.listaMateriales = listaMateriales;
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "usuario=" + usuario +
                ", listaMateriales=" + listaMateriales +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
