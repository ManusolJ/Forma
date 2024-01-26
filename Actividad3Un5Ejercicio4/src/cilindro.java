public class cilindro extends forma{
    private double radio;

    private double altura;

    public cilindro(double radio,double altura){
        super("cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio(){
        return radio;
    }

    public double getAltura(){
        return altura;
    }

    @Override
    public double getArea(){
        return 2 * Math.PI * radio * (radio + altura);
    }

    @Override
    public String toString() {
        return "cilindro{" +
                "radio=" + radio +
                ", altura=" + altura +
                '}';
    }
}
