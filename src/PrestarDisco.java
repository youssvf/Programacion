import java.util.ArrayList;
import java.util.Scanner;

public class PrestarDisco {

    public static void main(String[] args) {
        ArrayList<DiscoPrestable> discos = new ArrayList<>();

        DiscoPrestable disco1 = new DiscoPrestable("disco1","autor1","mp4", 100,"pop");
        DiscoPrestable disco2 = new DiscoPrestable("disco2","autor2","mp4", 200,"punk");
        DiscoPrestable disco3 = new DiscoPrestable("disco3","autor3","mp4", 300,"rock");

        discos.add(disco1);
        discos.add(disco2);
        discos.add(disco3);

        disco1.prestar();
        disco2.prestar();

        for( DiscoPrestable d: discos){
            System.out.println(d);
        }

        int contador=0;
        for(Disco d:discos){
            if(d instanceof DiscoPrestable){
                if(((DiscoPrestable) d).getPrestado() == true){
                    contador++;
                }
            }
        }
        System.out.println("Hay " + contador + " discos prestados");
    }

}
