package App;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSet;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class test extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton.addActionListener(new ActionListener() {
			  // cette methode pour la button Rechercher A un film dans la base de donnes avec son nom
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel Table = new DefaultTableModel();
				Table.addColumn("Id");
			Table.addColumn("Imdb");
				Table.addColumn("Titre");
				
				 ResultSet resultset = null;
					// tu dois changer les inforamtions de la base donnes 

					try {
						Class.forName("com.mysql.jdbc.Driver");
					} catch (ClassNotFoundException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					Connection conn = null;
					try {
						conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pfe","root","");
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					java.sql.Statement statement = null;
					try {
						statement = conn.createStatement();
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					
					
					 try {
						resultset = (ResultSet) statement.executeQuery("Select * from poste " );
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						while(resultset.next()) {
							Table.addRow(new Object[] {
								resultset.getInt(1),
							resultset.getString(2),
								resultset.getInt(3),
								
									
							});
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
					table.setModel(Table);
					

				
			}
		});
		btnNewButton.setBounds(51, 50, 108, 37);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 211, 525, 278);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
