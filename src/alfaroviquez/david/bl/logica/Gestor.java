package alfaroviquez.david.bl.logica;

import alfaroviquez.david.bl.entidades.*;
import alfaroviquez.david.bl.tipos.formatoAudio;
import alfaroviquez.david.bl.tipos.formatoVideo;
import alfaroviquez.david.bl.tipos.tipoContrato;
import alfaroviquez.david.bl.tipos.tipoNombramiento;
import alfaroviquez.david.persistencia.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Gestor {

    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Profesor> listaProfesores = new ArrayList<>();
    private ArrayList<Administrativo> listaAdministrativos = new ArrayList<>();

    private ArrayList<Material> listaMateriales = new ArrayList<>();
    private ArrayList<Texto> listaTextos = new ArrayList<>();
    private ArrayList<Audio> listaAudios = new ArrayList<>();
    private ArrayList<Video> listaVideos = new ArrayList<>();
    private ArrayList<OtroMaterial> listaOtros = new ArrayList<>();

    private ArrayList<Prestamo> prestamos = new ArrayList<>();


    private ProfesorDAO repositorioProfesores = new ProfesorDAO();
    private EstudianteDAO repositorioEstudiates = new EstudianteDAO();
    private AdministrativoDAO repositorioAdministrativos = new AdministrativoDAO();

    private AudioDAO repoMaterialAudio = new AudioDAO();
    private VideoDAO repoMaterialVideo = new VideoDAO();
    private TextoDAO repoMaterialTexto = new TextoDAO();
    private OtroMaterialDAO repoOtros = new OtroMaterialDAO();

    public void crearEstudiante(String nombre, String apellido, int ID, String carrera, int creditos) {
        Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, ID, carrera, creditos);
        listaEstudiantes.add(nuevoEstudiante);
        listaPersonas.add(nuevoEstudiante);
        repositorioEstudiates.save(nuevoEstudiante);

    }

    public List<Persona> listarEstudiantes() {

        //return Collections.unmodifiableList(this.listaEstudiantes);
        return repositorioEstudiates.findAll();
    }

    public void crearProfesor(String nombre, String apellido, int ID, LocalDate fechaContratacion, String tipocontrato) {
        tipoContrato contrato = tipoContrato.valueOf(tipocontrato);
        Profesor nuevoProfesor = new Profesor(nombre, apellido, ID, fechaContratacion, contrato);
        listaProfesores.add(nuevoProfesor);
        listaPersonas.add(nuevoProfesor);
        repositorioProfesores.save(nuevoProfesor);
    }

    public List<Persona> listarProfesores() {

        //return Collections.unmodifiableList(this.listaProfesores);
        return repositorioProfesores.findAll();
    }

    public void crearAdministrativo(String nombre, String apellido, int ID, String nombramiento, int horasAsignadas) {
        tipoNombramiento tipoNombramiento = alfaroviquez.david.bl.tipos.tipoNombramiento.valueOf(nombramiento);
        Administrativo nuevoAdministrativo = new Administrativo(nombre, apellido, ID, tipoNombramiento, horasAsignadas);
        listaAdministrativos.add(nuevoAdministrativo);
        listaPersonas.add(nuevoAdministrativo);
        repositorioAdministrativos.save(nuevoAdministrativo);
    }

    public List<Persona> listarAdministrativos() {
        //return Collections.unmodifiableList(this.listaAdministrativos);
        return repositorioAdministrativos.findAll();
    }

    public void crearMaterialTexto(int signatura, Boolean restringido, String tema, LocalDate fechaCompra, String titulo, String nombreAutor, LocalDate fechaPublicacion, int numeroPaginas, String idioma) {
        Texto nuevoTexto = new Texto(signatura, restringido, tema, fechaCompra, titulo, nombreAutor, fechaPublicacion, numeroPaginas, idioma);
        listaTextos.add(nuevoTexto);
        listaMateriales.add(nuevoTexto);
        repoMaterialTexto.save(nuevoTexto);
    }

    public List<Material> listarTextos() {

        //return Collections.unmodifiableList(this.listaTextos);
        return repoMaterialTexto.findAll();
    }

    public void crearMaterialAudio(int signatura, Boolean restringido, String tema, LocalDate fechaCompra, String formato, int duracion, String idioma) {
        formatoAudio tipoFormato = formatoAudio.valueOf(formato);
        Audio nuevoAudio = new Audio(signatura, restringido, tema, fechaCompra, tipoFormato, duracion, idioma);
        listaAudios.add(nuevoAudio);
        listaMateriales.add(nuevoAudio);
        repoMaterialAudio.save(nuevoAudio);
    }

    public List<Material> listarAudios() {

        //return Collections.unmodifiableList(this.listaAudios);
        return repoMaterialAudio.findAll();
    }

    public void crearMaterialVideo(int signatura, Boolean restringido, String tema, LocalDate fechaCompra, String formato, int duracion, String idioma, String director) {
        formatoVideo tipoFormato = formatoVideo.valueOf(formato);
        Video nuevoVideo = new Video(signatura, restringido, tema, fechaCompra, tipoFormato, duracion, idioma, director);
        listaVideos.add(nuevoVideo);
        listaMateriales.add(nuevoVideo);
        repoMaterialVideo.save(nuevoVideo);
    }

    public List<Material> listarVideos() {

        //return Collections.unmodifiableList(this.listaVideos);
        return repoMaterialVideo.findAll();
    }

    public void crearOtroMaterial(int signatura, Boolean restringido, String tema, LocalDate fechaCompra, String descripcion) {
        OtroMaterial nuevoOtro = new OtroMaterial(signatura, restringido, tema, fechaCompra, descripcion);
        listaOtros.add(nuevoOtro);
        listaMateriales.add(nuevoOtro);
        repoOtros.save(nuevoOtro);

    }

    public List<Material> listarOtros() {

        //return Collections.unmodifiableList(this.listaOtros);
        return repoOtros.findAll();
    }

    public List<Material>listarMateriales(){
        return Collections.unmodifiableList(this.listaMateriales);
    }
    public void crearPrestamo(Persona persona, LocalDate fechaDevolucion) {
        Prestamo nuevoPrestamo = new Prestamo(persona, new ArrayList<>(), fechaDevolucion);
        prestamos.add(nuevoPrestamo);
    }

    public List<Prestamo> listarPrestamos() {
        return Collections.unmodifiableList(this.prestamos);
    }

    public Persona buscarPersonaPorID(int id) {
        for (Persona unaPersona : this.listaPersonas) {
            if (unaPersona.getID() == id) {
                return unaPersona;
            }
        }
        return null;
    }

    public Material buscarMaterialPorSignatura(int signatura) {
        for (Material unMaterial : this.listaMateriales
        ) {
            if (unMaterial.getSignatura() == signatura) {
                return unMaterial;
            }
        }
        return null;
    }

    public Prestamo buscarPrestamoPorId(int id) {
        for (Prestamo unPrestamo : this.prestamos) {
            if(unPrestamo.getId()==id){
                return unPrestamo;
            }
        }
        return null;
    }

    public void asignarMaterialAPrestamo(int idPrestamo, int signatura) throws Exception {
        Prestamo unPrestamo = buscarPrestamoPorId(idPrestamo);
        Material unMaterial = buscarMaterialPorSignatura(signatura);
        if(unPrestamo.getId()==idPrestamo&&unMaterial.getSignatura()==signatura){
            unPrestamo.getListaMateriales().add(unMaterial);

        }else{
            throw new Exception("Persona o material no existen");
        }
    }

}
