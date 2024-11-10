package P109_FormaV2;

public class Circulo extends Forma{
    private double Radio;

    public Circulo() {
    }

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        Radio = radio;
    }

    public Circulo(Forma forma, double radio) {
        super(forma.Color, forma.Relleno);
        Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getArea(){
        return Math.PI * Math.pow(Radio, 2);
    }

    public double getPerimetro(){
        return Math.PI * (2 * Radio);
    }

    @Override
    public String toString() {
        return "Circulo [Forma  [" + super.toString() +"Radio=" + Radio + ", getArea()=" + getArea() + ", getPerimetro()=" + getPerimetro() + "]";
    }

    

}
