package alfaroviquez.david.bl.entidades;

import alfaroviquez.david.bl.tipos.formatoAudio;
import alfaroviquez.david.bl.tipos.formatoVideo;

import java.time.LocalDate;

public class Video extends Material {
    private formatoVideo formato;
    private int duracion;
    private String idioma;
    private String director;

    public formatoVideo getFormato() {
        return formato;
    }

    public void setFormato(formatoVideo formato) {
        this.formato = formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Video() {
    }

    public Video(int signatura, Boolean restringido, String tema, LocalDate fechaCompra, formatoVideo formato, int duracion, String idioma, String director) {
        super(signatura, restringido, tema, fechaCompra);
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
        this.director = director;
    }

    public Video(String sourceLines){
        String[] datos = sourceLines.split(",");
        this.signatura= Integer.parseInt(datos[0]);
        this.restringido = Boolean.valueOf(datos[1]);
        this.tema = datos[2];
        this.fechaCompra = LocalDate.parse(datos[3]);
        this.formato = formatoVideo.valueOf(datos[4]);
        this.duracion = Integer.parseInt(datos[5]);
        this.idioma = datos[6];
        this.director=datos[7];
    }
    @Override
    public String toString() {
        return "Video{" +
                "formato=" + formato +
                ", duracion=" + duracion +
                ", idioma='" + idioma + '\'' +
                ", director='" + director + '\'' +
                ", signatura='" + signatura + '\'' +
                ", restringido=" + restringido +
                ", tema='" + tema + '\'' +
                ", fechaCompra=" + fechaCompra +
                "} " + super.toString();
    }

    @Override
    public String toCSVLine() {
        return this.signatura+","+this.restringido+","+this.tema+","+this.fechaCompra+","+this.formato+","+this.duracion+","+this.idioma+","+this.director;
    }
}
