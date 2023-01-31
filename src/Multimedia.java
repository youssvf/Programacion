public class Multimedia {

    private String titulo;
    private String autor;
    private String formato;
    private int duracion;

    public Multimedia(String titulo, String autor, String formato, int duracion) {
        this.titulo= titulo;
        this.autor= autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getFormato() {

        return this.formato;
    }

    public double getDuracion() {

        return this.duracion;
    }
    @Override
    public String toString(){
        String salida;
        salida = "Título: " + getTitulo() + " Autor: " + getAutor() + " Formato: "+ getFormato() + "Duración: "+ getDuracion();
        return salida;
    }


    public boolean equals(Object o) {
        if(o instanceof Multimedia) {
            Multimedia m = (Multimedia) o;
            if (this.titulo.equals(m.titulo) && this.autor.equals(m.autor)) {
                return true;
            }
        }
            return false;
    }
}
