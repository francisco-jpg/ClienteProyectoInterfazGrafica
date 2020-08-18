package Experto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;

public class UsuarioExperto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioExperto frame = new UsuarioExperto();
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
	public UsuarioExperto() {
		setTitle("Usuario Experto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 399);
		
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
		
		JMenu mnRevision = new JMenu("Revision");
		menuBar.add(mnRevision);
		
		JMenuItem mntmObservacciones = new JMenuItem("Observaciones");
		mnRevision.add(mntmObservacciones);
		
		JMenu mnMisObservaciones = new JMenu("Mis Observaciones");
		menuBar.add(mnMisObservaciones);
		
		JMenuItem mntmCrear = new JMenuItem("Crear");
		mnMisObservaciones.add(mntmCrear);
		
		JMenuItem mntmModificarObservaciones = new JMenuItem("Modificar");
		mnMisObservaciones.add(mntmModificarObservaciones);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
