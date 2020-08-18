package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JList;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class AdmObservacion extends JFrame {

	private JPanel contentPane;
	private JTextField textID;
	private JTextField textFecha;
	private JTextField textGeolocalizacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmObservacion frame = new AdmObservacion();
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
	public AdmObservacion() {
		setTitle("Administrar Observacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(27, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Estado");
		lblNewLabel_1.setBounds(27, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha");
		lblNewLabel_2.setBounds(27, 90, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fenomeno");
		lblNewLabel_3.setBounds(27, 121, 82, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Localidad");
		lblNewLabel_4.setBounds(27, 160, 72, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Usuario");
		lblNewLabel_5.setBounds(27, 196, 72, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Geolocalizacion");
		lblNewLabel_6.setBounds(27, 230, 72, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Descripcion");
		lblNewLabel_7.setBounds(27, 269, 72, 14);
		contentPane.add(lblNewLabel_7);
		
		textID = new JTextField();
		textID.setBounds(119, 28, 167, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		//* Dos pisbilidades en el combox, verificado y sin verificar **//
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setMaximumRowCount(2);
		comboBoxEstado.setBounds(119, 58, 167, 20);
		contentPane.add(comboBoxEstado);
		
		textFecha = new JTextField();
		textFecha.setBounds(119, 87, 167, 20);
		contentPane.add(textFecha);
		textFecha.setColumns(10);
		
		textGeolocalizacion = new JTextField();
		textGeolocalizacion.setBounds(119, 227, 167, 20);
		contentPane.add(textGeolocalizacion);
		textGeolocalizacion.setColumns(10);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(119, 377, 89, 23);
		contentPane.add(btnActualizar);
		
		JList list = new JList();
		list.setBounds(119, 484, 102, -48);
		contentPane.add(list);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(119, 411, 397, 100);
		contentPane.add(scrollPane);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(332, 27, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(332, 71, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(332, 117, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(332, 160, 89, 23);
		contentPane.add(btnBorrar);
		
		JComboBox comboBoxFenomeno = new JComboBox();
		comboBoxFenomeno.setBounds(119, 118, 167, 20);
		contentPane.add(comboBoxFenomeno);
		
		JComboBox comboBoxLocalidad = new JComboBox();
		comboBoxLocalidad.setBounds(119, 157, 167, 20);
		contentPane.add(comboBoxLocalidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(119, 193, 167, 20);
		contentPane.add(comboBox);
		
		TextArea textAreaDescripccion = new TextArea();
		textAreaDescripccion.setBounds(123, 269, 393, 90);
		contentPane.add(textAreaDescripccion);
	}
}
