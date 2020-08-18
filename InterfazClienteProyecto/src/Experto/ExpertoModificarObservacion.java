package Experto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.ScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ExpertoModificarObservacion extends JFrame {

	private JPanel contentPane;
	private JTextField textGeolocalizacion;
	private JTextField textUsuario;
	private JTextField textFecha;
	private JTextField textID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpertoModificarObservacion frame = new ExpertoModificarObservacion();
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
	public ExpertoModificarObservacion() {
		setTitle("Modificar Observacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 709);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(25, 26, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Estado");
		lblNewLabel_1.setBounds(25, 59, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha");
		lblNewLabel_2.setBounds(25, 95, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fenomeno");
		lblNewLabel_3.setBounds(25, 133, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Localidad");
		lblNewLabel_4.setBounds(25, 168, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Usuario");
		lblNewLabel_5.setBounds(25, 209, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Geolocalizacion");
		lblNewLabel_6.setBounds(25, 249, 77, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Descripccion");
		lblNewLabel_7.setBounds(25, 289, 77, 14);
		contentPane.add(lblNewLabel_7);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(96, 288, 380, 160);
		contentPane.add(textArea);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(25, 481, 89, 23);
		contentPane.add(btnActualizar);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(96, 521, 380, 100);
		contentPane.add(scrollPane);
		
		textGeolocalizacion = new JTextField();
		textGeolocalizacion.setBounds(112, 246, 164, 20);
		contentPane.add(textGeolocalizacion);
		textGeolocalizacion.setColumns(10);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(112, 206, 164, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textFecha = new JTextField();
		textFecha.setBounds(112, 92, 164, 20);
		contentPane.add(textFecha);
		textFecha.setColumns(10);
		
		textID = new JTextField();
		textID.setBounds(112, 23, 164, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(387, 36, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(387, 91, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(387, 144, 89, 23);
		contentPane.add(btnBorrar);
		
		JComboBox comboBoxFenomeno = new JComboBox();
		comboBoxFenomeno.setBounds(112, 130, 164, 20);
		contentPane.add(comboBoxFenomeno);
		
		JComboBox comboBoxLocalidad = new JComboBox();
		comboBoxLocalidad.setBounds(112, 165, 164, 20);
		contentPane.add(comboBoxLocalidad);
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setBounds(112, 56, 164, 20);
		contentPane.add(comboBoxEstado);
	}
}
