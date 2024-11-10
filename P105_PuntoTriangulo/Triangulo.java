package P105_PuntoTriangulo;

public class Triangulo {
    private Punto V1;
    private Punto V2;
    private Punto V3;

    public Triangulo(){
        this.V1 = 0;
        this.V2 = 0;
        this.V3 = 0;
    }

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        V1 = v1;
        V2 = v2;
        V3 = v3;
    }

    public Punto getV1() {
        return V1;
    }

    public void setV1(Punto v1) {
        V1 = v1;
    }

    public Punto getV2() {
        return V2;
    }

    public void setV2(Punto v2) {
        V2 = v2;
    }

    public Punto getV3() {
        return V3;
    }

    public void setV3(Punto v3) {
        V3 = v3;
    }

    public double getPerimetro(){
        return V1 + V2 + V3;
    }

    public String setTipo(){
        return 
    }

    @Override
    public String toString() {
        return "Triangulo [V1=" + V1 + ", V2=" + V2 + ", V3=" + V3 + "]";
    }

    
}
