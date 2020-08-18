package com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textEmail;
	private JTextField textUsuario;
	private JTextField textContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(27, 26, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(27, 66, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblEmail = new JLabel("E Mail ");
		lblEmail.setBounds(27, 108, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(27, 152, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setBounds(27, 192, 79, 14);
		contentPane.add(lblContraseña);
		
		textNombre = new JTextField();
		textNombre.setBounds(126, 23, 256, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(126, 63, 256, 20);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setText("");
		textEmail.setBounds(126, 105, 256, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(126, 149, 256, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textContraseña = new JTextField();
		textContraseña.setText("");
		textContraseña.setBounds(126, 189, 256, 20);
		contentPane.add(textContraseña);
		textContraseña.setColumns(10);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(86, 227, 89, 23);
		contentPane.add(btnRegistrarse);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(261, 227, 89, 23);
		contentPane.add(btnCancelar);
	}

}
