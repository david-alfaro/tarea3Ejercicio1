package alfaroviquez.david.controlador;

import alfaroviquez.david.bl.entidades.Administrativo;
import alfaroviquez.david.bl.entidades.Estudiante;
import alfaroviquez.david.bl.entidades.Profesor;
import alfaroviquez.david.bl.logica.Gestor;
import alfaroviquez.david.ui.IU;

import java.time.LocalDate;

public class Controlador {
    private IU interfaz = new IU();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            interfaz.imprimirMenu();
            opcion = interfaz.leerNumero();
            procesarOpcion(opcion);
        } while (opcion != 9);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarEstudiante();
                break;
            case 2:
                registrarProfesor();
                break;
            case 3:
                registrarAdministrativo();
                break;
            case 4:
                listarEstudiantes();
                break;
            case 5:
                listarProfesores();
                break;
            case 6:
                listarAdministrativos();
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                interfaz.imprimirMensaje("Opcion invalida");
        }
    }

    private void registrarEstudiante() {
        interfaz.imprimirMensaje("REGISTRAR ESTUDIANTE");
        interfaz.imprimirMensaje("Nombre del estudiante: ");
        String nombre = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Apellido del estudiante: ");
        String apellido = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Carnet: ");
        int carne = interfaz.leerNumero();
        interfaz.imprimirMensaje("Carrera matriculada: ");
        String carrera = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Creditos matriculados: ");
        int creditos = interfaz.leerNumero();
        gestor.crearEstudiante(nombre, apellido, carne, carrera, creditos);
        interfaz.imprimirMensaje("Estudiante registrado con exito");
    }

    private void listarEstudiantes() {
        for (Estudiante unEstudiante : gestor.listarEstudiantes()
        ) {
            interfaz.imprimirMensaje(unEstudiante.toString());

        }
    }

    private void registrarProfesor() {
        interfaz.imprimirMensaje("REGISTRAR PROFESOR");
        interfaz.imprimirMensaje("Nombre del profesor: ");
        String nombre = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Apellido del profesor: ");
        String apellido = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Cedula (ID): ");
        int ID = interfaz.leerNumero();
        interfaz.imprimirMensaje("Fecha de contratacion (yyyy-MM-dd): ");
        String fecha = interfaz.leerMensaje();
        LocalDate fechaContratacion = obtenerFecha(fecha);
        interfaz.imprimirMensaje("Tipo de contrato (TIEMPO_COMPLETO, MEDIO_TIEMPO): ");
        String contrato = interfaz.leerMensaje();
        gestor.crearProfesor(nombre, apellido, ID, fechaContratacion, contrato);
        interfaz.imprimirMensaje("Profesor registrado con exito");
    }

    private void listarProfesores() {
        for (Profesor unProfesor : gestor.listarProfesores()
        ) {
            interfaz.imprimirMensaje(unProfesor.toString());
        }
    }

    private void registrarAdministrativo() {
        interfaz.imprimirMensaje("REGISTRAR Administrativo");
        interfaz.imprimirMensaje("Nombre: ");
        String nombre = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Apellido: ");
        String apellido = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Cedula (ID): ");
        int ID = interfaz.leerNumero();
        interfaz.imprimirMensaje("Tipo de nombramiento (A,B,C): ");
        String tipoNombramiento = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Horas semanales asignadas: ");
        int cantHoras = interfaz.leerNumero();
        gestor.crearAdministrativo(nombre, apellido, ID, tipoNombramiento, cantHoras);
        interfaz.imprimirMensaje("Persona Administrativa registrada con exito");

    }

    private void listarAdministrativos() {
        for (Administrativo unAdministrarivo: gestor.listarAdministrativos()
             ){
            interfaz.imprimirMensaje(unAdministrarivo.toString());
        }
    }

    private LocalDate obtenerFecha(String fecha) {
        return LocalDate.parse(fecha);
    }
}
