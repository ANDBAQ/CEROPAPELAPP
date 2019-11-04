package desmaterializar;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class menu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Color principal= new Color(30,144,255);
	Color secundario= new Color(100,149,237);
	
	JButton btnNewButton,btnSubirUnDocumento;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(27, 194, 730, 357);
		contentPane.add(layeredPane);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(0, 0, 730, 357);
		layeredPane.add(panel_9);
		panel_9.setLayout(null);
		
		
		// crear tabla
		String [][] datos= {{"Anderson aya","15358759","c//documents","estado"},{"Anderson aya","15358759","c//documents","estado"}};
		String [] cabezera= {"Nombre","No. de documento","Documento","Estado"};

		
		table_1 = new JTable(datos,cabezera);
		
		
		table_1.setBounds(21, 22, 676, 295);
		panel_9.add(table_1);
		panel_9.setVisible(false);
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 730, 357);
		layeredPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(169, 169, 169));
		panel_2.setBounds(54, 76, 194, 197);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblVistaPrevia = new JLabel("Vista previa");
		lblVistaPrevia.setBounds(10, 59, 140, 59);
		panel_2.add(lblVistaPrevia);
		
		JButton btnSubirUn = new JButton("Subir una nueva versi\u00F3n");
		btnSubirUn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubirUn.setBackground(new Color(30, 144, 255));
		btnSubirUn.setBounds(384, 299, 249, 33);
		panel_1.add(btnSubirUn);
		
		JLabel lblNewLabel = new JLabel("Nombre del estudiante");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(330, 11, 390, 59);
		panel_1.add(lblNewLabel);
		
		
		JLabel lblDetallesDelCocumento = new JLabel("Detalles del documento");
		lblDetallesDelCocumento.setForeground(Color.BLUE);
		lblDetallesDelCocumento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDetallesDelCocumento.setBounds(330, 136, 390, 46);
		panel_1.add(lblDetallesDelCocumento);
		
		JLabel lblCreadoPor = new JLabel("27/10/2019  Creado por user1");
		lblCreadoPor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCreadoPor.setBounds(330, 180, 390, 46);
		panel_1.add(lblCreadoPor);
		
		JLabel lblVence = new JLabel("Vigencia 6 meses a partir de la fecha");
		lblVence.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVence.setBounds(330, 227, 390, 46);
		panel_1.add(lblVence);
		
		JButton btnDescargarDocumento = new JButton("Descargar documento");
		btnDescargarDocumento.setBackground(new Color(30, 144, 255));
		btnDescargarDocumento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDescargarDocumento.setBounds(106, 299, 240, 33);
		panel_1.add(btnDescargarDocumento);
		
		JLabel lblDirigidoAEps = new JLabel("Dirigido a: EPS");
		lblDirigidoAEps.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDirigidoAEps.setBounds(330, 56, 390, 59);
		panel_1.add(lblDirigidoAEps);
		
		JButton button = new JButton("");
		button.setBackground(Color.WHITE);
		
		button.setIcon(new ImageIcon(menu.class.getResource("/desmaterializar/flecha.png")));
		button.setBounds(22, 22, 101, 43);
		panel_1.add(button);
		panel_1.setVisible(false);
		panel_2.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 730, 357);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNumeroDeDocumento = new JLabel("Numero de documento");
		lblNumeroDeDocumento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumeroDeDocumento.setBounds(34, 76, 235, 52);
		panel.add(lblNumeroDeDocumento);
		
		textField = new JTextField();
		textField.setBackground(new Color(135, 206, 235));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(313, 76, 313, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		
		btnBuscar.setBackground(SystemColor.textHighlight);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscar.setBounds(267, 274, 173, 40);
		panel.add(btnBuscar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 730, 357);
		layeredPane.add(panel_3);
		panel_3.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setBounds(348, 52, 338, 45);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(348, 229, 338, 62);
		panel_3.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de documento");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(348, 11, 297, 45);
		panel_3.add(lblNewLabel_1);
		panel_3.setVisible(false);
		
		JLabel lblDetalles = new JLabel("Detalles");
		lblDetalles.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDetalles.setBounds(348, 184, 297, 45);
		panel_3.add(lblDetalles);
		
		JButton btnSubirDocumento = new JButton("Subir documento");
		btnSubirDocumento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubirDocumento.setBackground(SystemColor.textHighlight);
		btnSubirDocumento.setBounds(217, 301, 196, 45);
		panel_3.add(btnSubirDocumento);
		
		JButton btnNewButton_1 = new JButton("Seleccionar archivo..");
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(57, 78, 189, 195);
		panel_3.add(btnNewButton_1);
		
		JLabel lblDirigidoA = new JLabel("Dirigido a");
		lblDirigidoA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDirigidoA.setBounds(348, 100, 297, 45);
		panel_3.add(lblDirigidoA);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(348, 144, 338, 45);
		panel_3.add(textField_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 730, 357);
		layeredPane.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.GRAY);
		panel_6.setBounds(21, 21, 205, 189);
		panel_5.add(panel_6);
		
		JLabel lblPlantillaIngSistemas = new JLabel("Plantilla Ing. sistemas");
		lblPlantillaIngSistemas.setBounds(36, 221, 166, 14);
		panel_5.add(lblPlantillaIngSistemas);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.GRAY);
		panel_7.setBounds(269, 21, 205, 189);
		panel_5.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.GRAY);
		panel_8.setBounds(515, 21, 205, 189);
		panel_5.add(panel_8);
		
		JLabel lblPlantillaIngQuimica = new JLabel("Plantilla Ing. quimica");
		lblPlantillaIngQuimica.setBounds(279, 221, 166, 14);
		panel_5.add(lblPlantillaIngQuimica);
		
		JLabel lblPlantillaIngIndustrial = new JLabel("Plantilla Ing. industrial");
		lblPlantillaIngIndustrial.setBounds(515, 221, 166, 14);
		panel_5.add(lblPlantillaIngIndustrial);
		
		panel.setVisible(true);
		panel_3.setVisible(false);
		
		
		// boton consultar
		btnNewButton = new JButton("Consultar");
		
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(27, 145, 172, 50);
		contentPane.add(btnNewButton);
		//boton subir documento(menu)
		btnSubirUnDocumento = new JButton("Subir un documento");
		
		btnSubirUnDocumento.setBackground(new Color(100, 149, 237));
		btnSubirUnDocumento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubirUnDocumento.setBounds(540, 145, 217, 50);
		contentPane.add(btnSubirUnDocumento);
		
		JLabel label = new JLabel("  UTADEO - Certificados de estudio");
		label.setIcon(new ImageIcon(menu.class.getResource("/desmaterializar/logo.png")));
		label.setForeground(SystemColor.textHighlight);
		label.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label.setBounds(21, 11, 736, 99);
		contentPane.add(label);
		
		JButton btnSolicitudes = new JButton("Solicitudes");
		
		btnSolicitudes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSolicitudes.setBackground(new Color(30, 144, 255));
		btnSolicitudes.setBounds(197, 145, 172, 50);
		contentPane.add(btnSolicitudes);
		
		
		
		
		
		JButton btnPlantillas = new JButton("Plantillas");
		btnPlantillas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlantillas.setBackground(new Color(30, 144, 255));
		btnPlantillas.setBounds(368, 145, 172, 50);
		contentPane.add(btnPlantillas);
		
		
		//colores al inicio 
		btnNewButton.setBackground(principal);
		btnSubirUnDocumento.setBackground(secundario);
		btnSolicitudes.setBackground(secundario);
		btnPlantillas.setBackground(secundario);
		
		
		btnPlantillas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel_1.setVisible(false);
				panel.setVisible(false);
				panel_5.setVisible(true);
				panel_9.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				
				btnNewButton.setBackground(secundario);
				btnSubirUnDocumento.setBackground(secundario);
				btnSolicitudes.setBackground(secundario);
				btnPlantillas.setBackground(principal);
				
				
			}
		});
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_3.setVisible(false);
				panel_2.setVisible(true);
				panel_5.setVisible(false);
				panel_1.setVisible(true);
				panel.setVisible(false);
				panel_9.setVisible(false);
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel_2.setVisible(false);
				panel_5.setVisible(false);
				panel_1.setVisible(false);
				panel.setVisible(true);
				panel_9.setVisible(false);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
				panel_5.setVisible(false);
				panel_9.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				
				btnNewButton.setBackground(principal);
				btnSubirUnDocumento.setBackground(secundario);
				btnSolicitudes.setBackground(secundario);
				btnPlantillas.setBackground(secundario);
				
			}
		});
		
		btnSolicitudes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.setVisible(false);
				panel.setVisible(false);
				panel_5.setVisible(false);
				panel_9.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				
				btnNewButton.setBackground(secundario);
				btnSubirUnDocumento.setBackground(secundario);
				btnSolicitudes.setBackground(principal);
				btnPlantillas.setBackground(secundario);
			}
		});
		btnSubirUnDocumento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_1.setVisible(false);
				panel_5.setVisible(false);
				panel.setVisible(false);
				panel_9.setVisible(false);
				
				btnSubirUnDocumento.setBackground(principal);
				btnNewButton.setBackground(secundario);
				btnSolicitudes.setBackground(secundario);
				btnPlantillas.setBackground(secundario);
			}
		});
		
	}
}
