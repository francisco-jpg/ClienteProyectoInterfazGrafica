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

public class AdmLocalidad extends JFrame {

	private JPanel contentPane;
	private JTextField textGeolocalizacion;
	private JTextField textID;
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmLocalidad frame = new AdmLocalidad();
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
	public AdmLocalidad() {
		setTitle("Administrar Localidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(30, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(30, 68, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Geolocalizacion");
		lblNewLabel_2.setBounds(30, 110, 80, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Departamento");
		lblNewLabel_3.setBounds(30, 152, 80, 14);
		contentPane.add(lblNewLabel_3);
		
		textGeolocalizacion = new JTextField();
		textGeolocalizacion.setBounds(120, 107, 177, 20);
		contentPane.add(textGeolocalizacion);
		textGeolocalizacion.setColumns(10);
		
		textID = new JTextField();
		textID.setBackground(Color.LIGHT_GRAY);
		textID.setBounds(120, 29, 177, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(120, 65, 177, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(120, 149, 177, 20);
		contentPane.add(comboBox);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(383, 28, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(383, 68, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(383, 110, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(383, 152, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(30, 206, 89, 23);
		contentPane.add(btnActualizar);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(30, 249, 442, 100);
		contentPane.add(scrollPane);
	}
}
