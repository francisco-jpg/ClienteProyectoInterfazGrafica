package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.ScrollPane;

public class AdmDepartamento extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmDepartamento frame = new AdmDepartamento();
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
	public AdmDepartamento() {
		setTitle("Administrar Departamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 26, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Zona");
		lblNewLabel_2.setBounds(10, 98, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textId = new JTextField();
		textId.setBackground(Color.LIGHT_GRAY);
		textId.setBounds(59, 23, 194, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(59, 57, 194, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(59, 95, 194, 20);
		contentPane.add(comboBox);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(295, 22, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(295, 56, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setBounds(295, 94, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(10, 141, 89, 23);
		contentPane.add(btnActualizar);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 193, 374, 163);
		contentPane.add(scrollPane);
	}
}
