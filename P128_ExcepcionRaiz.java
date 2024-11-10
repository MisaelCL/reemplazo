import java.util.Scanner;

public class P128_ExcepcionRaiz {
    public static void main(String[] args) {
        
        try {
            float num;
    
            Scanner obj = new Scanner(System.in);
    
            System.out.println("Introduce un número: ");
            num = obj.nextFloat();
            double tot;
            tot = Math.sqrt(num);
            System.out.printf("El resultado es: %.2f", tot);
        } catch (Exception e) {
            System.out.println("Error no puedo calcular la raiz cuadrada");
        }
    }
}
