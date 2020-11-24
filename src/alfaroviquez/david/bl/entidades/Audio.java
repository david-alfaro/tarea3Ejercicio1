package alfaroviquez.david.bl.entidades;

import alfaroviquez.david.bl.tipos.formatoAudio;

import java.time.LocalDate;

public class Audio extends Material {
    private formatoAudio formato;
    private int duracion;
    private String idioma;

    public formatoAudio getFormato() {
        return formato;
    }

    public void setFormato(formatoAudio formato) {
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

    public Audio() {
    }

    public Audio(int signatura, Boolean restringido, String tema, LocalDate fechaCompra, formatoAudio formato, int duracion, String idioma) {
        super(signatura, restringido, tema, fechaCompra);
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    public Audio(String sourceLines){
        String[] datos = sourceLines.split(",");
        this.signatura= Integer.parseInt(datos[0]);
        this.restringido = Boolean.valueOf(datos[1]);
        this.tema = datos[2];
        this.fechaCompra = LocalDate.parse(datos[3]);
        this.formato = formatoAudio.valueOf(datos[4]);
        this.duracion = Integer.parseInt(datos[5]);
        this.idioma = datos[6];
    }
    @Override
    public String toString() {
        return "Audio{" +
                "formato=" + formato +
                ", duracion=" + duracion +
                ", idioma='" + idioma + '\'' +
                ", signatura='" + signatura + '\'' +
                ", restringido=" + restringido +
                ", tema='" + tema + '\'' +
                ", fechaCompra=" + fechaCompra +
                "} " + super.toString();
    }

    @Override
    public String toCSVLine() {
        return this.signatura+","+this.restringido+","+this.tema+","+this.fechaCompra+","+this.formato+","+this.duracion+","+this.idioma;
    }
}
