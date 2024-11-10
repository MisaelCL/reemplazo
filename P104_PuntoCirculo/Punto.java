package P104_PuntoCirculo;

public class Punto {
    private int X;
    private int Y;

    public Punto(){
        this.X = 0;
        this.Y = 0;
    }
    public Punto(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }
    
    //public double getDistancia(){
      //  return (Math.sqrt((Math.pow(x-x, 2)) + (Math.pow(y-y, 2))));
    //}

    public double getDistancia(Punto otroPunto){
        return Math.sqrt(Math.pow(otroPunto.getX(), 2));
    }

    @Override
    public String toString() {
        return "Punto [x=" + X + ", y=" + Y + "]";
    }
    
    
}
