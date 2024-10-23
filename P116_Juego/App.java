package P116_Juego;

public class App {
    public static void main(String[] args) {
        JuegoDados miDados = new JuegoDados();

        miDados.iniciar();
        miDados.jugar();
        miDados.finalizar();

        JuegoAdivina miAdivina = new JuegoAdivina();
        miAdivina.iniciar();
        miAdivina.jugar();
        miAdivina.finalizar();
    }
}
