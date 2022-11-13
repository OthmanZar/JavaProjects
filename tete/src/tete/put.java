package tete;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.ResultSet;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Toolkit;

public class put extends JFrame {

	private JPanel contentPane;
	static JTextField nom;
	static JTextField Age;
	static JTextField Moy;
    static JLabel cod;
    static JButton Return;
 	static JButton exit;
 	static PreparedStatement ps;
 	static Connection conn;
  static String namee;
  static int agee;
  static double moyy;
	/**
	 * Launch the application.
	 */
	static eleve eleve1 = new eleve();
	static Scanner scan = new  Scanner(System.in);
	static String pas ; 
	static int lines = 0 , j = 0 , size = 0 , a=0 , code = 0 	;
	static JPasswordField pass;
	private JLabel lblNewLabel;
	private JLabel msg;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					put frame = new put();
					
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
	public put() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\salah\\OneDrive\\Bureau\\Get-Info-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel name = new JLabel("Nom Complet");
		name.setFont(new Font("Tahoma", Font.BOLD, 12));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(31, 69, 192, 57);
		contentPane.add(name);
		
		nom = new JTextField();
		nom.setBounds(205, 85, 301, 26);
		contentPane.add(nom);
		nom.setColumns(10);
		
		JLabel age = new JLabel("Age");
		age.setFont(new Font("Tahoma", Font.BOLD, 14));
		age.setHorizontalAlignment(SwingConstants.CENTER);
		age.setBounds(31, 118, 192, 57);
		contentPane.add(age);
		
		JLabel moy = new JLabel("Moyenne G\u00E9n\u00E8rale");
		moy.setFont(new Font("Tahoma", Font.BOLD, 12));
		moy.setHorizontalAlignment(SwingConstants.CENTER);
		moy.setBounds(31, 170, 206, 57);
		contentPane.add(moy);
		
		JLabel mdp = new JLabel("Mot de Pass ");
		mdp.setFont(new Font("Tahoma", Font.BOLD, 12));
		mdp.setHorizontalAlignment(SwingConstants.CENTER);
		mdp.setBounds(31, 223, 192, 57);
		contentPane.add(mdp);
		
		Age = new JTextField();
		Age.setColumns(10);
		Age.setBounds(205, 135, 301, 26);
		contentPane.add(Age);
		
		Moy = new JTextField();
		Moy.setColumns(10);
		Moy.setBounds(205, 186, 301, 26);
		contentPane.add(Moy);
		

		pass = new JPasswordField();
		pass.setBounds(205, 239, 301, 26);
		contentPane.add(pass);
		
		 cod = new JLabel("");
			cod.setBounds(172, 337, 396, 26);
			contentPane.add(cod);
		
		JButton button = new JButton("Obtenir Votre Code");
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBounds(119, 276, 192, 50);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				pas = pass.getText();
				
				if(nom.getText().equals("") || Age.getText().equals("") ||  Moy.getText().equals("") || pas.equals("")) {
					msg.setText("Entrée tout les informations !!");
				}else {
				  namee = nom.getText();
					 agee = (Integer.parseInt(Age.getText()));
					 moyy = (Double.parseDouble(Moy.getText()));
					/*eleve1.setName(nom.getText());
					eleve1.setAge(Integer.parseInt(Age.getText()));
					eleve1.setMoy(Double.parseDouble(Moy.getText()));
				*/
				try {
						code();
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					
				}
				
				
				
			}
		});
		
		contentPane.add(button);
		
		lblNewLabel = new JLabel("Entr\u00E9e Les Informations Suivantes");
		lblNewLabel.setBackground(new Color(253, 245, 230));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(93, 21, 384, 37);
		contentPane.add(lblNewLabel);
		
		msg = new JLabel();
		msg.setHorizontalAlignment(SwingConstants.CENTER);
		msg.setFont(new Font("Tahoma", Font.BOLD, 11));
		msg.setForeground(Color.RED);
		msg.setBounds(314, 291, 305, 35);
		contentPane.add(msg);
		
		exit = new JButton("Sortir");
		exit.setForeground(Color.RED);
		exit.setFont(new Font("Tahoma", Font.BOLD, 13));
		exit.setBounds(488, 380, 121, 27);
		contentPane.add(exit);
		
		Return = new JButton("Retour au Menu");
		Return.setFont(new Font("Tahoma", Font.BOLD, 12));
		Return.setForeground(Color.DARK_GRAY);
		Return.setBounds(10, 356, 152, 39);
		contentPane.add(Return);
		
		
		
	}
	
	public static void code () throws IOException {
		
		// Random r = new Random();
	//	File file = new File("C:\\Users\\salah\\oneDrive\\Bureau\\file.txt");
	//	Scanner scaner = new Scanner(file);
		//FileReader fr = new FileReader(file);
	/*	LineNumberReader lnr =  new	LineNumberReader (fr);
			
		  while (lnr.readLine()!=null) {
			  
			  lines++;
		  }
	
		  
		  String[] taba= new String[lines];*/
		if (agee >= 18 && moyy >=10) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11434653","sql11434653","SHsS91zZLp");
				 ps = conn.prepareStatement("insert into infos(name,age,moy,PASSWORD) values(?,?,?,?);");
				 java.sql.Statement  statement = conn.createStatement();
				 ResultSet resultset = null;
					
				
				 
				ps.setString(1, nom.getText());
				ps.setString(2, Age.getText());
				ps.setString(3, Moy.getText());
				ps.setString(4, pass.getText());
				int x = ps.executeUpdate();
				if(x>0) {
					
				}else {
					
				}
				 resultset = (ResultSet) statement.executeQuery("Select * from infos "+"Where name = '"+namee+"'");
				 if(resultset.next()) {
					 cod.setText("Votre code est "+ resultset.getInt("Id"));
				 }
				 
					
			}catch (Exception e1) {
				System.out.println(e1);
			}
			
		/*	while(scaner.hasNextLine()) {
				taba[j]=scaner.nextLine();
				j++;
			}
								size = taba.length;
								
										

			for(j=1   ; j<size  ; j = j + 2 ) {
				
				a=Integer.parseInt(taba[j]);
				
				}	

		
			
			
			a++;
			code = a ;
			//cod.setText("Votre code est "+ (code));
			
			
			
			
			InfoFile();
			
			*/
			
			
			
			}else {
				if (agee < 18 && moyy <10) {
					cod.setText("Tu est mineur et Vous n'avez pas la moyenne !!" );
				}if (moyy <10) {
					cod.setText("Vous n'avez pas la moyenne !! " );
				}if(agee < 18) {
					cod.setText("Tu est mineur !!" );
				}

	}
		
		
	
	}
	
	/* public static void InfoFile() throws IOException {
  	   File file = new File("C:\\Users\\salah\\oneDrive\\Bureau\\file.txt");
			FileWriter writer = new FileWriter(file,true);
  	    writer.write(eleve1.getName()+"\n");
		     	writer.write(""+ code+ "\n");
			    writer.close();
          
			    
          /////////////////////////////////////////////////////////////////////////////
          
FileWriter writer2 = new FileWriter("C:\\Users\\salah\\oneDrive\\Bureau\\"+(eleve1.getName())+".txt",true);
				writer2.write("Nom Complet : "+eleve1.getName()+"\n");
				writer2.write("Age : "+eleve1.getAge()+"\n");
				writer2.write("Moyenne : "+eleve1.getMoy()+"\n");
				writer2.write("Code : "+code+"\n");
				writer2.write("Mot de Pass : \n");
				writer2.write(pas);
				writer2.close();

     
     }
	*/
	
	
}
