package tete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.ResultSet;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class code extends JFrame {

	private JPanel contentPane;
	static JTextField nom;
	static JPasswordField pass;
	static int i = 0 , c = 0  , b = 0 ;
	static  int l  = 0    ;
	static int ps = 0 ;
	static int  d=0;
  static String name1 , pas ;
  static JLabel voila ;
	static code frame;
	static JButton Return;
	static JButton exit;
	static infos infos1;
	static JButton button ;
  /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new code();
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
	public code() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\salah\\OneDrive\\Bureau\\recherche-doc-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel title = new JLabel("Avoir les informations d'un nom");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setForeground(new Color(220, 20, 60));
		title.setFont(new Font("hooge 05_54", Font.BOLD, 15));
		title.setBounds(115, 30, 382, 57);
		contentPane.add(title);
		
		JLabel Name = new JLabel("ID Personnel");
		Name.setFont(new Font("Tahoma", Font.BOLD, 11));
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setBounds(32, 98, 172, 81);
		contentPane.add(Name);
		
		nom = new JTextField();
		nom.setBounds(204, 121, 249, 27);
		contentPane.add(nom);
		nom.setColumns(10);
		
		JLabel mdp = new JLabel("Le Mod de Pass ");
		mdp.setFont(new Font("Tahoma", Font.BOLD, 11));
		mdp.setForeground(new Color(0, 0, 0));
		mdp.setHorizontalAlignment(SwingConstants.CENTER);
		mdp.setBounds(51, 166, 128, 88);
		contentPane.add(mdp);
		
		pass = new JPasswordField();
		pass.setBounds(204, 193, 249, 32);
		contentPane.add(pass);
		
		button = new JButton("Vois les informations");
		button.setBounds(115, 285, 163, 32);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pas = pass.getText();
				
				if(nom.getText().equals("")   || pas.equals("")) {
					voila.setText("Entrée tout les informations !!");
					
				}else {
					try {
						voila.setText("");
						listinfo();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
				}
					
				
			}
			
			
		});
		contentPane.add(button);
		
		voila = new JLabel("");
		voila.setFont(new Font("Tahoma", Font.BOLD, 12));
		voila.setForeground(Color.RED);
		voila.setHorizontalAlignment(SwingConstants.CENTER);
		voila.setBounds(260, 348, 293, 14);
		contentPane.add(voila);
		
		 exit = new JButton("Sortir");
		exit.setForeground(Color.RED);
		exit.setFont(new Font("Tahoma", Font.BOLD, 13));
		exit.setBounds(459, 385, 121, 27);
		contentPane.add(exit);
		
		Return = new JButton("Retour au Menu");
		Return.setFont(new Font("Tahoma", Font.BOLD, 12));
		Return.setForeground(Color.DARK_GRAY);
		Return.setBounds(27, 348, 152, 39);
		contentPane.add(Return);
		
		JButton btnNewButton = new JButton("Mot De Pass oubli\u00E9e");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(417, 236, 163, 23);
		contentPane.add(btnNewButton);
	}
	
	 public static void listinfo() throws IOException {
		 String pss = pass.getText();
			//ps = Integer.parseInt(pass.getText());
			name1 = nom.getText();
			try {
				ResultSet resultset = null;
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11434653","sql11434653","SHsS91zZLp");
				
			
				java.sql.Statement  statement = conn.createStatement();
				
				
				 resultset = (ResultSet) statement.executeQuery("Select * from infos "+"Where Id = '"+name1+"' and PASSWORD = '"+pss+"'" );
				
				 if(resultset.next()) {
					// resultset = (ResultSet) statement.executeQuery("Select * from infos "+"Where PASSWORD = '"+pss+"'");
				//	 if(resultset.next()) {
						 infos1 = new infos();
							infos1.name.setText("Nom Complet : "+resultset.getString("name"));
							infos1.age.setText("Age : "+resultset.getString("age"));
							infos1.moy.setText("Moyenne : "+resultset.getString("moy"));
							infos1.code.setText("Code : "+ resultset.getString("Id"));
							infos1.pasw.setText("Mot de Pass : "+resultset.getString("PASSWORD"));
							//infos1.paswnb.setText(d[i+5]);
							
							infos1.setVisible(true);
						
				//	 }else {
						
				//	 }
					 
					
					 
				 }else {
					 voila.setText("Le Mot de pass est incorrect !!");
				 }
				 
				
				
				
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
 	   
 	   
    }
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
