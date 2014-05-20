package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.AbstractListModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComprobarMerc {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComprobarMerc window = new ComprobarMerc();
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
	public ComprobarMerc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Ejemplo1", "Ejemplo2", "Ejemplo3"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(10, 49, 200, 173);
		panel.add(list);
		
		JLabel lblProductos = new JLabel("Productos");
		lblProductos.setBounds(10, 11, 200, 50);
		panel.add(lblProductos);
		
		JLabel lblFechaCaducidad = new JLabel("Fecha caducidad: ");
		lblFechaCaducidad.setBounds(220, 49, 92, 30);
		panel.add(lblFechaCaducidad);
		
		JLabel Fecha = new JLabel("04/06/14");
		Fecha.setBounds(308, 39, 200, 50);
		panel.add(Fecha);
		
		JLabel lblvalido = new JLabel("¿Valido?");
		lblvalido.setBounds(240, 91, 38, 50);
		panel.add(lblvalido);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Si", "No"}));
		comboBox.setBounds(288, 106, 48, 20);
		panel.add(comboBox);
	}
public void mostrar(){
		
		frame.setVisible(true);
	}
}
