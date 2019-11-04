package desmaterializar;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pantalla1 extends JFrame {

	private JPanel contentPane;
	
	ImageIcon imagen;
	Graphics g;
	private JPasswordField pwdContrasea;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantalla1 frame = new pantalla1();
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
	public pantalla1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800,600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension d=getSize();
		
		JLabel lblNewLabel_1 = new JLabel("  UTADEO - Certificados de estudio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setIcon(new ImageIcon(pantalla1.class.getResource("/desmaterializar/logo.png")));
		lblNewLabel_1.setBounds(25, 11, 736, 99);
		contentPane.add(lblNewLabel_1);
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(25, 121, 363, 325);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon(pantalla1.class.getResource("/desmaterializar/imagen1.jpg")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlightText);
		panel_1.setBounds(418, 121, 343, 430);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnIniciarSesin = new JButton("Iniciar sesi\u00F3n");
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new menu().setVisible(true);
				
				
			}
		});
		btnIniciarSesin.setForeground(SystemColor.textHighlightText);
		btnIniciarSesin.setBackground(SystemColor.textHighlight);
		btnIniciarSesin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIniciarSesin.setBounds(97, 284, 179, 39);
		panel_1.add(btnIniciarSesin);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.setBackground(new Color(135, 206, 235));
		pwdContrasea.setBounds(155, 176, 157, 41);
		panel_1.add(pwdContrasea);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(26, 73, 84, 41);
		panel_1.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBackground(new Color(135, 206, 235));
		textField.setBounds(155, 73, 157, 41);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasea.setBounds(26, 173, 116, 39);
		panel_1.add(lblContrasea);
		
		JLabel lblRecuperarCuenta = new JLabel("Recuperar cuenta");
		lblRecuperarCuenta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRecuperarCuenta.setBounds(133, 343, 144, 31);
		panel_1.add(lblRecuperarCuenta);
		imagen=new ImageIcon(pantalla1.class.getResource("/desmaterializar/imagen1.jpg"));
		
	
		
	}
}
