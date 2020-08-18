package Experto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.ScrollPane;

public class ExpertoObservacionAgregar extends JFrame {

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
					ExpertoObservacionAgregar frame = new ExpertoObservacionAgregar();
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
	public ExpertoObservacionAgregar() {
		setTitle("Agregar Observacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descripccion");
		lblNewLabel.setBounds(22, 24, 70, 14);
		contentPane.add(lblNewLabel);
		
		textDescripccion = new JTextField();
		textDescripccion.setBounds(118, 21, 189, 20);
		contentPane.add(textDescripccion);
		textDescripccion.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Geolocalizacion");
		lblNewLabel_1.setBounds(22, 73, 87, 14);
		contentPane.add(lblNewLabel_1);
		
		textGeolocalizacion = new JTextField();
		textGeolocalizacion.setBounds(118, 70, 189, 20);
		contentPane.add(textGeolocalizacion);
		textGeolocalizacion.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Fenomeno");
		lblNewLabel_2.setBounds(22, 122, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBoxFenomeno = new JComboBox();
		comboBoxFenomeno.setBounds(118, 119, 189, 20);
		contentPane.add(comboBoxFenomeno);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad");
		lblNewLabel_3.setBounds(22, 168, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBoxLocalidad = new JComboBox();
		comboBoxLocalidad.setBounds(118, 165, 189, 20);
		contentPane.add(comboBoxLocalidad);
		
		JLabel lblNewLabel_4 = new JLabel("Imagen");
		lblNewLabel_4.setBounds(22, 214, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textImagen = new JTextField();
		textImagen.setBackground(SystemColor.activeCaptionBorder);
		textImagen.setBounds(118, 211, 189, 20);
		contentPane.add(textImagen);
		textImagen.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(340, 210, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(22, 260, 89, 23);
		contentPane.add(btnActualizar);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(22, 289, 407, 83);
		contentPane.add(scrollPane);
		
		JButton btnGuardarImagen = new JButton("Guardar Imagen en la BD");
		btnGuardarImagen.setBounds(22, 387, 159, 23);
		contentPane.add(btnGuardarImagen);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(92, 454, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(290, 454, 89, 23);
		contentPane.add(btnCancelar);
	}

}
