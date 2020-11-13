package alfaroviquez.david.bl.logica;

import alfaroviquez.david.bl.entidades.*;
import alfaroviquez.david.bl.tipos.formatoAudio;
import alfaroviquez.david.bl.tipos.formatoVideo;
import alfaroviquez.david.bl.tipos.tipoContrato;
import alfaroviquez.david.bl.tipos.tipoNombramiento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gestor {

    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Profesor> listaProfesores = new ArrayList<>();
    private ArrayList<Administrativo> listaAdministrativos = new ArrayList<>();

    private ArrayList<Texto>listaTextos = new ArrayList<>();
    private ArrayList<Audio>listaAudios = new ArrayList<>();
    private ArrayList<Video>listaVideos = new ArrayList<>();
    private ArrayList<OtroMaterial>listaOtros = new ArrayList<>();


    public void crearEstudiante(String nombre,String apellido,int ID,String carrera, int creditos){
        Estudiante nuevoEstudiante = new Estudiante(nombre,apellido,ID,carrera,creditos);
        listaEstudiantes.add(nuevoEstudiante);

    }
    public List<Estudiante> listarEstudiantes(){
        return Collections.unmodifiableList(this.listaEstudiantes);
    }
    public void crearProfesor(String nombre, String apellido, int ID, LocalDate fechaContratacion,String tipocontrato){
        tipoContrato contrato = tipoContrato.valueOf(tipocontrato);
        Profesor nuevoProfesor = new Profesor(nombre,apellido,ID,fechaContratacion,contrato);
        listaProfesores.add(nuevoProfesor);
    }

    public List<Profesor> listarProfesores(){
        return  Collections.unmodifiableList(this.listaProfesores);
    }

    public void crearAdministrativo(String nombre, String apellido, int ID, String nombramiento,int horasAsignadas){
        tipoNombramiento tipoNombramiento = alfaroviquez.david.bl.tipos.tipoNombramiento.valueOf(nombramiento);
        Administrativo nuevoAdministrativo = new Administrativo(nombre,apellido,ID,tipoNombramiento,horasAsignadas);
        listaAdministrativos.add(nuevoAdministrativo);
    }
     public List<Administrativo> listarAdministrativos(){
        return Collections.unmodifiableList(this.listaAdministrativos);
    }
     public void crearMaterialTexto (String signatura, Boolean restringido, String tema, LocalDate fechaCompra, String titulo, String nombreAutor, LocalDate fechaPublicacion, int numeroPaginas, String idioma){
        Texto nuevoTexto = new Texto(signatura,restringido,tema,fechaCompra,titulo,nombreAutor,fechaPublicacion,numeroPaginas,idioma);
        listaTextos.add(nuevoTexto);

     }
     public List<Texto>listarTextos(){
        return Collections.unmodifiableList(this.listaTextos);
     }

     public void crearMaterialAudio(String signatura, Boolean restringido, String tema, LocalDate fechaCompra, String formato, int duracion, String idioma){
        formatoAudio tipoFormato = formatoAudio.valueOf(formato);
        Audio nuevoAudio = new Audio(signatura,restringido,tema,fechaCompra,tipoFormato,duracion,idioma);
        listaAudios.add(nuevoAudio);
     }

     public List<Audio> listarAudios(){
        return Collections.unmodifiableList(this.listaAudios);
     }

     public void crearMaterialVideo(String signatura, Boolean restringido, String tema, LocalDate fechaCompra, String formato, int duracion, String idioma, String director){
        formatoVideo tipoFormato = formatoVideo.valueOf(formato);
        Video nuevoVideo = new Video(signatura,restringido,tema,fechaCompra,tipoFormato,duracion,idioma,director);
        listaVideos.add(nuevoVideo);
     }

     public List<Video> listarVideos(){
        return Collections.unmodifiableList(this.listaVideos);
     }


}
