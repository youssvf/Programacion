public class DiscoPrestable extends Disco implements Prestable{

    private Boolean prestado;

    public DiscoPrestable(String titulo, String autor, String formato, int duracion, String genero, Boolean prestado) {
        super(titulo, autor, formato, duracion, genero);
        this.prestado=false;
    }

    public DiscoPrestable(String titulo, String autor, String formato, int duracion, String genero) {
        super(titulo, autor, formato, duracion, genero);
        this.prestado=false;
    }


    public Boolean getPrestado() {
        return prestado;
    }

    @Override
    public void prestar() {
        prestado=true;
    }

    @Override
    public void devolver() {
        prestado=false;
    }

    @Override
    public void prestado() {

    }

    public String toString(){
        String entrada;
        entrada="Título: "+getTitulo()+" Autor " + getAutor() + " Formato:" + getFormato() +" Duracion: " + getDuracion()+" Género: " + getGenero() ;
        return entrada;
    }

}
