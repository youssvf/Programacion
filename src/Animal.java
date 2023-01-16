public class Animal {

    private String nombre;
    private double peso;
    private Sexo sexo;
    private boolean enfermo;
    private boolean estalimpio;
    public double cantidad;

    public Animal() {
        this.nombre= nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.enfermo = enfermo;
        this.estalimpio = estalimpio;
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

}
