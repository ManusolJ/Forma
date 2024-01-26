public class forma {
    private String nombre;

    public double getArea(){
        return 0;
    }

    public forma(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "forma ( " + "nombre: " + nombre + ")";
    }
}
