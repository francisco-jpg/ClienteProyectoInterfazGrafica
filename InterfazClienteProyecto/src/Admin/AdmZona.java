package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.ScrollPane;

public class AdmZona extends JFrame {

	private JPanel contentPane;
	private JTextField textID;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmZona frame = new AdmZona();
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
	public AdmZona() {
		setTitle("Administrar Zona");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID Zona");
		lblNewLabel.setBounds(36, 37, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(36, 73, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textID = new JTextField();
		textID.setBackground(Color.LIGHT_GRAY);
		textID.setBounds(92, 34, 173, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(92, 70, 173, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(311, 33, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(311, 69, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(311, 103, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(311, 137, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(36, 137, 89, 23);
		contentPane.add(btnActualizar);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(36, 174, 364, 100);
		contentPane.add(scrollPane);
	}

}
