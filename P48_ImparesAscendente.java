// Imprime numeros pares ascendente
import java.util.Scanner;

public class P48_ImparesAscendente {
    public static void main(String[] args) {
        int num, c, s;
        float prom;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Imprime números impares ascendente\n");
            System.out.print("Hasta que número deseas imprimir: ");
            num = obj.nextInt();
            s = 0;
            c = 1;
            while (c <= num) {
                System.out.printf("%d ", c);
                s = s + c;
                c = c + 2;
            }
            System.out.printf("\nLa suma es %d", s);
            prom = s/(num/2);
            System.out.printf("\nEl promedio es %.1f", prom);

            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}