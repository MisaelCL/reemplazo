
//Misael Campos Loera 3ro A
import java.util.Scanner;

public class pe01_PrimerExamenParcial_V2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        double promt = 0, prom;
        int Ven = 0;
        char O, sexo;
        char resp = 'S';
        char nombre;
        int edad;
        int totalA = 0, totalD = 0, totalT = 0, totalM = 0, totalF = 0, totalR = 0;

        int valor1 = 0, valor2 = 0, valor3 = 0, valort = 0;
        do {
            Ven++;
            System.out.printf("Numero aspirante: %d\n", Ven);
            System.out.printf("-----------------------------\n");

            System.out.print("Ingresa tu edad: ");
            edad = obj.nextInt();
            promt += edad;
            System.out.print("Ingresa tu nombre: ");
            nombre = obj.next().charAt(0);

            System.out.print("Ingresa tu Sexo: [M]asculino, [F]emenino: ");
            sexo = Character.toUpperCase(obj.next().charAt(0));
            switch (sexo) {
                case 'M':
                    totalM++;
                    break;
                case 'F':
                    totalF++;
                    break;
                default:
                    System.out.println("Opción no válida...");
                    continue;
            }

            System.out.printf("\nIngresa tu tipo de Participante: [A]lumno [D]ocente [T]rabajador: ");
            O = Character.toUpperCase(obj.next().charAt(0));

            if (edad >= 23) {
                System.out.printf(
                        "Felicidades fuiste aceptado: \nnombre: %c\nedad: %d\nsexo: %c\ntipo de participante: %c",
                        nombre, edad, sexo, O);
                switch (O) {
                    case 'A':
                        totalA++;
                        valor1 += 40;
                        break;
                    case 'D':
                        totalD++;
                        valor2 += 60;
                        break;
                    case 'T':
                        totalT++;
                        valor3 += 80;
                        break;
                    default:
                        System.out.println("Opción no válida...\n");
                        continue;
                }
            } else if (edad < 23) {
                System.out.print("fuiste rechazado...\n");
                totalR++;
            }
            System.out.println("\n¿Otro participante? (S/N)");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');

        System.out.printf("Total de alumnos aceptados: %d\n", totalA);
        System.out.printf("Total de docentes aceptados: %d\n", totalD);
        System.out.printf("Total de trabajadores aceptados: %d\n", totalT);
        System.out.printf("Total de hombres: %d\n", totalM);
        System.out.printf("Total de mujeres: %d\n", totalF);
        System.out.printf("Total de participantes: %d\n", Ven);
        prom = promt / Ven;
        System.out.printf("Promedio de edad de los participantes: %.2f\n", prom);
        System.out.printf("Total de Rechazados: %d\n", totalR);

        System.out.printf("Total de dinero recaudado de alumnos: $%d\n", valor1);
        System.out.printf("Total de dinero recaudado de Docentes: $%d\n", valor2);
        System.out.printf("Total de dinero recaudado de Trabajadores: $%d\n", valor3);
        valort = valor1 + valor2 + valor3;
        System.out.printf("Total de dinero recaudado: $%d\n", valort);
        System.out.printf("--------------------------------------------\n");

        if (valort < 50) {
            System.out.printf("El evento concluye con ganancias BAJAS");
        } else if (valort > 50 && valort < 1000) {
            System.out.printf("El evento concluye con ganancias MODERADAS");
        } else if (valort > 1000) {
            System.out.printf("El evento concluye con ganancias BUENAS");

        }

    }

}
