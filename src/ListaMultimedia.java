import java.util.ArrayList;

public class ListaMultimedia {

    private ArrayList<Multimedia> lista;

    public ArrayList getLista() {
        return lista;
    }

    public ListaMultimedia() {
        this.lista = new ArrayList<>();
    }

    public void add(Multimedia multimedia) {
        this.lista.add(multimedia);
    }

    public void muestraLista(){
        for(Multimedia m: lista){
            System.out.println(m);
        }
    }

    public int duracionLista(){

        int tiempototal=0;

        for(Multimedia m: this.lista){
            tiempototal += m.getDuracion();
        }
        System.out.println("La duración de la lista es : " + tiempototal + " minutos");
        return tiempototal;
    }

    public int contarRock(){
        int rock=0;

        for(Multimedia m: this.lista){
            if(m instanceof Disco d){
                if(d.getGenero().equals("rock")){
                    rock++;
                }
            }
        }

        return rock;
    }
    public int comprobarActriz(){
        int contador=0;
        for(Multimedia m: lista){
            if(m instanceof Pelicula p){
                if(p.getActrizp()==null){
                    contador++;
                }
            }
        }
        return contador;
    }

}
