public class Disco extends Multimedia{

    private String genero;

    public Disco(String titulo, String autor, String formato, int duracion, String genero){
        super(titulo, autor, formato, duracion);
        this.genero= genero;
    }

    public String toString(){
        String entrada;
        entrada="El título es "+ getTitulo() + ", el autor es " + getAutor() +", tiene formato " + getFormato() + ", dura " + getDuracion() + "'" + " y su genero es " + getGenero();
        return entrada;
    }

    public String getGenero() {
        return genero;
    }

}
