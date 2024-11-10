package P109_FormaV2;

public class App {
    public static void main(String[] args) {

        Forma forma1 = new Forma("Rojo", true);
        Forma forma2 = new Forma("Verde", false);
        Forma forma3 = new Forma("Amarillo", false);
        Forma forma4 = new Forma("Azul", true);

        Circulo circulo1 = new Circulo(forma1, 10.23);
        Circulo circulo2 = new Circulo(forma2, 99.12);

        Rectangulo rectangulo1 = new Rectangulo(forma3, 10.0, 20.0);
        Rectangulo rectangulo2 = new Rectangulo(forma4, 15.0, 44.0);

        System.out.println("Todas las formas: ");
        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println(rectangulo1);
        System.out.println(rectangulo2);


    }
}
