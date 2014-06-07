package interfaz;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class EliminarProducto {

	private JFrame frame;
	private JButton btnEliminar;
	private Choice choice;
	private Label label;
	private Label label_1;
	private Choice choice_1;
	private Label label_3;
	private Choice choice_3;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarProducto window = new EliminarProducto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void mostrar(){
		
		frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public EliminarProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 379, 218);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			btnEliminar = new JButton(" Eliminar Producto");
			btnEliminar.setBounds(204, 144, 122, 23);
			frame.getContentPane().add(btnEliminar);
		}
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
			choice_1 = new Choice();
			choice_1.setBounds(40, 147, 122, 20);
			frame.getContentPane().add(choice_1);
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
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Eimard\\Desktop\\prod.png"));
			lblNewLabel.setBounds(220, 26, 95, 97);
			frame.getContentPane().add(lblNewLabel);
		}
	}
	
}
