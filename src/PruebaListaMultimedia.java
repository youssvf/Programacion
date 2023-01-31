public class PruebaListaMultimedia extends Multimedia{

    public PruebaListaMultimedia(String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
    }

    public static void main(String[] args) {
        ListaMultimedia multimedia = new ListaMultimedia();
        new Disco("disco1",  "autor1", "disco", 20, "genero1" );
        multimedia.add(new Disco("disco1",  "autor1", "disco", 10, "rock"));
        multimedia.add(new Disco("disco2","autor2", "disco",20,"rock"));
        multimedia.add(new Disco("disco3","autor3", "disco",30,"genero3"));

        multimedia.add(new Pelicula("pelicula1", "autor1", "mp4", 100, "thor", null));
        multimedia.add(new Pelicula("pelicula2", "autor2", "mp4", 200,"superman", "superwoman"));
        multimedia.add(new Pelicula("pelicula3", "autor3", "mp4", 300,"spiderman", "spiderwoman"));


        multimedia.muestraLista();
        multimedia.duracionLista();
        System.out.println("Discos de rock:" + multimedia.contarRock());
        System.out.println(multimedia.comprobarActriz());

    }
}
