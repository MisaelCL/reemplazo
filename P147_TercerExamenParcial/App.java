package P147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener {
    ArrayList<Jugador> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JDialog jdlAcercaDe;
    JLabel lblDatos, lblNombre, lblEdad, lblSexo, lblEstadoCivil, lblDescripcion, lblSalario;
    JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar;

    public App() {
        super("Datos de Jugadores");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);
        smnAbrir = new JMenuItem("Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);
        smnSalir = new JMenuItem("Salir");
        smnSalir.addActionListener(this);
        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smnSalir);
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);
        smnAcercade = new JMenuItem("Acerca de ..");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);

        jdlAcercaDe = new JDialog(this, "Acerca de ..");
        jdlAcercaDe.setSize(325, 150);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Programación Orientada a Objetos I<br>Misael campos Loera</html>", JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3, 1, 0, 0));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.YELLOW);
        table.getTableHeader().setForeground(Color.BLACK);
        spane.setViewportView(table);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] { "Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario" });
        table.setModel(modelo);
        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                mostrarDatos(row);
            }
        });

        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(6, 2, 0, 0));
        
        lblNombre = new JLabel("Nombre: ");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        
        lblEdad = new JLabel("Edad: ");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        
        lblSexo = new JLabel("Sexo: ");
        lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);
        
        lblEstadoCivil = new JLabel("Estado Civil: ");
        lblEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEstadoCivil = new JTextField();
        pnlDatos.add(lblEstadoCivil);
        pnlDatos.add(txtEstadoCivil);
        
        lblDescripcion = new JLabel("Descripción: ");
        lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
        
        lblSalario = new JLabel("Salario: ");
        lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);

        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        } else if (e.getSource() == smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[] { "dat" }));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                try {
                    datos = Util.desSerializarDatos(archivo.getAbsolutePath());
                    cargarDatos();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[] { "dat" }));
            int res = fchArchivo.showSaveDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                String filePath = archivo.getAbsolutePath();
                if (!filePath.endsWith(".dat")) {
                    filePath += ".dat";
                }
                try {
                    Util.serializarDatos(filePath, datos);
                    JOptionPane.showMessageDialog(this, "Datos grabados correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == btnAgregar) {
            activarCampos(true);
            btnGrabar.setEnabled(true);
            btnAgregar.setEnabled(true);
        } else if (e.getSource() == btnGrabar) {
            guardarCampos();
        }
    }

    private void guardarCampos() {
        if (txtNombre.getText().isEmpty() || txtEdad.getText().isEmpty() || txtSexo.getText().isEmpty() || txtEstadoCivil.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtSalario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Jugador jugador = new Jugador();
        jugador.setNombre(txtNombre.getText());
        jugador.setEdad(Integer.parseInt(txtEdad.getText()));
        jugador.setSexo(txtSexo.getText().charAt(0));
        jugador.setEstadoCivil(txtEstadoCivil.getText());
        jugador.setDescripcion(txtDescripcion.getText());
        jugador.setSalario(Double.parseDouble(txtSalario.getText()));

        datos.add(jugador);

        // Añadir los datos a la tabla
        modelo.addRow(new Object[] { jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), jugador.getEstadoCivil(), jugador.getDescripcion(), jugador.getSalario() });

        limpiarCampos();

        activarCampos(false);

        btnGrabar.setEnabled(false);
        btnAgregar.setEnabled(true);
    }

    private void activarCampos(boolean b) {
        txtNombre.setEnabled(b);
        txtEdad.setEnabled(b);
        txtSexo.setEnabled(b);
        txtEstadoCivil.setEnabled(b);
        txtDescripcion.setEnabled(b);
        txtSalario.setEnabled(b);
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtSexo.setText("");
        txtEstadoCivil.setText("");
        txtDescripcion.setText("");
        txtSalario.setText("");
    }

    private void cargarDatos() {
        modelo.setRowCount(0);
        for (Jugador jugador : datos) {
            modelo.addRow(new Object[] { jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), jugador.getEstadoCivil(), jugador.getDescripcion(), jugador.getSalario() });
        }
    }

    private void mostrarDatos(int row) {
        Jugador jugador = datos.get(row);
        txtNombre.setText(jugador.getNombre());
        txtEdad.setText(String.valueOf(jugador.getEdad()));
        txtSexo.setText(String.valueOf(jugador.getSexo()));
        txtEstadoCivil.setText(jugador.getEstadoCivil());
        txtDescripcion.setText(jugador.getDescripcion());
        txtSalario.setText(String.valueOf(jugador.getSalario()));
    }

    public static void main(String[] args) {
        App app = new App();
        app.setSize(600, 400);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
