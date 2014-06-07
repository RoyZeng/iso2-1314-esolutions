import java.awt.EventQueue;

public class EliminarProducto {

	private JFrame frame;
	private JButton btnEliminar;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JTable table;

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
			scrollPane = new JScrollPane();
			scrollPane.setBounds(24, 10, 329, 82);
			frame.getContentPane().add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null},
					},
					new String[] {
						"Tipo Producto", "Producto", "Categoria"
					}
				) {
					Class[] columnTypes = new Class[] {
						String.class, String.class, String.class
					};
					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
				TableColumn columnaCategoria = table.getColumnModel().getColumn(0);
				JComboBox comboBox = new JComboBox();
				comboBox.addItem("Alimentacion");
				comboBox.addItem("Cosmeticos");
				comboBox.addItem("Limpieza");
				columnaCategoria.setCellEditor(new DefaultCellEditor(comboBox));
				
				TableColumn columnaTipo = table.getColumnModel().getColumn(2);
				JComboBox comboBox1 = new JComboBox();
				comboBox1.addItem("Perecedero");
				comboBox1.addItem("No perecedero");
				columnaTipo.setCellEditor(new DefaultCellEditor(comboBox1));
				scrollPane.setViewportView(table);
			}
		}
		{
			
		}
	}
}
