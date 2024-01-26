public class esfera extends forma{

    private double radio;

    public esfera(double radio){
        super("Esfera");
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public double getArea(){
        return 4 * Math.PI * Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "esfera{" +
                "radio=" + radio +
                '}';
    }
}
