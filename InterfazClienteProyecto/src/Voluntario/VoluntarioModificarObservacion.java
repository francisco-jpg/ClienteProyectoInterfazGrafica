package Voluntario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.ScrollPane;

public class VoluntarioModificarObservacion extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldGeolocalizacion;
	private JTextField textFieldUsuario;
	private JTextField textFieldFecha;
	private JTextField textId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VoluntarioModificarObservacion frame = new VoluntarioModificarObservacion();
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
	public VoluntarioModificarObservacion() {
		setTitle("Modificar Observacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 798);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(35, 26, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Estado");
		lblNewLabel_1.setBounds(35, 62, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha");
		lblNewLabel_2.setBounds(35, 104, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fenomeno");
		lblNewLabel_3.setBounds(35, 148, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Localidad");
		lblNewLabel_4.setBounds(35, 196, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Usuario");
		lblNewLabel_5.setBounds(35, 243, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Geolocalizacion");
		lblNewLabel_6.setBounds(35, 300, 96, 14);
		contentPane.add(lblNewLabel_6);
		
		textFieldGeolocalizacion = new JTextField();
		textFieldGeolocalizacion.setBounds(120, 297, 153, 20);
		contentPane.add(textFieldGeolocalizacion);
		textFieldGeolocalizacion.setColumns(10);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(120, 240, 155, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JComboBox comboBoxLocalidad = new JComboBox();
		comboBoxLocalidad.setBounds(120, 193, 153, 20);
		contentPane.add(comboBoxLocalidad);
		
		JComboBox comboBoxFenomeno = new JComboBox();
		comboBoxFenomeno.setBounds(120, 145, 153, 20);
		contentPane.add(comboBoxFenomeno);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setBounds(120, 101, 153, 20);
		contentPane.add(textFieldFecha);
		textFieldFecha.setColumns(10);
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setBounds(120, 59, 153, 20);
		contentPane.add(comboBoxEstado);
		
		textId = new JTextField();
		textId.setBounds(120, 23, 153, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(412, 58, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(412, 114, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(412, 178, 89, 23);
		contentPane.add(btnBorrar);
		
		JLabel lblNewLabel_7 = new JLabel("Descripccion");
		lblNewLabel_7.setBounds(35, 362, 82, 14);
		contentPane.add(lblNewLabel_7);
		
		TextArea textAreaDescripccion = new TextArea();
		textAreaDescripccion.setBounds(120, 363, 380, 160);
		contentPane.add(textAreaDescripccion);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(120, 565, 89, 23);
		contentPane.add(btnActualizar);
		
		ScrollPane scrollPaneActualizarObsVol = new ScrollPane();
		scrollPaneActualizarObsVol.setBounds(120, 618, 381, 100);
		contentPane.add(scrollPaneActualizarObsVol);
	}
}
