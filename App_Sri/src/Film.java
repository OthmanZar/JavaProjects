import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.management.modelmbean.ModelMBean;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSet;

import net.proteanit.sql.DbUtils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Film extends JFrame {
	static Connexion connexion;
    static Movie currentMovie ;
   	
	private JPanel contentPane;
	static JProgressBar progressBar;
	
	static JTextField title;
	private JTable table;
	static JList list;
    static JLabel year1 ;
	static JTextArea textArea ;
	static JLabel image;
	/**
	 * Launch the application.
	 */
	
	// donc j'ai travaillé avec windowbuilder 
	public static void main(String[] args) {
		
		
		 

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Film frame = new Film();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * 
	 * 
	 */


	
	
	

	public Film() throws ClassNotFoundException, SQLException {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(0, 0, 781, 317);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnRech = new JButton("Rechercher");
		btnRech.addActionListener(new ActionListener() {
			  // cette methode pour la button Rechercher A un film dans la base de donnes avec son nom
			public void actionPerformed(ActionEvent e) {
				String name = title.getText();
ResultSet resultset = null;
				 
  					// tu dois changer les inforamtions de la base donnes 
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			Connection conn = null;
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp","root","");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			java.sql.Statement statement = null;
			try {
				statement = conn.createStatement();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				resultset = (ResultSet) statement.executeQuery("Select * from movie "+"Where title = '"+name+"' " );
				if(resultset.next()){
					System.out.println(resultset.getInt(1));
					DefaultListModel<String> ListModel;
					initComponents();
					ListModel = new DefaultListModel<>();
					ListModel.addElement(resultset.getString(5));
					 list.setModel(ListModel);
					 int IntValue;
						progressBar.setValue(IntValue = (int)resultset.getInt(9));
						String year2 = Integer.toString(resultset.getInt(10)) ;
						year1.setText(year2);
						textArea.setText(resultset.getString(8));
						currentMovie.setPoster(resultset.getString(4));
						image = new JLabel(new ImageIcon(currentMovie.getPoster()));
						 
					}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			
				
			}
		});
		btnRech.setBackground(SystemColor.activeCaption);
		btnRech.setForeground(SystemColor.menu);
		btnRech.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnRech.setBounds(30, 269, 187, 37);
		panel.add(btnRech);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(16, 11, 57, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titre");
		lblNewLabel.setBounds(0, 11, 57, 24);
		panel_1.add(lblNewLabel);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.BLACK);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(16, 81, 57, 40);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Genres");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(0, 11, 57, 24);
		panel_1_1.add(lblNewLabel_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_2.setBounds(16, 154, 57, 40);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("Rating");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(0, 11, 57, 24);
		panel_1_2.add(lblNewLabel_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_3.setBounds(16, 218, 57, 40);
		panel.add(panel_1_3);
		connexion = new Connexion();
		 currentMovie = connexion.getMovie();
		JLabel lblNewLabel_3 = new JLabel("Year");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(0, 11, 57, 24);
		panel_1_3.add(lblNewLabel_3);
		 connexion = new Connexion();
		 currentMovie = connexion.getMovie();
		title = new JTextField(currentMovie.getTitle());	
		title.setEditable(true);
		title.setBounds(83, 14, 199, 32);
		panel.add(title);
		title.setColumns(10);
		 
		DefaultListModel<String> ListModel;
		initComponents();
		ListModel = new DefaultListModel<>();
		ListModel.addElement(currentMovie.getGenres());
		
		 list = new JList();
	    list.setModel(ListModel);
		
		list.setBounds(83, 57, 199, 78);
		panel.add(list);
		
		 progressBar = new JProgressBar();
		progressBar.setForeground(Color.GREEN);
		int IntValue;
		progressBar.setValue(IntValue = (int)currentMovie.getRating());
		progressBar.setMaximum(10);
		progressBar.setBounds(83, 162, 199, 24);
		panel.add(progressBar);
		
		String comb[] = { Integer.toString(currentMovie.getYear()) };
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_4.setBounds(320, 11, 93, 40);
		panel.add(panel_1_4);
		
		JLabel lblSynopsys = new JLabel("Synopsys");
		lblSynopsys.setHorizontalAlignment(SwingConstants.CENTER);
		lblSynopsys.setForeground(Color.BLACK);
		lblSynopsys.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblSynopsys.setBackground(Color.WHITE);
		lblSynopsys.setBounds(10, 11, 73, 24);
		panel_1_4.add(lblSynopsys);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(320, 62, 314, 164);
		panel.add(scrollPane);
		
		 textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
		textArea.setLineWrap(true);
		textArea.setText(currentMovie.getSynopsis());
		JScrollPane scrolpan = new JScrollPane();
		scrolpan.setBounds(0, 318, 781, 187);
		contentPane.add(scrolpan);
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel Table1 = new DefaultTableModel();
				int SelectedRow = table.getSelectedRow();
	
				
				
			}
		});
		scrolpan.setViewportView(table);
		
		JButton Lister = new JButton("Lister");
		Lister.addActionListener(new ActionListener() {
			// cette methode poue lister tout les films qui ont dans la base de donnes
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel Table = new DefaultTableModel();
				Table.addColumn("Id");
			Table.addColumn("Imdb");
				Table.addColumn("Titre");
				Table.addColumn("Genres");
				Table.addColumn("Synopsis");
				Table.addColumn("Rating");
				Table.addColumn("Year");
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
						conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp","root","");
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
					
					String a ;
					 try {
						resultset = (ResultSet) statement.executeQuery("Select * from movie " );
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						while(resultset.next()) {
							Table.addRow(new Object[] {
								resultset.getInt(1),
							resultset.getString(2),
								resultset.getString(3),
								resultset.getString(5),
								resultset.getString(8),
								resultset.getDouble(9),
								resultset.getInt(10),
									
							});
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
					table.setModel(Table);
					
					
			}
			
		});
		
		Lister.setBackground(SystemColor.activeCaption);
		Lister.setForeground(SystemColor.menu);
		Lister.setFont(new Font("Tahoma", Font.BOLD, 20));
		Lister.setBounds(260, 269, 193, 37);
		panel.add(Lister);
		
		 image = new JLabel(new ImageIcon(currentMovie.getPoster()));
		image.setBounds(641, 11, 130, 260);
		panel.add(image);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(83, 222, 199, 32);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		 year1 = new JLabel();
		String year = Integer.toString(currentMovie.getYear()) ;
		year1.setText(year);
		year1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		year1.setForeground(new Color(0, 0, 0));
		year1.setBounds(10, 0, 199, 36);
		panel_2.add(year1);
		
		
		
		
		
		
		
		
		
	
		
			
	
		
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
