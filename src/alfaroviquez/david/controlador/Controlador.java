package alfaroviquez.david.controlador;

import alfaroviquez.david.bl.entidades.*;
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
        } while (opcion != 17);
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
                registrarTexto();
                break;
            case 8:
                registrarAudio();
                break;
            case 9:
                registrarVideo();
                break;
            case 10:
                registrarOtroMaterial();
                break;
            case 11:
                listarTextos();
                break;
            case 12:
                listarAudios();
                break;
            case 13:
                listarVideos();
                break;
            case 14:
                listarOtroMaterial();
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
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
        for (Administrativo unAdministrarivo : gestor.listarAdministrativos()
        ) {
            interfaz.imprimirMensaje(unAdministrarivo.toString());
        }
    }

    private void registrarTexto() {
        interfaz.imprimirMensaje("REGISTRAR MATERIAL DE TEXTO");
        interfaz.imprimirMensaje("Ingrese la signatura (ID): ");
        int signatura = interfaz.leerNumero();
        interfaz.imprimirMensaje("Material restringido ? (y/n): ");
        String respuesta = interfaz.leerMensaje();
        boolean restringido = false;
        if (respuesta.equalsIgnoreCase("y")) {
            restringido = true;
        } else {
            restringido = false;
        }
        interfaz.imprimirMensaje("Tema del texto: ");
        String tema = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Fecha de compra (yyyy-MM-dd): ");
        String fecha = interfaz.leerMensaje();
        LocalDate fechaCompra = obtenerFecha(fecha);
        interfaz.imprimirMensaje("Titulo del texto: ");
        String titulo = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Nombre del autor: ");
        String autor = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Idioma: ");
        String idioma = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Fecha de publicacion (yyyy-MM-dd): ");
        String publicacion = interfaz.leerMensaje();
        LocalDate fechapublicacion = obtenerFecha(publicacion);
        interfaz.imprimirMensaje("Cantidad de paginas: ");
        int paginas = interfaz.leerNumero();
        gestor.crearMaterialTexto(signatura, restringido, tema, fechaCompra, titulo, autor, fechapublicacion, paginas, idioma);
        interfaz.imprimirMensaje("Material registrado con exito");
    }

    private void listarTextos() {
        for (Texto unTexto : gestor.listarTextos()
        ) {
            interfaz.imprimirMensaje(unTexto.toString());
        }
    }

    private void registrarAudio() {
        interfaz.imprimirMensaje("REGISTRAR MATERIAL DE AUDIO");
        interfaz.imprimirMensaje("Ingrese la signatura (ID): ");
        int signatura = interfaz.leerNumero();
        interfaz.imprimirMensaje("Material restringido ? (y/n): ");
        String respuesta = interfaz.leerMensaje();
        boolean restringido = false;
        if (respuesta.equalsIgnoreCase("y")) {
            restringido = true;
        } else {
            restringido = false;
        }
        interfaz.imprimirMensaje("Tema del texto: ");
        String tema = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Fecha de compra (yyyy-MM-dd): ");
        String fecha = interfaz.leerMensaje();
        LocalDate fechaCompra = obtenerFecha(fecha);
        interfaz.imprimirMensaje("Idioma: ");
        String idioma = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Duracion: ");
        int duracion = interfaz.leerNumero();
        interfaz.imprimirMensaje("Formato (CASETE,CD,DVD): ");
        String formato = interfaz.leerMensaje();
        gestor.crearMaterialAudio(signatura, restringido, tema, fechaCompra, formato, duracion, idioma);
        interfaz.imprimirMensaje("Material registrado con exito");
    }

    private void listarAudios() {
        for (Audio unAudio : gestor.listarAudios()
        ) {
            interfaz.imprimirMensaje(unAudio.toString());
        }
    }
    private void registrarVideo(){
        interfaz.imprimirMensaje("REGISTRAR MATERIAL DE VIDEO");
        interfaz.imprimirMensaje("Ingrese la signatura (ID): ");
        int signatura = interfaz.leerNumero();
        interfaz.imprimirMensaje("Material restringido ? (y/n): ");
        String respuesta = interfaz.leerMensaje();
        boolean restringido = false;
        if (respuesta.equalsIgnoreCase("y")) {
            restringido = true;
        } else {
            restringido = false;
        }
        interfaz.imprimirMensaje("Tema del texto: ");
        String tema = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Fecha de compra (yyyy-MM-dd): ");
        String fecha = interfaz.leerMensaje();
        LocalDate fechaCompra = obtenerFecha(fecha);
        String idioma = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Duracion: ");
        int duracion = interfaz.leerNumero();
        interfaz.imprimirMensaje("Formato (VHS,VCD,DVD): ");
        String formato = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Nombre del director: ");
        String director = interfaz.leerMensaje();
        gestor.crearMaterialVideo(signatura,restringido,tema,fechaCompra,formato,duracion,idioma,director);
        interfaz.imprimirMensaje("Material registrado exitosamente");
    }

    private void listarVideos(){
        for (Video unvideo: gestor.listarVideos()
             ) {
            interfaz.imprimirMensaje(unvideo.toString());
        }
    }

    private void registrarOtroMaterial(){
        interfaz.imprimirMensaje("REGISTRAR MATERIAL DE VIDEO");
        interfaz.imprimirMensaje("Ingrese la signatura (ID): ");
        int signatura = interfaz.leerNumero();
        interfaz.imprimirMensaje("Material restringido ? (y/n): ");
        String respuesta = interfaz.leerMensaje();
        boolean restringido = false;
        if (respuesta.equalsIgnoreCase("y")) {
            restringido = true;
        } else {
            restringido = false;
        }
        interfaz.imprimirMensaje("Tema del texto: ");
        String tema = interfaz.leerMensaje();
        interfaz.imprimirMensaje("Fecha de compra (yyyy-MM-dd): ");
        String fecha = interfaz.leerMensaje();
        LocalDate fechaCompra = obtenerFecha(fecha);
        interfaz.imprimirMensaje("Descripcion: ");
        String descripcion = interfaz.leerMensaje();
        gestor.crearOtroMaterial(signatura,restringido,tema,fechaCompra,descripcion);
        interfaz.imprimirMensaje("Material registrado exitosamente");
    }

    private void listarOtroMaterial(){
        for (OtroMaterial unMaterial: gestor.listarOtros()
             ) {
            interfaz.imprimirMensaje(unMaterial.toString());
        }
    }

    private LocalDate obtenerFecha(String fecha) {
        return LocalDate.parse(fecha);
    }
}
