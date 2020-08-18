package Voluntario;

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

public class VoluntarioCrearObservacion extends JFrame {

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
					VoluntarioCrearObservacion frame = new VoluntarioCrearObservacion();
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
	public VoluntarioCrearObservacion() {
		setTitle("Crear Observacion ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descripccion");
		lblNewLabel.setBounds(38, 31, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Geolocalizacion");
		lblNewLabel_1.setBounds(38, 73, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fenomeno");
		lblNewLabel_2.setBounds(38, 115, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad");
		lblNewLabel_3.setBounds(38, 161, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Imagen");
		lblNewLabel_4.setBounds(38, 201, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textDescripccion = new JTextField();
		textDescripccion.setBounds(130, 28, 169, 20);
		contentPane.add(textDescripccion);
		textDescripccion.setColumns(10);
		
		textGeolocalizacion = new JTextField();
		textGeolocalizacion.setBounds(130, 70, 169, 20);
		contentPane.add(textGeolocalizacion);
		textGeolocalizacion.setColumns(10);
		
		JComboBox comboBoxFenomeno = new JComboBox();
		comboBoxFenomeno.setBounds(130, 112, 169, 20);
		contentPane.add(comboBoxFenomeno);
		
		JComboBox comboBoxLocalidad = new JComboBox();
		comboBoxLocalidad.setBounds(130, 158, 169, 20);
		contentPane.add(comboBoxLocalidad);
		
		textImagen = new JTextField();
		textImagen.setBackground(Color.LIGHT_GRAY);
		textImagen.setBounds(130, 198, 169, 20);
		contentPane.add(textImagen);
		textImagen.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(340, 197, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(38, 247, 89, 23);
		contentPane.add(btnActualizar);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(38, 290, 391, 100);
		contentPane.add(scrollPane);
		
		JButton btnGuardarImagen = new JButton("Guardar Imagen en la BD");
		btnGuardarImagen.setBounds(38, 406, 190, 23);
		contentPane.add(btnGuardarImagen);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(99, 474, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(297, 474, 89, 23);
		contentPane.add(btnCancelar);
	}
}
