// Imprime numeros impares descendente
import java.util.Scanner;

public class P49_ParesDescendente {
    public static void main(String[] args) {
        int num, c, s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Imprime números pares descendente, desde 100 hasta el número que desee.\n");
            System.out.print("Hasta donde desea imprimirlos: ");
            num = obj.nextInt();
            s = 0;
            c = 100;
            while (c >= num) {
                System.out.printf("%d ", c);
                s = s + c;
                c = c - 2;
            }
            System.out.printf("\nLa suma es %d", s);
            double prom = num > 0 ? (double) s / num : 0;
            System.out.printf("\nLa suma es %f", prom);
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}