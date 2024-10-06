//Dados tres números enteros verificar cual es el mayor
import java.util.Scanner;

public class P34_NumeroMayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num1, num2, num3;

        Scanner obj = new Scanner(System.in);

        System.out.println("Coloque el primer número a verificar: "); num1 = obj.nextInt();
        System.out.println("Coloque el segundo número a verificar: "); num2 = obj.nextInt();
        System.out.println("Coloque el tercero número a verificar: "); num3 = obj.nextInt();

        if ((num1 > num2)&&(num1 > num3)){
            System.out.println(String.format("Su número %d es el mayor", num1));

        }
        else if ((num2 > num1)&&(num2 > num3)){
            System.out.println(String.format("Su número %d es el mayor", num2));
        }
        else if ((num3 > num1)&&(num3 > num2)){
            System.out.println(String.format("Su número %d es el mayor", num3));
        }
    }
}
