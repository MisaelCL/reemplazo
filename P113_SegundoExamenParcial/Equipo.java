package P113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador>Jugadores;

    public Equipo() {
    }

    public Equipo(String nombre, String liga) {
        Jugadores = new ArrayList<>();
        Nombre = nombre;
        Liga = liga;
    }

    public void agregarJugador(Jugador jugador){
        Jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores(){
        return Jugadores;
    }

   public double getTotalBono(){
       double bono = 0;
        for (Jugador jugador : Jugadores) {
           bono += jugador.getBono();
       }
       return bono;
   }

    public double getTotal(){
        double total = 0;
        for (Jugador jugador : Jugadores){
            total += jugador.Total;
        }
        return total;
    }

    public int getTotalH(){
        int TotalH = 0;
        for (Jugador jugador : Jugadores){
            if (jugador.Sexo == 'H');
            TotalH += TotalH;
           }
        return TotalH;
       
   }

   public int getTotalM(){
        int TotalM = 0;
        for (Jugador jugador : Jugadores){
            if (jugador.Sexo == 'M');
            TotalM += TotalM;
           }
           return TotalM;
       
   }

    public void reporte(){
        System.out.println(this);
        for (Jugador jugador : Jugadores)
            System.out.println(jugador);
        System.out.println();
        System.out.println("\n");
        }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores + "Bono = " + getTotalBono() +", Total=" + getTotal() + ", Hombres= "+ getTotalH()+", Mujeres= "+ getTotalM()+"]";
    }

}
