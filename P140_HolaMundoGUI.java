import javax.swing.*;
import java.awt.*;

public class P140_HolaMundoGUI extends JFrame {
    private JLabel lblSaludo;

    public P140_HolaMundoGUI() {
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo.");
        lblSaludo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lblSaludo.setBounds(10, 20, 200, 30);
        add(lblSaludo);
    }

    public static void main(String[] args) {
        P140_HolaMundoGUI app = new P140_HolaMundoGUI();
        app.setBounds(10, 10, 400, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
