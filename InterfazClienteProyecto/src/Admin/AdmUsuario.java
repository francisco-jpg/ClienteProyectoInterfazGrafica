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
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTabbedPane;

public class AdmUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textID;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmUsuario frame = new AdmUsuario();
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
	public AdmUsuario() {
		setTitle("Administracion de Usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(33, 34, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(33, 63, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(33, 100, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E Mail");
		lblNewLabel_3.setBounds(33, 135, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contrase\u00F1a");
		lblNewLabel_4.setBounds(33, 172, 69, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Permiso");
		lblNewLabel_5.setBounds(33, 216, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textID = new JTextField();
		textID.setBackground(Color.LIGHT_GRAY);
		textID.setBounds(120, 31, 199, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 60, 199, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 97, 199, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 132, 199, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 172, 199, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(120, 213, 199, 20);
		contentPane.add(comboBox);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(403, 30, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(403, 62, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnModificar = new JButton("Modifiar");
		btnModificar.setBounds(403, 96, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(403, 131, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(33, 257, 89, 23);
		contentPane.add(btnActualizar);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("New check item");
		chckbxmntmNewCheckItem.setBounds(130, 208, 129, 22);
		contentPane.add(chckbxmntmNewCheckItem);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(33, 291, 468, 78);
		contentPane.add(tabbedPane);
		
		JLabel lblNewLabel_6 = new JLabel("Aqui buscar usuarios por Id");
		lblNewLabel_6.setBounds(178, 11, 190, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Mostrar usuarios / buscados y actualizados");
		lblNewLabel_7.setBounds(202, 261, 246, 23);
		contentPane.add(lblNewLabel_7);
	}
}
