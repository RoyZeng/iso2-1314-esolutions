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
import javax.swing.JRadioButton;

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
		lblFechaCaducidad.setBounds(220, 49, 105, 30);
		panel.add(lblFechaCaducidad);
		
		JLabel Fecha = new JLabel("04/06/14");
		Fecha.setBounds(335, 39, 200, 50);
		panel.add(Fecha);
		
		JLabel lblvalido = new JLabel("¿Valido?");
		lblvalido.setBounds(230, 91, 66, 50);
		panel.add(lblvalido);
		
		
		;
		
		JButton btnNewButton = new JButton("Validar");
		
		btnNewButton.setBounds(275, 171, 89, 23);
		panel.add(btnNewButton);
		
		final JRadioButton rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setSelected(true);
		
		rdbtnSi.setBounds(302, 105, 57, 23);
		panel.add(rdbtnSi);
		
		final JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnSi.setSelected(false);
			}
		});
		rdbtnNo.setBounds(364, 105, 109, 23);
		panel.add(rdbtnNo);
		rdbtnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnNo.setSelected(false);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNo.isSelected()){
					Alert alerta=new Alert();
					alerta.mostrar();
				}
			}
		});
	}
public void mostrar(){
		
		frame.setVisible(true);
	}
}
