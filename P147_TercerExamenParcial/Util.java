package P147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Util {

    public static void serializarDatos(String fileName, ArrayList<Jugador> datos) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(datos);  
        }
    }

    public static ArrayList<Jugador> desSerializarDatos(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("El archivo no existe: " + fileName);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (ArrayList<Jugador>) ois.readObject();  // Lee el objeto del archivo y lo convierte a ArrayList<Jugador>
        }
    }
}
