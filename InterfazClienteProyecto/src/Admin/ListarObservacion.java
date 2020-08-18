package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.ScrollPane;

public class ListarObservacion extends JFrame {

	private JPanel contentPane;
	private JTextField textIdUsuario;
	private JTextField textFechaDesde;
	private JTextField textFechaHasta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarObservacion frame = new ListarObservacion();
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
	public ListarObservacion() {
		setTitle("Listar Observacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fecha Desde");
		lblNewLabel.setBounds(27, 59, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID Usuario");
		lblNewLabel_1.setBounds(27, 21, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha Hasta");
		lblNewLabel_2.setBounds(218, 59, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de Fenomeno");
		lblNewLabel_3.setBounds(27, 108, 97, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Departamento");
		lblNewLabel_4.setBounds(27, 146, 84, 14);
		contentPane.add(lblNewLabel_4);
		
		textIdUsuario = new JTextField();
		textIdUsuario.setBounds(97, 18, 180, 20);
		contentPane.add(textIdUsuario);
		textIdUsuario.setColumns(10);
		
		textFechaDesde = new JTextField();
		textFechaDesde.setBounds(104, 56, 86, 20);
		contentPane.add(textFechaDesde);
		textFechaDesde.setColumns(10);
		
		textFechaHasta = new JTextField();
		textFechaHasta.setBounds(295, 56, 86, 20);
		contentPane.add(textFechaHasta);
		textFechaHasta.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(134, 105, 151, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(134, 140, 151, 20);
		contentPane.add(comboBox_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(412, 17, 106, 23);
		contentPane.add(btnBuscar);
		
		JButton btnBorrarDatos = new JButton("Borrar Datos");
		btnBorrarDatos.setBounds(412, 73, 106, 28);
		contentPane.add(btnBorrarDatos);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(27, 205, 491, 171);
		contentPane.add(scrollPane);
	}

}
