import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;

import java.sql.*;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JPasswordField;
public class Project extends JFrame {
	 
	private JPanel psw;
    static JLabel icon ;
    private JTextField Email;
    private JPasswordField passwordField;
    private JLabel ema ;
    private JLabel dpd;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
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
	public Project() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 478);
		psw = new JPanel();
		psw.setBackground(new Color(245, 245, 220));
		psw.setBorder(new EmptyBorder(5, 5, 5, 5));
		psw.setLayout(null);
		setContentPane(psw);
		
		JLabel bienvenu = new JLabel("Bienvenue Dans L'Bac Lik");
		bienvenu.setForeground(new Color(153, 0, 51));
		bienvenu.setFont(new Font("Tahoma", Font.BOLD, 25));
		bienvenu.setHorizontalAlignment(SwingConstants.CENTER);
		bienvenu.setBounds(64, 11, 600, 77);
		psw.add(bienvenu);
		//icon.setBounds(49, 99, 288, 218);
		//contentPane.add(icon);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\salah\\OneDrive\\Bureau\\icon.png"));
		lblNewLabel_1.setBounds(42, 112, 256, 256);
		psw.add(lblNewLabel_1);
		
		Email = new JTextField();
		Email.setBounds(484, 174, 177, 38);
		psw.add(Email);
		Email.setColumns(10);
		
		JLabel email = new JLabel("Email");
		email.setFont(new Font("Tahoma", Font.BOLD, 17));
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setForeground(new Color(0, 0, 0));
		email.setBounds(366, 174, 65, 38);
		psw.add(email);
		
		JLabel mdp = new JLabel("Mot De Pass");
		mdp.setFont(new Font("Tahoma", Font.BOLD, 17));
		mdp.setHorizontalAlignment(SwingConstants.CENTER);
		mdp.setForeground(new Color(0, 0, 0));
		mdp.setBounds(332, 217, 131, 83);
		psw.add(mdp);
		
		JButton login = new JButton("Connexion");
		login.setIcon(new ImageIcon("C:\\Users\\salah\\OneDrive\\Bureau\\eb.png"));
		login.setBackground(Color.WHITE);
		login.setFont(new Font("Tahoma", Font.BOLD, 15));
		login.setBounds(392, 311, 158, 38);
		login.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					scan();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		psw.add(login);
		
		JButton sign = new JButton("S'inscrire");
		sign.setIcon(new ImageIcon("C:\\Users\\salah\\OneDrive\\Bureau\\inc.png"));
		sign.setForeground(new Color(0, 0, 0));
		sign.setFont(new Font("Tahoma", Font.BOLD, 17));
		sign.setBounds(497, 390, 234, 38);
		sign.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign sign1 = new sign();
				sign1.setVisible(true);
				
			}
		});
		psw.add(sign);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(484, 242, 177, 38);
		psw.add(passwordField);
		
		 dpd = new JLabel("");
		dpd.setForeground(Color.RED);
		dpd.setFont(new Font("Tahoma", Font.BOLD, 14));
		dpd.setHorizontalAlignment(SwingConstants.CENTER);
		dpd.setBounds(153, 379, 278, 22);
		psw.add(dpd);
		
		ema = new JLabel("");
		ema.setHorizontalAlignment(SwingConstants.CENTER);
		ema.setForeground(Color.RED);
		ema.setFont(new Font("Dialog", Font.BOLD, 14));
		ema.setBounds(153, 405, 256, 23);
		psw.add(ema);
	}
	public void scan() throws IOException {
		File file = new File("C:\\Users\\salah\\OneDrive\\Bureau\\Bac.txt");
		Scanner scan = new Scanner(file);
		String em = Email.getText();
		String mdp = passwordField.getText();
		int a=0 , b=0,i=0 ,j=0;
		
		FileReader fr = new FileReader(file);
		LineNumberReader lnr =  new	LineNumberReader (fr);
				int l = 0 ;
		  while (lnr.readLine()!=null) {
			  
			  l++;
		  }
		  String[] tab = new String[l];
			for (i=0;i<l;i++) {
				tab[i]=scan.nextLine();
				
			}
		  for(i=0;i<l;i++) {
			  if(em.equals(tab[i])) {
				  ema.setText("gg em");
				  a=i;
				  j++;
				  
						
				 
		 			  	  }
		  }
					
	
	
	a=a+4;
		  if(tab[a].equals(mdp)){
			  b++;
		  }
		  
		
			
		
if (j==0) {
		ema.setText("email not found");
		
		
	}
	if (b==0) {
		dpd.setText("mot de pass incorrect");
	}
	
	if(a>=1 && b>=1) {
		System.out.println("bien bro");
		
	}
	
	}
	
}
