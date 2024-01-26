public class pintura {
    private double cobertura;

    public pintura (double cobertura){
        this.cobertura = cobertura;
    }

    public double getCantidadPintura(forma objeto){
        return objeto.getArea() / cobertura;
    }


}
