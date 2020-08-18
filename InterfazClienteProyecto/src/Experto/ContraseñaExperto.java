package Experto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class ContraseñaExperto extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordContraseñaActual;
	private JPasswordField passwordContraseñaNueva;
	private JPasswordField passwordRepitaContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContraseñaExperto frame = new ContraseñaExperto();
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
	public ContraseñaExperto() {
		setTitle("Cambiar Contrase\u00F1a");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a Actual");
		lblNewLabel.setBounds(25, 33, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a Nueva");
		lblNewLabel_1.setBounds(25, 71, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Repita Contrase\u00F1a");
		lblNewLabel_2.setBounds(25, 108, 103, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordContraseñaActual = new JPasswordField();
		passwordContraseñaActual.setBounds(138, 30, 200, 20);
		contentPane.add(passwordContraseñaActual);
		
		passwordContraseñaNueva = new JPasswordField();
		passwordContraseñaNueva.setBounds(138, 68, 200, 20);
		contentPane.add(passwordContraseñaNueva);
		
		passwordRepitaContraseña = new JPasswordField();
		passwordRepitaContraseña.setBounds(138, 105, 200, 20);
		contentPane.add(passwordRepitaContraseña);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(85, 183, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(217, 183, 89, 23);
		contentPane.add(btnCancelar);
	}
}
