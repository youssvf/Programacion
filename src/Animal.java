public class Animal {

    private String nombre;
    private double peso;
    private Sexo sexo;
    private boolean enfermo;
    private boolean estalimpio;
    public double cantidad;

    public Animal(String nombre, double peso, Sexo sexo, boolean enfermo, boolean estaLimpio, double cantidad) {
        this.nombre= nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.enfermo = enfermo;
        this.estalimpio = estalimpio;
        this.cantidad= cantidad;
        this.alimentar(2);
        this.revision();
        this.mantenimiento = mantenimiento;
        this.reproducir= reproducir;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setEnfermo(boolean enfermo) {
        this.enfermo = enfermo;
    }

    public void setEstalimpio(boolean estalimpio) {
        this.estalimpio = estalimpio;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public boolean alimentar(double cantidad){
        if(enfermo == true){
            System.out.println("Está enfermo");
            return false;
        }else return true;
    }

    public boolean limpiar(){
        if(estalimpio==true){
            System.out.println("Está limpio");
            return false;
        }else return true;
    }
    public boolean revision(){
        if(enfermo==true){
            System.out.println("Tiene que ser revisado");
            return true;
        }else return false;
    }
    public boolean mantenimiento;
    public boolean reproducir;

    @Override
    public String toString(){
        String salida;
        salida = "Este animal se llama " + nombre + ", pesa " + peso + " kg y su sexo es "+ sexo ;
        return salida;
    }

}
