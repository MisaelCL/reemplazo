import java.util.InputMismatchException;
import java.util.Scanner;


public class P129_ExcepcionDulces {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            int niños;
            int dulces;
            double tot;
            System.out.println("Número de niños en el barrio: ");
            niños = obj.nextInt();
            System.out.println("Cantidad de dulces existentes: ");
            dulces = obj.nextInt();
            
            tot = niños/dulces;
            System.out.printf("A cada niño le tocan %.1f dulces", tot);

        } catch (ArithmeticException e) {
            System.out.println("Si no hay dulces, no puedo repartir dulces");
        }catch (InputMismatchException e){
            System.out.println("Los niños y los dulces deben ser cantidades numéricas");
        }
    }
}
