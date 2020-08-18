package Experto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;

public class ExpertoRevisaObservacion extends JFrame {

	private JPanel contentPane;
	private JTextField textID;
	private JTextField textUsuario;
	private JTextField textFecha;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpertoRevisaObservacion frame = new ExpertoRevisaObservacion();
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
	public ExpertoRevisaObservacion() {
		setTitle("Revisar Observacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(28, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		textID = new JTextField();
		textID.setText("");
		textID.setBounds(110, 28, 190, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(28, 71, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textUsuario = new JTextField();
		textUsuario.setText("");
		textUsuario.setBounds(110, 68, 190, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha");
		lblNewLabel_2.setBounds(28, 116, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textFecha = new JTextField();
		textFecha.setBounds(110, 113, 190, 20);
		contentPane.add(textFecha);
		textFecha.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Fenomeno");
		lblNewLabel_3.setBounds(28, 161, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBoxFenomeno = new JComboBox();
		comboBoxFenomeno.setBounds(110, 158, 190, 20);
		contentPane.add(comboBoxFenomeno);
		
		JLabel lblNewLabel_4 = new JLabel("Localidad");
		lblNewLabel_4.setBounds(28, 209, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBoxLocalidad = new JComboBox();
		comboBoxLocalidad.setBounds(110, 206, 190, 20);
		contentPane.add(comboBoxLocalidad);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(383, 27, 89, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblNewLabel_5 = new JLabel("Estado");
		lblNewLabel_5.setBounds(28, 253, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setBounds(110, 250, 190, 20);
		contentPane.add(comboBoxEstado);
		
		JLabel lblNewLabel_6 = new JLabel("Geolocalizacion");
		lblNewLabel_6.setBounds(28, 298, 81, 14);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(110, 295, 190, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Descripccion");
		lblNewLabel_7.setBounds(28, 341, 81, 14);
		contentPane.add(lblNewLabel_7);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(92, 341, 380, 116);
		contentPane.add(textArea);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(383, 81, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnValidar = new JButton("Validar & Guardar");
		btnValidar.setBounds(92, 564, 128, 23);
		contentPane.add(btnValidar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(383, 564, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_8 = new JLabel("Imagen");
		lblNewLabel_8.setBounds(28, 487, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnVerImagen = new JButton("Ver Imagen");
		btnVerImagen.setBounds(92, 483, 89, 23);
		contentPane.add(btnVerImagen);
	}
}
