public class Libro extends Publicacion implements Prestable{

    private Boolean disponible;
    private String prestado;

    public Libro(int codigo, String titulo, int añoPublicacion, Boolean disponible, String prestado){
        super(codigo, titulo, añoPublicacion);
        this.disponible=false;
        this.prestado="Disponible";
    }
    @Override
    public String toString(){
        String entrada;
        entrada = "Código: "+getCodigo()+" Título del libro: "+getTitulo()+" Año de publicación: "+getAñoPublicacion()+" Disponibilidad: "+prestado;
        return entrada;
    }


    public void prestar() {
        disponible=true;
        prestado = "Prestado";

    }

    public void devolver() {
        disponible=false;
        prestado = "Disponible";

    }

    public void prestado() {
        disponible=true;
        prestado = "Prestado";

    }

    public int cuentaPrestados(){
        int contador=0;
        if(this.disponible==false){
            contador++;
        }
        return contador;
    }
    public boolean equals(Object o){
        int contador=0;
        if(o instanceof Publicacion){
            Publicacion l = (Libro) o;
            if(this.disponible==false){
                contador++;
            }
        }
        return true;
    }

}

