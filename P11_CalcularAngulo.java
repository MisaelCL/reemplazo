//Calcula el 3er angulo de un trianguiodados los dos primeros anfulos del mismo
import java.util.Scanner;
//
public class P11_CalcularAngulo {
    public static void main(String[] args) {
        double angulo1, angulo2, angulo3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame la cifra del primer angulo:"); angulo1 = obj.nextInt();
        System.out.println("Dame la cifra del segundo angulo:"); angulo2 = obj.nextInt();
        angulo3 = 180 - (angulo1 + angulo2);
        System.out.println("El tercer angulo es: "+ angulo3);
    }
}