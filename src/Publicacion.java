public class Publicacion {

    private int codigo;
    private String titulo;
    private int añoPublicacion;

    public Publicacion(int codigo, String titulo, int añoPublicacion) {
        this.codigo=codigo;
        this.titulo=titulo;
        this.añoPublicacion=añoPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }


}
