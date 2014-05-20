package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Alert {

	private JFrame contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alert window = new Alert();
					window.contentPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Alert() {
		initialize();
		
		
		
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("¡ALERTA!");
			lblNewLabel.setBounds(85, 10, 263, 78);
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 64));
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblProductoCaducadoProceda = new JLabel("Producto caducado. Proceda a su retirada");
			lblProductoCaducadoProceda.setForeground(Color.RED);
			lblProductoCaducadoProceda.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblProductoCaducadoProceda.setBounds(10, 95, 448, 87);
			contentPanel.add(lblProductoCaducadoProceda);
		}
		{
			JLabel lblDelStock = new JLabel(" del stock.");
			lblDelStock.setForeground(Color.RED);
			lblDelStock.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblDelStock.setBounds(10, 142, 448, 87);
			contentPanel.add(lblDelStock);
		}
		{
			
			
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		contentPanel = new JFrame();
		contentPanel.setBounds(100, 100, 450, 300);
		contentPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public void mostrar(){
		
	contentPanel.setVisible(true);
	}

}
