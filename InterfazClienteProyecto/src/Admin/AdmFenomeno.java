package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.ScrollPane;

public class AdmFenomeno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textTelEmergencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmFenomeno frame = new AdmFenomeno();
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
	public AdmFenomeno() {
		setTitle("Administrar Fenomeno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 28, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 53, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Descripccion");
		lblNewLabel_2.setBounds(10, 78, 85, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(118, 25, 235, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 50, 235, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(118, 78, 235, 72);
		contentPane.add(editorPane);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(386, 24, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(386, 69, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(386, 110, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(386, 155, 89, 23);
		contentPane.add(btnBorrar);
		
		JLabel lblNewLabel_3 = new JLabel("Telef - Emergencia");
		lblNewLabel_3.setBounds(10, 176, 99, 14);
		contentPane.add(lblNewLabel_3);
		
		textTelEmergencia = new JTextField();
		textTelEmergencia.setBounds(118, 173, 235, 20);
		contentPane.add(textTelEmergencia);
		textTelEmergencia.setColumns(10);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(10, 223, 89, 23);
		contentPane.add(btnActualizar);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 259, 465, 100);
		contentPane.add(scrollPane);
	}
}
