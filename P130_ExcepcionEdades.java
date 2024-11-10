import java.util.Scanner;
import java.util.InputMismatchException;


public class P130_ExcepcionEdades {
    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner(System.in);
            int[] edades = new int[5];
            for (int i = 0; i < edades.length; i++) {
                
                System.out.println("Captura las edades de 5 personas: ");
                edades = obj.nextInt();
            }
            System.out.println("Captura terminada");
        } catch (InputMismatchException e) {
            System.out.println("Introduce un número entero");
        }
    }
}
