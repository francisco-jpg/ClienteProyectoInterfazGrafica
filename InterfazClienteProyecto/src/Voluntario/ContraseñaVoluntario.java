package Voluntario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Contrase�aVoluntario extends JFrame {

	private JPanel contentPane;
	private JTextField textContrase�aActual;
	private JTextField textNuevaContrase�a;
	private JTextField textRepitaContrase�a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contrase�aVoluntario frame = new Contrase�aVoluntario();
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
	public Contrase�aVoluntario() {
		setTitle("Cambiar Contrase\u00F1a");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a Actual");
		lblNewLabel.setBounds(23, 34, 106, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nueva Contrase\u00F1a");
		lblNewLabel_1.setBounds(23, 70, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Repita Contrase\u00F1a ");
		lblNewLabel_2.setBounds(23, 113, 106, 14);
		contentPane.add(lblNewLabel_2);
		
		textContrase�aActual = new JTextField();
		textContrase�aActual.setBounds(131, 31, 146, 20);
		contentPane.add(textContrase�aActual);
		textContrase�aActual.setColumns(10);
		
		textNuevaContrase�a = new JTextField();
		textNuevaContrase�a.setBounds(131, 67, 146, 20);
		contentPane.add(textNuevaContrase�a);
		textNuevaContrase�a.setColumns(10);
		
		textRepitaContrase�a = new JTextField();
		textRepitaContrase�a.setBounds(131, 110, 146, 20);
		contentPane.add(textRepitaContrase�a);
		textRepitaContrase�a.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(66, 177, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(165, 177, 89, 23);
		contentPane.add(btnCancelar);
	}
}
