package P108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("CP0100010122", "Ford", 2023, 125345.22);
        Vehiculo v2 = new Vehiculo("CP1000145555", "Nissan", 2010, 54500.33);
        Vehiculo v3 = new Vehiculo("CA104014544", "Dina", 2008, 234567.15);
        Vehiculo v4 = new Vehiculo("CA774814599", "Hongyan", 2023, 934577.98);

        Compacto compac1 = new Compacto(v1, 4, 2);
        Compacto compac2 = new Compacto(v2, 6, 4);
        Camioneta camion1 = new Camioneta(v3, 450.0, 4);
        Camioneta camion2 = new Camioneta(v4, 1200.0, 6);

        System.out.println("Datos de los Vehiculos de la flota:\n ");
        System.out.println(compac1);
        System.out.println(compac2);
        System.out.println(camion1);
        System.out.println(camion2);
        
        System.out.println("\nCalculando el total de precio de todos los vehiculos ...");
        System.out.println(v1.getPrecio());
        System.out.println(v2.getPrecio());
        System.out.println(v3.getPrecio());
        System.out.println(v4.getPrecio());
        
        
        System.out.print("La suma de precios es: ");
        System.out.print(v1.getPrecio() + v2.getPrecio() + v3.getPrecio() + v4.getPrecio());

    }
}
