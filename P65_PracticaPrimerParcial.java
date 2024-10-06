import java.util.Scanner;

public class P65_PracticaPrimerParcial {
    public static void main(String[] args) {
        int i, n = 0, can1  = 0, can2 = 0, can3 = 0;
        int res1 = 0, res2 = 0, res3 = 0;
        int total, totalc;
        char resp, opc;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("---------------------------------------------------------");
        System.out.println("Papeleria la Malena, SA. de CV. \nSistema de ventas de copias");
        System.out.print("-----------------------------------------------------------\n");
        
        do {
            n ++;
            for (i = 1; i <= n;) {
                
                System.out.printf("Venta: %d \n",n);
                //n ++;
                System.out.println("¿Tipo de copia (C)arta $3, (O)ficio $4, (D)oble of $6?"); 
                
                opc = Character.toUpperCase(obj.next().charAt(0));

                if (opc == 'C'){ 
                    System.out.println("Cantidad: "); can1 = obj.nextInt(); res1 = can1 * 3;break;
                }if (opc == 'O'){
                    System.out.println("Cantidad: "); can2 = obj.nextInt(); res2 = can2 * 4;break;
                }if (opc == 'D'){
                    System.out.println("Cantidad: "); can3 = obj.nextInt(); res3 = can3 * 6;break;
                }
                else{
                    System.out.println("Opcion no valida...");break;
                }
            }
            System.out.print("Deseas continuar (S/N): ");
                resp = Character.toUpperCase(obj.next().charAt(0));
            } while (resp != 'N');
            
            System.out.print("\n-------------------------\n");
            System.out.print("\nResumen diario de ventas\n");
            System.out.print("\n--------------------------\n");

            System.out.printf("\nVentas realizadas: %d\n", n);
            System.out.printf("Carta: %d - $%d\n",can1, res1);
            System.out.printf("oficio: %d - $%d\n",can2, res2);
            System.out.printf("Doble of: %d - $%d\n",can3, res3);
            System.out.print("--------------------------------------\n");
            total = res1 + res2 + res3;
            totalc = can1 + can2 + can3;
            System.out.printf("Tot. Ventas: %d - $%d\n\n",totalc, total);

            if (total <= 50){
                System.out.println("Esta venta es una venta MODERADA");
            }if (total >=51 && total <=100){
                System.out.println("Esta venta es una venta FRECUENTE");
            }if (total >= 101) {
                System.out.println("Esta venta es una venta SUPERADA");
            }

            
        System.out.println("\nProceso terminado...");
        
    }
}
