package tete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import  java.sql.*;
import java.util.Scanner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.*;

public class rech extends JFrame {

	private JPanel contentPane;
	static JTextField nom;
    static String name ; 
    static int i=  0 ;
    static JLabel cod ; 
	static JLabel ne ;
	static JButton Return;
 	static JButton exit;
 	
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rech frame = new rech();
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
	public rech() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\salah\\OneDrive\\Bureau\\recherche-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel title = new JLabel("Rechercher a un code d'un nom");
		title.setBackground(new Color(255, 248, 220));
		title.setFont(new Font("Lucida Sans", Font.BOLD, 17));
		title.setForeground(new Color(220, 20, 60));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(42, 53, 507, 93);
		contentPane.add(title);
		
		JLabel Nom = new JLabel("Le Nom Complet a Rechercher");
		Nom.setFont(new Font("Tahoma", Font.BOLD, 12));
		Nom.setHorizontalAlignment(SwingConstants.CENTER);
		Nom.setBounds(-58, 157, 320, 71);
		contentPane.add(Nom);
		
		nom = new JTextField();
		nom.setBounds(209, 169, 294, 47);
		contentPane.add(nom);
		nom.setColumns(10);
		
		JButton buton = new JButton("Rechercher");
		buton.setBounds(130, 239, 157, 40);
		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					try {
						rech();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
			}
		});
		contentPane.add(buton);
		
		 cod = new JLabel();
		 cod.setFont(new Font("Tahoma", Font.BOLD, 12));
		 cod.setForeground(Color.RED);
		 cod.setHorizontalAlignment(SwingConstants.CENTER);
		cod.setBounds(209, 319, 331, 47);
		contentPane.add(cod);
		
		 ne = new JLabel("");
		ne.setFont(new Font("Tahoma", Font.BOLD, 12));
		ne.setForeground(Color.RED);
		ne.setHorizontalAlignment(SwingConstants.CENTER);
		ne.setBounds(350, 253, 259, 40);
		contentPane.add(ne);
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
	
	public static void rech() throws IOException {
		ResultSet resultset = null;
		name=nom.getText();
		if(name.equals("")) {
			ne.setText("Entreé Le Nom !!");
			
		}else {
			try {
				ne.setText("");
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11434653","sql11434653","SHsS91zZLp");
				
				String nn = name; 
				java.sql.Statement  statement = conn.createStatement();
				
				
				 resultset = (ResultSet) statement.executeQuery("Select * from infos "+"Where name = '"+name+"'");
				 
				
					if(resultset.next()) {
						cod.setText("le code de " + name + " est  " + resultset.getInt("Id"));
					}else {
						cod.setText( name + " n'existe pas");
					}
					
					
					
			}catch (Exception e1) {
				System.out.println(e1);
			}
			
		}
			
			
		}
}
