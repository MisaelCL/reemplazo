//Convierte una temperatura de grados fahrenheit a grados celsius
//
import java.util.Scanner;

public class P12_ConvertirTemperatura {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame tu temperatura en Fahrenheit:"); fahrenheit = obj.nextInt();
        celsius = (fahrenheit - 32)*(5.0/9.0);
        System.out.println("Tu temperatura en Celsius es:"+ celsius);
    }
}
