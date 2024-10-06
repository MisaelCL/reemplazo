package P94_Empleado01;

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        empleado1.Nombre = "Juan Perez";
        empleado1.Edad = 27;
        System.out.println(empleado1.toString());
        empleado2.Nombre = "Maria Lopez";
        empleado2.Edad = 25;

        
        System.out.print("\033[H\033[2J");
        System.out.println("Empleado 1 Nombre: "+ empleado1.Nombre);
        System.out.println("Empleado 1 Edad: "+ empleado1.Edad);
        System.out.println(empleado1.toString());

    }
}