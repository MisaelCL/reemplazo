package P96_Empleado03;

public class Empleado {
    //Propiedades
    private String Nombre;
    private int Edad;

    //Constuctor

    @Override
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("Nombre=").append(Nombre);
        sb.append(", Edad=").append(Edad);
        sb.append('}');
        return sb.toString();
    }
    public Empleado() {
    }
    

    //Metodos



    public String getNombre() {
        return Nombre;
    }

    public Empleado(String nombre, int edad) {
        Nombre = nombre;
        Edad = edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }



}
