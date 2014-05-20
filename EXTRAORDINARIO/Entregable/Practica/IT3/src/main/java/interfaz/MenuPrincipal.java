package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

import java.awt.Choice;

import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class MenuPrincipal {

	private JFrame frame;
	private JPanel Index;
	private JButton btnNewButton_2;
	private JButton btnAadirProducto;
	private JButton btnModificarProducto;
	private JButton btnEliminarProducto;
	private JButton btnConsultar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
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
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 588, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			Index = new JPanel();
			Index.setBorder(new LineBorder(new Color(0, 0, 0)));
			frame.getContentPane().add(Index, BorderLayout.CENTER);
			{
				btnNewButton_2 = new JButton("");
				btnNewButton_2.setBounds(544, 0, 28, 23);
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				Index.setLayout(null);
				btnNewButton_2.setIcon(new ImageIcon("ayuda.png"));
				Index.add(btnNewButton_2);
			}
			{
				btnAadirProducto = new JButton("Añadir Producto");
				btnAadirProducto.setBounds(38, 261, 157, 23);
				Index.add(btnAadirProducto);
				btnAadirProducto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						AnadirProducto principal=new AnadirProducto();
						principal.mostrar();
					}
				});
			}
			{
				btnConsultar = new JButton("Consultar Almacén");
				btnConsultar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
                        //ConsultarProducto ventana1 = new ConsultarProducto();
                        //ventana1.main(null);
					}
				});
				btnConsultar.setBounds(378, 261, 150, 23);
				Index.add(btnConsultar);
			}
			{
				btnModificarProducto = new JButton("Modificar Historial");
				btnModificarProducto.setBounds(378, 295, 150, 23);
				Index.add(btnModificarProducto);
				btnModificarProducto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						ModificarHistorial principal=new ModificarHistorial();
						principal.mostrar();
					}
				});
			}
			
			
			{
				lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("img/mercadona.gif"));
				lblNewLabel.setBounds(73, 27, 424, 179);
				Index.add(lblNewLabel);
			}
		}
	}
}