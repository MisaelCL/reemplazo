
// Conversion de temperaturas usando funciones
import java.util.Scanner;

public class P67_ConversionTemperaturas {
    public static float Farenheit(float t) {
        return (t * 9 / 5) + 32;
    }

    public static float Celcius(float t) {
        return (t - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        int op;
        float temp, res;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("[1] farenheit\n[2] celcius\n[3] Salir\nElige ? ");
            op = obj.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Dame la temperatura ? ");
                    temp = obj.nextFloat();
                    res = Farenheit(temp);
                    System.out.printf("\n%.2f grados celcius equivale a %.2f grados farenheit ..", temp, res);
                    break;
                case 2:
                    System.out.print("Dame la temperatura ? ");
                    temp = obj.nextFloat();
                    res = Celcius(temp);
                    System.out.printf("\n%.2f grados farenheit equivale a %.2f grados celcius ..", temp, res);
                    break;
                case 3:
                    System.out.print("Usted ha salido del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (op != 3);
    }
}