package interfaz;

import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarHistorial {

	private JFrame frame;
	private JButton btnAnadir;
	private Choice choice;
	private Label label;
	private Label label_1;
	private Label label_2;
	private Label label_3;
	private Choice choice_3;
	private Label label_4;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarHistorial window = new ModificarHistorial();
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
	
	public ModificarHistorial() {
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
			btnAnadir = new JButton("Modificar Producto");
			btnAnadir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnAnadir.setBounds(296, 201, 143, 23);
			frame.getContentPane().add(btnAnadir);
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
			label_4.setBounds(278, 38, 149, 129);
			frame.getContentPane().add(label_4);
		}
		
		textField = new JTextField();
		textField.setBounds(40, 147, 122, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(39, 202, 123, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
	

}
