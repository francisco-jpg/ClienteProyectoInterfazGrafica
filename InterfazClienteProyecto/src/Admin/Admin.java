package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import java.awt.Font;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMicuenta = new JMenu("Mi Cuenta");
		menuBar.add(mnMicuenta);
		
		JCheckBoxMenuItem mntmModificar = new JCheckBoxMenuItem("Modificar");
		mnMicuenta.add(mntmModificar);
		
		JCheckBoxMenuItem mntmCambiarContraseña = new JCheckBoxMenuItem("Cambiar Contrase\u00F1a");
		mnMicuenta.add(mntmCambiarContraseña);
		
		JCheckBoxMenuItem mntmSalir = new JCheckBoxMenuItem("Salir");
		mnMicuenta.add(mntmSalir);
		
		JMenu mnAdministracion = new JMenu("Administracion");
		menuBar.add(mnAdministracion);
		
		JCheckBoxMenuItem mntmUsuarios = new JCheckBoxMenuItem("Usuarios");
		mnAdministracion.add(mntmUsuarios);
		
		JCheckBoxMenuItem mntmObservacion = new JCheckBoxMenuItem("Observacion");
		mnAdministracion.add(mntmObservacion);
		
		JCheckBoxMenuItem mntmLocalidad = new JCheckBoxMenuItem("Localidad");
		mnAdministracion.add(mntmLocalidad);
		
		JCheckBoxMenuItem mntmZonas = new JCheckBoxMenuItem("Zonas");
		mnAdministracion.add(mntmZonas);
		
		JCheckBoxMenuItem mntmDepartamentos = new JCheckBoxMenuItem("Departamentos");
		mnAdministracion.add(mntmDepartamentos);
		
		JCheckBoxMenuItem mntmFenomeno = new JCheckBoxMenuItem("Fenomenos");
		mnAdministracion.add(mntmFenomeno);
		
		JMenu mnMisObservaciones = new JMenu("Mis Observaciones");
		menuBar.add(mnMisObservaciones);
		
		JCheckBoxMenuItem mntmCrearObservacion = new JCheckBoxMenuItem("Crear Observacion");
		mnMisObservaciones.add(mntmCrearObservacion);
		
		JCheckBoxMenuItem mntmlistarobservaciones = new JCheckBoxMenuItem("Listar mis observaciones");
		mnMisObservaciones.add(mntmlistarobservaciones);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setBounds(143, 90, 126, 35);
		contentPane.add(lblNewLabel);
	}

}
