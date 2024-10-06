//Un uruario selecciona entre 3 tipos de pizza y dependiendo del monto a gastar se aplica o no un descuento proporcional
import java.util.Scanner;

public class P36_CompraPizza {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        float chico = 5; 
        float mediano = 10;
        float grande = 20; 
        float pizza;
        float total = 0; 
        float descuento = 0;
        float fin = 0;

        Scanner obj = new Scanner(System.in);

        System.out.println("Seleccione el tamaño de su pizza");
        System.out.println("chico=1, mediano=2, grande=3"); int op = new Scanner(System.in).nextInt();

        System.out.println("Seleccione la cantidad de pizzas que desea: "); pizza = obj.nextFloat();

        switch (op) {
            case 1:
                total = pizza*chico;
                break;
            case 2:
                total = pizza*mediano;
                break;
            case 3:
                total = pizza*grande;
                break;
            default:
                System.out.println("No tenemos este tamaño de pizza...");
                break;
        }

        if (total >= 2000){
            descuento = total * 0.15f;
            fin = total - descuento; 
            System.out.printf("El total de su compra es: $%.2f ",total);
            System.out.printf("\nsu descuento es de: $%.2f ",descuento);
            System.out.printf("\nsu compra es de: $%.2f ",fin);
            System.out.printf("\nCompro un total de %.2f pizzas",pizza);
        }else{
            System.out.printf("El total de su compra es: $%.2f ",total);
            System.out.printf("\nCompro un total de %.2f pizzas",pizza);
        }



    }
}
