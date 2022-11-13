import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Scrollbar;

public class sign extends JFrame {

	private JPanel pre;
	private JTextField prenom;
	private JTextField nom;
	private JTextField mail;
	private JTextField Tele;
	private JPasswordField mdp;
	private JPasswordField mdp1;
	private JSpinner brth;
	private Choice choice ;
     private	JLabel inco ;
     private JLabel infos;
	public File file = new File("C:\\Users\\salah\\OneDrive\\Bureau\\Bac.txt");
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sign frame = new sign();
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
	public sign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 573);
		pre = new JPanel();
		pre.setBorder(new EmptyBorder(5, 5, 5, 5));
		pre.setLayout(null);
		setContentPane(pre);
		
		JLabel lblNewLabel = new JLabel("Page D'inscription");
		lblNewLabel.setForeground(new Color(178, 34, 34));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(146, 11, 461, 58);
		pre.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pr\u00E9nom");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(32, 80, 121, 33);
		pre.add(lblNewLabel_1);
		
		prenom = new JTextField();
		prenom.setBounds(163, 80, 269, 33);
		pre.add(prenom);
		prenom.setColumns(10);
		
		JLabel Nom = new JLabel("Nom");
		Nom.setHorizontalAlignment(SwingConstants.CENTER);
		Nom.setFont(new Font("Tahoma", Font.BOLD, 15));
		Nom.setBounds(32, 122, 121, 33);
		pre.add(Nom);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(163, 124, 269, 33);
		pre.add(nom);
		
		JLabel email = new JLabel("E-mail");
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setFont(new Font("Tahoma", Font.BOLD, 15));
		email.setBounds(32, 166, 121, 33);
		pre.add(email);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(163, 168, 269, 33);
		pre.add(mail);
		
		JLabel tele = new JLabel("N\u00B0T\u00E9l\u00E9phone");
		tele.setHorizontalAlignment(SwingConstants.CENTER);
		tele.setFont(new Font("Tahoma", Font.BOLD, 15));
		tele.setBounds(32, 210, 121, 33);
		pre.add(tele);
		
		Tele = new JTextField();
		Tele.setColumns(10);
		Tele.setBounds(163, 212, 269, 33);
		pre.add(Tele);
		
		JLabel brt = new JLabel("Date \r\nde naissance");
		brt.setHorizontalAlignment(SwingConstants.CENTER);
		brt.setFont(new Font("Tahoma", Font.BOLD, 15));
		brt.setBounds(10, 254, 153, 33);
		pre.add(brt);
		
		brth = new JSpinner();
		brth.setFont(new Font("Tahoma", Font.BOLD, 13));
		brth.setModel(new SpinnerDateModel(new Date(1626476400000L), null, null, Calendar.DAY_OF_YEAR));
		brth.setBounds(163, 256, 269, 27);
		pre.add(brth);
		
		JLabel psw = new JLabel("Mot de passe");
		psw.setHorizontalAlignment(SwingConstants.CENTER);
		psw.setFont(new Font("Tahoma", Font.BOLD, 15));
		psw.setBounds(32, 298, 121, 33);
		pre.add(psw);
		
		mdp = new JPasswordField();
		mdp.setBounds(163, 300, 269, 33);
		pre.add(mdp);
		
		JLabel psw1 = new JLabel("Rentrer le mot de passe");
		psw1.setHorizontalAlignment(SwingConstants.CENTER);
		psw1.setFont(new Font("Tahoma", Font.BOLD, 13));
		psw1.setBounds(0, 348, 165, 33);
		pre.add(psw1);
		
		mdp1 = new JPasswordField();
		mdp1.setBounds(163, 349, 269, 33);
		pre.add(mdp1);
		
		JLabel fili = new JLabel("Votre Fil\u00E8re");
		fili.setHorizontalAlignment(SwingConstants.CENTER);
		fili.setFont(new Font("Tahoma", Font.BOLD, 15));
		fili.setBounds(-12, 392, 165, 33);
		pre.add(fili);
		
		choice = new Choice();
		choice.setFont(new Font("Dialog", Font.BOLD, 12));
		choice.setBounds(163, 395, 269, 22);
		choice.addItem("");
		choice.addItem("Sciences de la Vie et de la Terre");
		choice.addItem("Sciences Physiques et Chimiques");
		choice.addItem("Sciences Maths A");
		choice.addItem("Sciences Maths B");
		choice.addItem("Sciences Economiques");
		choice.addItem("Techniques de Gestion et de Comptabilité");
		choice.addItem("Sciences agronomiques");
		choice.addItem("Sciences et Technologies Electriques");
		choice.addItem("Sciences et Technologies Mécaniques");
		choice.addItem("Arts Appliqués");
		choice.addItem("Sciences Humaines");
		choice.addItem("Sciences de la Chariaâ");
		choice.addItem("Sciences de Langue Arabe");
		
		pre.add(choice);
		
		Checkbox checkbox = new Checkbox("");
		checkbox.setBounds(417, 446, 19, 14);
		pre.add(checkbox);
		
		JLabel lblNewLabel_2 = new JLabel("J'accept tous les Droits ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(277, 446, 134, 14);
		pre.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("S'inscrire");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\salah\\OneDrive\\Bureau\\ok.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(510, 472, 193, 39);
		btnNewButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a =mdp1.getText() , b=mdp.getText(); 
		if ((prenom.getText()).equals("") || (nom.getText()).equals("") || (mail.getText()).equals("") || (tele.getText()).equals("") || ((String.valueOf(brth.getValue())).equals("Sat Jul 17 00:00:00 WEST 2021")) || ((String.valueOf(choice.getSelectedItem())).equals(""))) {
			
			infos.setText("entree tout les infos");
		}else {
			if(a.equals(b) ) {
				try {
					type();
					System.out.println("hehe");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else {
				inco.setText("n'est pas le meme mot de pass");
			}
			
		}
				
				
			}
		});
		pre.add(btnNewButton);
		
		 infos = new JLabel("");
		 infos.setForeground(Color.RED);
		 infos.setFont(new Font("Tahoma", Font.BOLD, 14));
		infos.setHorizontalAlignment(SwingConstants.CENTER);
		infos.setBounds(37, 471, 314, 37);
		pre.add(infos);
		
		 inco = new JLabel("");
		 inco.setHorizontalAlignment(SwingConstants.CENTER);
		 inco.setForeground(Color.RED);
		 inco.setFont(new Font("Tahoma", Font.BOLD, 13));
		inco.setBounds(490, 315, 206, 39);
		pre.add(inco);
	}
	public void type() throws IOException {
		 FileWriter writer = new FileWriter("C:\\Users\\salah\\OneDrive\\Bureau\\Bac.txt",true);
		writer.write("\n"+prenom.getText()+"\n");   
		writer.write(nom.getText()+"\n");   
		writer.write(mail.getText()+"\n");  
		writer.write(Tele.getText()+"\n");   
		writer.write(String.valueOf(brth.getValue())+"\n");
		writer.write(String.valueOf(choice.getSelectedItem())+"\n");
		writer.write(mdp.getText()+"\n");  
		writer.close();
	
	}
}
