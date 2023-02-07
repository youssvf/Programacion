import java.util.ArrayList;
import java.util.Scanner;

public class UsoPublicaciones {
    public static void main(String[] args) {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();

        Libro libro1 = new Libro(1000,"Harry Potter",2010,null,null);
        Libro libro2 = new Libro(2000,"BatPat",2020,null,null);
//
        Revista revista1 = new Revista(3000,"Marca",2022,123456);
        Revista revista2 = new Revista(4000,"Diario As",2023,234567);


        publicaciones.add(libro1);
        publicaciones.add(libro2);
        publicaciones.add(revista1);
        publicaciones.add(revista2);


        libro1.prestar();

        //publicacionesAnterioresA
        System.out.println("Introduzca año");
        Scanner sc = new Scanner(System.in);
        int año = sc.nextInt();
        int publisanteriores=0;
        for(Publicacion a:publicaciones){
            if(a.getAñoPublicacion()<=año){
                publisanteriores++;
            }
        }
        System.out.println("Hay " + publisanteriores + " publicaciones anteriores a " + año);

        //cuentaPrestados
        int contador=0;
        for(Publicacion b:publicaciones){
            if(b instanceof Libro){
                if(((Libro) b).getPrestado()=="Prestado"){
                    contador++;

                }
            }
        }
        System.out.println("Hay "+ contador + " libros prestados");


        for(Publicacion p:publicaciones){
            System.out.println(p);
        }

    }


}
