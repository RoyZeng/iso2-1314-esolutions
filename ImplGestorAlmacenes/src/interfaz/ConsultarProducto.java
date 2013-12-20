package aaa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JToolBar;

import dominio.AgenteProducto;

public class ConsultarProducto {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarProducto window = new ConsultarProducto();
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
	public ConsultarProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		AgenteProducto p=new AgenteProducto();
		ArrayList <dominio.Producto> prods = p.consultAllProducto();
		Object obj[][]=new Object();
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nombre", "Tipo", "Cantidad", "Fecha caducidad"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for(int i=0;i<prods.size();i++){
			model.addRow(new Object[]{new Integer(prods.get(i).getId()), prods.get(i).getNombre(), prods.get(i).getTipo(),new Integer(prods.get(i).getCantidad()),prods.get(i).getFecha()});
		}
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
	}
	
}
