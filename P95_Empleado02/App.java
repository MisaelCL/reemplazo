package P95_Empleado02;

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        empleado1.setNombre("Carlos");
        empleado1.setEdad(25);

        empleado2.setNombre("Maria Lopez");
        empleado2.setEdad(22);

        System.out.println("Empleado 1 Nombre "+ empleado1.getNombre());
        System.out.println("Empleado 1 Edad "+ empleado1.getEdad());
        System.out.println(empleado1.toString());
        
        System.out.println("Empleado 2 Nombre "+ empleado2.getNombre());
        System.out.println("Empleado 2 Edad "+ empleado2.getEdad());
        System.out.println(empleado2.toString());
    }
}
