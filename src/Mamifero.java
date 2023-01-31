public class Mamifero extends Animal{

    public Mamifero(String nombre, double peso, Sexo sexo, boolean enfermo, boolean estaLimpio, double cantidad, boolean alimentar, boolean limpiar ){
        super(nombre, peso, sexo, enfermo, estaLimpio, cantidad);
        this.alimentar(2);
        this.revision();
        this.mantenimiento = mantenimiento;
        this.reproducir= reproducir;
    }

    public static void main(String[] args) {
        Mamifero perro;
    }
    @Override
    public String toString(){
        String salida;
        salida = "Este animal se llama " + getNombre() + ", pesa " + getPeso() + " kg y su sexo es "+ getSexo() ;
        return salida;
    }
}
