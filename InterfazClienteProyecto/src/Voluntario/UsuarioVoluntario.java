package Voluntario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class UsuarioVoluntario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioVoluntario frame = new UsuarioVoluntario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UsuarioVoluntario() {
		setTitle("Usuario Voluntario ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMiCuenta = new JMenu("Mi Cuenta");
		menuBar.add(mnMiCuenta);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mnMiCuenta.add(mntmModificar);
		
		JMenuItem mntmCambiarContraseña = new JMenuItem("Cambiar Contrase\u00F1a");
		mnMiCuenta.add(mntmCambiarContraseña);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnMiCuenta.add(mntmSalir);
		
		JMenu mnObservacion = new JMenu("Observacion");
		menuBar.add(mnObservacion);
		
		JMenuItem mntmCrear = new JMenuItem("Crear");
		mnObservacion.add(mntmCrear);
		
		JMenuItem mntmModificarObservacion = new JMenuItem("Modificar");
		mnObservacion.add(mntmModificarObservacion);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
