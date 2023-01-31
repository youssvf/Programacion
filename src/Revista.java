public class Revista extends Publicacion {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public Revista(int codigo, String titulo, int añoPublicacion, int numero) {
        super(codigo, titulo, añoPublicacion);
        this.numero=numero;
    }

    @Override
    public String toString(){
        String entrada;
        entrada = "Código: "+getCodigo()+" Título de la revista: "+getTitulo()+" Año de publicación: "+getAñoPublicacion()+" Número de revista: "+getNumero();
        return entrada;
    }

}
