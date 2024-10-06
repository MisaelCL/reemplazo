//Calcula la hipotenusa de un triangulo rectangulo dadas las longitudes de sus lados
import java.util.Scanner;
//

public class P10_HipotenusaTriangulo {
    public static void main(String[] args) {
        int longitudlado1, longitudlado2;
        double hipotenusa;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame la longitud del lado numero 1:"); longitudlado1 = obj.nextInt();
        System.out.println("Dame la longitud del lado numero 2:"); longitudlado2 = obj.nextInt();
        hipotenusa = Math.sqrt(longitudlado1*longitudlado1+longitudlado2*longitudlado2);
        System.out.println("La hipotenusa es: "+ hipotenusa);
    }

}