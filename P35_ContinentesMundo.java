//Dado un número entero entre 1 y 6 que corresponde a un continente del mundo escribe su numbre

import java.util.Scanner;

public class P35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Selecciona un número entre 1 y 6");
        System.out.print("Dame un número: ");
        int op = new Scanner(System.in).nextInt();
        switch (op) {
            case 1:
                System.out.println("Usted a seleccionado ASIA");
                break;
            case 2:
                System.out.println("Usted a seleccionado ÁFRICA");
                break;
            case 3:
                System.out.println("Usted a seleccionado AMÉRICA DEL NORTE");
                break;
            case 4:
                System.out.println("Usted a seleccionado AMÉRICA DEL SUR");
                break;
            case 5:
                System.out.println("Usted a seleccionado ANTARTIDA");
                break;
            case 6:
                System.out.println("Usted a seleccionado a EUROPA");
                break;
            default:
                System.out.println("Opción invalida");
                break;
        }
        System.out.println("Proceso terminado");
    }
}
