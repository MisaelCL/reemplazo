//Calcula el volumen de un cilindro dado su radio y altura
//
import java.util.Scanner;

public class P13_VolumenCilindro {
    public static void main(String[] args) {
        int radio, altura;
        double volumen;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame el radio de tu cilindro:"); radio = obj.nextInt();
        System.out.println("Dame la altura de tu cilindro:"); altura = obj.nextInt();
        volumen = Math.PI*(radio*radio)*altura;
        System.out.println("El volumen de tu cilindro es:"+ volumen);

    }
}
