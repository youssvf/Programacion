public class Pelicula extends Multimedia{

    private String actorp;
    private String actrizp;

    public Pelicula(String titulo, String autor, String formato, int duracion, String actorp, String actrizp){
        super(titulo, autor, formato, duracion);
        this.actorp= actorp;
        this.actrizp = actrizp;
        if (actorp == null && actrizp == null) {
            throw  new IllegalArgumentException("El actor y la actriz no pueden ser nulos ");
        }
    }

    @Override
    public String toString(){
        String salida;
        salida = "Título: " + getTitulo() + " Autor: " + getAutor() + " Formato: "+ getFormato() + " Duración: "+ getDuracion();
        return salida;
    }

    public String getActorp() {
        return actorp;
    }

    public String getActrizp() {
        return actrizp;
    }
}
