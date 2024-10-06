//Dados tres numeros enteros, verifica si son consecutivos y manda mensaje confirmandolo, en caso negativo manda error

import java.util.Scanner;

public class P33_NumerosConsecutivos{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num1, num2, num3;

        Scanner obj = new Scanner(System.in);

        System.out.println("Coloque el primer número a verificar: "); num1 = obj.nextInt();
        System.out.println("Coloque el segundo número a verificar: "); num2 = obj.nextInt();
        System.out.println("Coloque el tercero número a verificar: "); num3 = obj.nextInt();

        if ((num1 +1 == num2)&&(num2 +1 == num3)){
            System.out.println("Sus numeros son consecutivos");
        }
        else
            System.out.println("ERROR, sus números no son consecutivos");
    }

}