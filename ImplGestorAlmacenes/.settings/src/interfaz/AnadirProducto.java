package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import dominio.AgenteProducto;
import dominio.Producto;

import java.awt.Choice;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class AnadirProducto {
	private JFrame frame;
	private JButton btnAnadir;
	private Choice choicetype;
	private Label label;
	private Label label_1;
	private Label label_2;
	private Label label_3;
	private Choice choice_cat;
	private Label label_4;
	private JTextField textIdprod;
	private JTextField textFieldUnidades;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnadirProducto window = new AnadirProducto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
public void mostrar(){
		
		frame.setVisible(true);
	}
	
	public AnadirProducto() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 283);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			btnAnadir = new JButton("Anadir Producto");
			//aceptar
			btnAnadir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// Obtenemos solamente la fecha pero usamos slash en lugar de guiones
					Date date = new Date();
					DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
					String convertido = fecha.format(date);					
					Producto producto = new Producto(0,textIdprod.getText(),Integer.parseInt(textFieldUnidades.getText()),choice_cat.getSelectedItem(),convertido);
					AgenteProducto p=new AgenteProducto();
					p.insertProducto(producto);
				}
			});
			btnAnadir.setBounds(296, 201, 143, 23);
			frame.getContentPane().add(btnAnadir);
		}
		{
			choicetype = new Choice();
			choicetype.setBounds(40, 38, 122, 20);
			frame.getContentPane().add(choicetype);
		}
		{
			label = new Label("Tipo de producto");
			label.setBounds(41, 10, 95, 22);
			frame.getContentPane().add(label);
		}
		{
			label_1 = new Label("Producto");
			label_1.setBounds(40, 119, 62, 22);
			frame.getContentPane().add(label_1);
		}
		{
			label_2 = new Label("Unidades");
			label_2.setBounds(40, 173, 62, 22);
			frame.getContentPane().add(label_2);
		}
		{
			label_3 = new Label("Categoria");
			label_3.setBounds(40, 70, 62, 22);
			frame.getContentPane().add(label_3);
		}
		{
			choice_cat = new Choice();
			choice_cat.setBounds(40, 98, 122, 20);
			frame.getContentPane().add(choice_cat);
		}
		{
			label_4 = new Label("");
			label_4.setBounds(278, 38, 149, 129);
			frame.getContentPane().add(label_4);
		}
		
		textIdprod = new JTextField();
		textIdprod.setBounds(40, 147, 122, 20);
		frame.getContentPane().add(textIdprod);
		textIdprod.setColumns(10);
		
		textFieldUnidades = new JTextField();
		textFieldUnidades.setBounds(39, 202, 123, 20);
		frame.getContentPane().add(textFieldUnidades);
		textFieldUnidades.setColumns(10);
	}
	
}