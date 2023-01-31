import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro(1000,"Harry Potter",2010,null,null);
        Libro libro2 = new Libro(2000,"BatPat",2020,null,null);

        Revista revista1 = new Revista(3000,"Marca",2022,123456);
        Revista revista2 = new Revista(4000,"Diario As",2023,234567);

        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add(libro1);
        publicaciones.add(libro2);
        publicaciones.add(revista1);
        publicaciones.add(revista2);

        libro1.prestar();
        for(Publicacion p:publicaciones){

        }


        for(Publicacion b:publicaciones){
            System.out.println(b);
        }

    }


}
