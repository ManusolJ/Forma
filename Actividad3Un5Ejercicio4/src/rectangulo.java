public class rectangulo extends forma {

    private double longitud;

    private double ancho;


    public rectangulo(double longitud,double ancho){
        super("Rectangulo");
        this.ancho = ancho;
        this.longitud = longitud;
    }

    public double getLongitud(){
        return longitud;
    }

    public double getAncho(){
        return ancho;
    }

    @Override
    public double getArea(){
    return longitud * ancho;
    }

    @Override
    public String toString() {
        return "rectangulo{" +
                "longitud=" + longitud +
                ", ancho=" + ancho +
                '}';
    }
}
