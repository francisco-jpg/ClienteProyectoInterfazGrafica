package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.ScrollPane;

public class AgregarObservacion extends JFrame {

	private JPanel contentPane;
	private JTextField textDescripccion;
	private JTextField textGeolocalizacion;
	private JTextField textImagen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarObservacion frame = new AgregarObservacion();
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
	public AgregarObservacion() {
		setTitle("Agregar Observacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descripccion");
		lblNewLabel.setBounds(10, 11, 77, 14);
		contentPane.add(lblNewLabel);
		
		textDescripccion = new JTextField();
		textDescripccion.setBounds(97, 8, 189, 20);
		contentPane.add(textDescripccion);
		textDescripccion.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Geolocalizacion");
		lblNewLabel_1.setBounds(10, 47, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		textGeolocalizacion = new JTextField();
		textGeolocalizacion.setBounds(97, 39, 189, 20);
		contentPane.add(textGeolocalizacion);
		textGeolocalizacion.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Fenomeno");
		lblNewLabel_2.setBounds(10, 92, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBoxFenomeno = new JComboBox();
		comboBoxFenomeno.setBounds(97, 89, 189, 20);
		contentPane.add(comboBoxFenomeno);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad");
		lblNewLabel_3.setBounds(10, 138, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBoxLocalidad = new JComboBox();
		comboBoxLocalidad.setBounds(97, 135, 189, 20);
		contentPane.add(comboBoxLocalidad);
		
		JLabel lblNewLabel_4 = new JLabel("Imagen");
		lblNewLabel_4.setBounds(10, 188, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textImagen = new JTextField();
		textImagen.setBackground(Color.LIGHT_GRAY);
		textImagen.setBounds(97, 185, 189, 20);
		contentPane.add(textImagen);
		textImagen.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(311, 184, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(10, 226, 89, 23);
		contentPane.add(btnActualizar);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 255, 390, 100);
		contentPane.add(scrollPane);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(111, 437, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnGuardarImagen = new JButton("Guardar Imagen en BD");
		btnGuardarImagen.setBounds(10, 383, 168, 23);
		contentPane.add(btnGuardarImagen);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(252, 437, 89, 23);
		contentPane.add(btnCancelar);
	}

}
