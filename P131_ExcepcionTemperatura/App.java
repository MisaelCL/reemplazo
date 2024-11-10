package P131_ExcepcionTemperatura;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
        public static float Temperatura(float temp) throws TemperaturaExcesiva {
        float farenheit;
        if (temp >= 100)
            throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        
        farenheit = ((temp*9/5) + 32);
        return farenheit;
    }

        public static void main(String[] args) {
            float temp;
            Scanner obj = new Scanner(System.in);


            try {
                System.out.println("Dame una temperatura en centigrados: ");
                temp = obj.nextFloat();
                Temperatura(temp);

                System.out.printf("%.0f grados centigrados, equivale a %.2f grados farenheit", temp, Temperatura(temp));

            } catch (TemperaturaExcesiva e) {
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e){
            System.out.println("La temperatura a convertir, debe ser un valor númerico");
            }
        }
}
