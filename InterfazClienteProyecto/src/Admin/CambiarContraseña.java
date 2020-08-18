package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CambiarContrase�a extends JFrame {

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
					CambiarContrase�a frame = new CambiarContrase�a();
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
	public CambiarContrase�a() {
		setTitle("Cambiar Contrase\u00F1a");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a Actual");
		lblNewLabel.setBounds(49, 43, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nueva Contrase\u00F1a");
		lblNewLabel_1.setBounds(49, 94, 98, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Repita Contrase\u00F1a");
		lblNewLabel_2.setBounds(49, 153, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		textContrase�aActual = new JTextField();
		textContrase�aActual.setBounds(180, 40, 191, 20);
		contentPane.add(textContrase�aActual);
		textContrase�aActual.setColumns(10);
		
		textNuevaContrase�a = new JTextField();
		textNuevaContrase�a.setBounds(180, 91, 191, 20);
		contentPane.add(textNuevaContrase�a);
		textNuevaContrase�a.setColumns(10);
		
		textRepitaContrase�a = new JTextField();
		textRepitaContrase�a.setBounds(180, 150, 191, 20);
		contentPane.add(textRepitaContrase�a);
		textRepitaContrase�a.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(107, 212, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(249, 212, 89, 23);
		contentPane.add(btnCancelar);
	}

}
