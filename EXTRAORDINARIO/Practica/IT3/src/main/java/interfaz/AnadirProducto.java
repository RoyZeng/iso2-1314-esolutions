package interfaz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import dominio.Historial;
import dominio.Producto;
import javax.swing.JLabel;
public class AnadirProducto {
	private JFrame frame;
	private JButton btnAnadir;
	private Choice choice;
	private Label label;
	private Label label_1;
	private Label label_2;
	private Label label_3;
	private Choice choice_3;
	private Label label_4;
	private JTextField textProd;
	private JTextField textUnid;
	private JLabel lblFecha;
	private JTextField textFecha;
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
			choice = new Choice();
			choice.setBounds(40, 38, 122, 20);
			frame.getContentPane().add(choice);
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
			choice_3 = new Choice();
			choice_3.setBounds(40, 98, 122, 20);
			frame.getContentPane().add(choice_3);
		}
		{
			label_4 = new Label("");
			label_4.setBounds(290, 70, 149, 129);
			frame.getContentPane().add(label_4);
		}
		{
		textProd = new JTextField();
		textProd.setBounds(40, 147, 122, 20);
		frame.getContentPane().add(textProd);
		textProd.setColumns(10);
		}
		{
		textUnid = new JTextField();
		textUnid.setBounds(39, 202, 123, 20);
		frame.getContentPane().add(textUnid);
		textUnid.setColumns(10);
		}
		{
			btnAnadir = new JButton("Anadir Producto");
			btnAnadir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					Historial manager=new Historial();
					Producto p=new Producto(0,textProd.getText(),Integer.parseInt((textUnid).getText()),choice.getSelectedItem(),textFecha.getText());
					manager.insertProd(p);
					
				}
			});
			btnAnadir.setBounds(296, 201, 143, 23);
			frame.getContentPane().add(btnAnadir);
		}
		{
			lblFecha = new JLabel("Fecha");
			lblFecha.setBounds(277, 0, 34, 50);
			frame.getContentPane().add(lblFecha);
		}
		{
			textFecha = new JTextField();
			textFecha.setBounds(255, 38, 86, 20);
			frame.getContentPane().add(textFecha);
			textFecha.setColumns(10);
		}
	}
}