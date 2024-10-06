import java.util.Scanner;

public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        
    
        int Ven = 1;
        char O, sexo;
        char resp = 'S';
        char nombre;
        int edad;
        int totalA = 0, totalD = 0, totalT = 0, totalM = 0, totalF = 0;

        int valor1 = 0, valor2 = 0, valor3= 0, valort = 0;
        do {
            System.out.printf("Numero aspirante: %d\n", Ven);

            System.out.print("Ingresa tu edad: ");
            edad = obj.nextInt();
            System.out.print("Ingresa tu nombre: ");
            nombre = obj.next().charAt(0);
            
            System.out.print("Ingresa tu Sexo: [M]asculino, [F]emenino");
            sexo = obj.next().charAt(0);
            switch (sexo) {
                case 'M':
                    totalM ++;
                    break;
                case 'F':
                    totalF ++;
                    break;
                default:
                    System.out.println("Opción no válida...");
                    continue;
            }

            System.out.printf("\nIngresa tu tipo de Participante: [A]lumno [D]ocente [T]rabajador");
            O = Character.toUpperCase(obj.next().charAt(0));

            if (edad >= 23){
                System.out.print("Felicidades fuiste aceptado");
                switch (O) {
                    case 'A':
                        totalA ++;
                        valor1 += 40;
                        break;
                    case 'D':
                        totalD ++;
                        valor2 += 60;
                        break;
                    case 'T':
                        totalT ++;
                        valor3 += 80;
                        break;
                    default:
                        System.out.println("Opción no válida...");
                        continue;
                }
            }else 
            System.out.print("fuiste rechazado...");
            
            System.out.println("\n¿Otro participante? (S/N)");
            resp = Character.toUpperCase(obj.next().charAt(0));
            Ven++;

        }while(resp!='N');

        System.out.printf("Total de alumnos aceptados: %d\n",totalA);
        System.out.printf("Total de docentes aceptados: %d\n",totalD);
        System.out.printf("Total de trabajadores aceptados: %d\n",totalT);
        System.out.printf("Total de hombres: %d\n",totalM);
        System.out.printf("Total de mujeres: %d\n",totalF);
        System.out.printf("Total de participantes: %d\n",Ven);


        System.out.printf("Total de dinero recaudado de alumnos: $%d", valor1);
        System.out.printf("Total de dinero recaudado de Docentes: $%d", valor2);
        System.out.printf("Total de dinero recaudado de Trabajadores: $%d", valor3);
        valort = valor1 + valor2 + valor3;
        System.out.printf("Total de dinero recaudado: $%d", valort);
        
        if (valort < 50){
            System.out.printf("El evento concluye con ganancias BAJAS");
        }else if (valort > 50 && valort < 1000){
            System.out.printf("El evento concluye con ganancias MODERADAS");
        }else if (valort > 1000){
            System.out.printf("El evento concluye con ganancias BUENAS");

        }
        




        }

}
