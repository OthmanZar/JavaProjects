import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.ResultSet;

import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Notes extends JFrame {
	private JPanel contentPane;
	int xx , xy;
	static JButton exit;
	static Notes frame;
	private JTextField Nom;
	private JTextField AngN1;
	private JTextField FraN1;
	private JTextField ArabN1;
	private JTextField TecN1;
	private JTextField AngN2;
	private JTextField FraN2;
	private JTextField ArabN2;
	private JTextField TecN2;
	private JTextField WindN1;
	private JTextField ResN1;
	private JTextField WindN2;
	private JTextField ResN2;
	private JTextField DevN1;
	private JTextField ArchN1;
	private JTextField LinuxN1;
	private JTextField EejN1;
	private JTextField DevN2;
	private JTextField ArchN2;
	private JTextField LinuxN2;
	private JTextField EejN2;
	private JTextField MathN1;
	private JTextField MathN2;
	static JButton calculer;
	static   String name   ;
	static 	 Double Angn1 ;
	static 	 Double Angn2 ;
	static 	 Double Fran1 ;
	static 	 Double Fran2 ;
		 static 	 Double Arabn1;
		 static 	 Double Arabn2;
		 static 	 Double Tecn1;
		 static 	 Double Tecn2;
		 static 	 Double Windn1;
		 static  	 Double Windn2;
		 static  Double Resn1;
		 static 	 Double Resn2;
		 static 	 Double Devn1;
		 static  Double Devn2;
		 static 	 Double Archn1;
		 static  Double Archn2;
		 static 	 Double Linuxn1;
		 static 	 Double Linuxn2;
		 static 	 Double Eejn1;
		 static 	 Double Eejn2;
		 static 	 Double Mathn1;
		 static  Double Mathn2;
		 static  Double Com ;
		 static 	Double Anglais  ;
		 static 	Double Francais  ;
		 static 	Double Arab  ; 
		 static 	Double Tec  ;
		 static Double Pro  ;
		 static Double Windows  ; 
		 static Double Reseau  ;
		 static Double Techni ;
		 static	Double Dev    ;
		 static	Double Linux ;
		 static	Double Arch ;
		 static	Double EEJ;
		 static	Double Math ;
			
		 static	Double Total ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Notes();
					frame.setUndecorated(true);
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
	public Notes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 597);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 xx = e.getX();

			        xy = e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();

		        int y = e.getYOnScreen();

		        Notes.this.setLocation(x - xx, y - xy);  
			}
		});
		
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		 calculer = new JButton("Calculer et sauvegarder");
		 
		 calculer.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		
		 		
				
				
				
					try {
						Connection conn;
						PreparedStatement ps;
						Class.forName("com.mysql.jdbc.Driver");
						conn = DriverManager.getConnection("jdbc:mysql://sql11.freesqldatabase.com:3306/sql11469277","sql11469277","kRfvuiQ7w7");
						 ps = conn.prepareStatement("insert into 1sri(Nom,ModulCom,ModulPro,ModulTechn,Total) values(?,?,?,?,?);");
						 java.sql.Statement  statement = conn.createStatement();
						 
						 ResultSet resultset = null;
						
					System.out.println(Nom.getText());
					      name   = Nom.getText();
						 Angn1 =Double.parseDouble(AngN1.getText());
						 Angn2 =Double.parseDouble(AngN2.getText());
						  Fran1 =Double.parseDouble(FraN1.getText());
						 	 Fran2 =Double.parseDouble(FraN2.getText());
						  Arabn1 =Double.parseDouble(ArabN1.getText());
						 Arabn2=Double.parseDouble(ArabN2.getText());
						  Tecn1=Double.parseDouble(TecN1.getText());
						  Tecn2=Double.parseDouble(TecN2.getText());
						 Windn1=Double.parseDouble(WindN1.getText());
						Windn2=Double.parseDouble(WindN2.getText());
						 Resn1=Double.parseDouble(ResN1.getText());
						 Resn2=Double.parseDouble(ResN2.getText());
						 Devn1=Double.parseDouble(DevN1.getText());
						 Devn2=Double.parseDouble(DevN2.getText());
						 Archn1=Double.parseDouble(ArchN1.getText());
						 Archn2=Double.parseDouble(ArchN2.getText());
						 Linuxn1=Double.parseDouble(LinuxN1.getText());
						  Linuxn2=Double.parseDouble(LinuxN2.getText());
						 Eejn1=Double.parseDouble(EejN1.getText());
						 Eejn2=Double.parseDouble(EejN2.getText());
						 Mathn1=Double.parseDouble(MathN1.getText());
						 Mathn2=Double.parseDouble(MathN2.getText());
						
					
						 Anglais =(Angn1+Angn2)/2 ;
					 Francais = (Fran1+Fran2)/2 ;
						 Arab = (Arabn1+Arabn2)/2 ; 
						 Tec =(Tecn1+Tecn2)/2 ;
						Com =( (Anglais*10 )+ (Francais*10 )+ (Arab*10) +  (Tec*10) ) /40;
				
						 Windows= (Windn1+Windn2)/2  ; 
					 Reseau  = (Resn1+Resn2)/2;
						Pro = ((Windows*30)+(Reseau*35)) / 65;
					
						 Dev  = (Devn1+Devn2)/2  ;
					 Linux = (Linuxn1+Linuxn2)/2;
					 Arch = (Archn1+Archn2)/2;
						 EEJ = (Eejn1+Eejn2)/2;
					 Math = (Mathn1+Mathn2)/2;
						Techni = ((Dev*20)+(Linux*30)+(Arch*20)+(EEJ*10)+(Math*15))/ 95;
						 
						Total = ((Com*40)+(Pro*65)+(Techni*95))/200;
						System.out.println(Com);
						System.out.println(Pro);
						System.out.println(Techni);
						System.out.println(Total);
						
						 
						 
						 
						 
						
						ps.setString(1, name );
						ps.setDouble(2, Com);
						ps.setDouble(3, Pro);
						ps.setDouble(4, Techni);
						ps.setDouble(5, Total);
						 
						 
						int x = ps.executeUpdate();
						if(x>0) {
							
						}else {
							
						}
							
						File file = new File("C:\\App\\Resultat.txt");
						FileWriter writer = new FileWriter(file,true);
		        	    writer.write("                                       Resultat Finale   "+"\n\n");
		   		     	writer.write("Anne et Filiére :  1SRI "+ "\n");
		   		        writer.write("Nom Complet :  "+name+ "\n\n");
		   		        writer.write("--------------- Module Des Langues Et Communication ---------------  "+ "\n");
		   		        writer.write("Langue Anglaise : "+Anglais+ "\n");
		   		        writer.write("Langue Française : "+Francais+ "\n");
		   		        writer.write("Langue Arabe :  "+Arab+ "\n");
		   		        writer.write("Technique D'expression Et Communication  : "+Tec+ "\n");
		   		        writer.write("                  La Moyenne Du Module : "+Com+ "\n\n");
		   		        writer.write("--------------- Module Technique ---------------  "+ "\n");
		   		        writer.write("Developement Des Applications Informatique : "+Dev+ "\n");
		   		        writer.write("System D'exploiatation GNU/Linux : "+Linux+ "\n");
		   		        writer.write("Architecture Des Ordinateurs :  "+Arch+ "\n");
		   		        writer.write("Environement Economique Et Juridrique : "+EEJ+ "\n");
		   		        writer.write("Mathematiques : "+Math+ "\n");
		   		        writer.write("                 La Moyenne Du Module : "+Techni+ "\n\n");
		   		        writer.write("--------------- Module Peofessionnel ---------------  "+ "\n");
		   		        writer.write("Systeme D'exploiataion Propretaire : "+Windows+ "\n");   		 
		   		        writer.write("Reseau Informatique : "+Reseau+ "\n");
		   		        writer.write("                 La Moyenne Du Module : "+Pro+ "\n\n\t");
		   		        writer.write("------------------------------------------------------------------------"+"\n");
		   		        writer.write("                 La Moyenne Generale est : "+Total+ "\n\t\n\t");
		   		        writer.write("                                                                    		      Made By Othman Zarrouk.2SRI1 "+"\n\n\t");
		   			    writer.close();		
						
						
							
					}catch (Exception e1) {
						System.out.println(e1);
					
					
				}
		 	}
		 });
		
		calculer.setForeground(new Color(112, 128, 144));
		calculer.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 32));
		calculer.setBackground(new Color(224, 255, 255));
		calculer.setBounds(564, 470, 301, 58);
		contentPane.add(calculer);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(MainPage.class.getResource("/Images/button.png")));
		lblNewLabel_5.setBounds(949, 0, 32, 51);
		contentPane.add(lblNewLabel_5);
		
		exit = new JButton("Retourner");
		exit.setBackground(new Color(224, 255, 255));
		exit.setForeground(new Color(178, 34, 34));
		exit.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		exit.setIcon(new ImageIcon(Years.class.getResource("/Images/return (1).png")));
		exit.setBounds(832, 541, 162, 56);
		contentPane.add(exit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setForeground(new Color(100, 149, 237));
		panel_1.setBounds(480, 177, 1, 390);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(0, 0, 1003, 171);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Votre Nom Complet : ");
		lblNewLabel_4.setBounds(224, 63, 180, 67);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(0, 128, 128));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		
		Nom = new JTextField();
		Nom.setBounds(358, 117, 225, 35);
		panel.add(Nom);
		Nom.setColumns(10);
		
		JLabel lblsri = new JLabel("1Ann\u00E9e Syst\u00E9mes Et Reseaux Informatiques");
		lblsri.setHorizontalAlignment(SwingConstants.CENTER);
		lblsri.setForeground(new Color(70, 130, 180));
		lblsri.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 40));
		lblsri.setBounds(142, 0, 699, 56);
		panel.add(lblsri);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Notes.class.getResource("/Images/computer (2).png")));
		lblNewLabel.setBounds(446, 31, 108, 75);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_4_1_2_2 = new JLabel("NB: Si Vous Avez Une Seule Note entrer dans La deuxieme note la meme note pour calculer la premier note seulement");
		lblNewLabel_4_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2_2.setForeground(new Color(210, 105, 30));
		lblNewLabel_4_1_2_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_2_2.setBounds(203, 141, 626, 43);
		panel.add(lblNewLabel_4_1_2_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Module De Langues Et Communication");
		lblNewLabel_4_1.setBounds(62, 180, 337, 43);
		contentPane.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 221, 460, 181);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Anglais");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		lblNewLabel_4_1_1.setBounds(10, 11, 78, 31);
		panel_2.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Fran\u00E7ais");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		lblNewLabel_4_1_1_1.setBounds(10, 53, 78, 31);
		panel_2.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("Arabe");
		lblNewLabel_4_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		lblNewLabel_4_1_1_2.setBounds(10, 98, 78, 31);
		panel_2.add(lblNewLabel_4_1_1_2);
		
		JLabel lblNewLabel_4_1_1_3 = new JLabel("TEC");
		lblNewLabel_4_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_3.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		lblNewLabel_4_1_1_3.setBounds(10, 140, 78, 31);
		panel_2.add(lblNewLabel_4_1_1_3);
		
		AngN1 = new JTextField();
		AngN1.setBounds(118, 19, 86, 20);
		panel_2.add(AngN1);
		AngN1.setColumns(10);
		
		FraN1 = new JTextField();
		FraN1.setColumns(10);
		FraN1.setBounds(118, 61, 86, 20);
		panel_2.add(FraN1);
		
		ArabN1 = new JTextField();
		ArabN1.setColumns(10);
		ArabN1.setBounds(118, 106, 86, 20);
		panel_2.add(ArabN1);
		
		TecN1 = new JTextField();
		TecN1.setColumns(10);
		TecN1.setBounds(118, 148, 86, 20);
		panel_2.add(TecN1);
		
		AngN2 = new JTextField();
		AngN2.setColumns(10);
		AngN2.setBounds(295, 19, 86, 20);
		panel_2.add(AngN2);
		
		FraN2 = new JTextField();
		FraN2.setColumns(10);
		FraN2.setBounds(295, 61, 86, 20);
		panel_2.add(FraN2);
		
		ArabN2 = new JTextField();
		ArabN2.setColumns(10);
		ArabN2.setBounds(295, 106, 86, 20);
		panel_2.add(ArabN2);
		
		TecN2 = new JTextField();
		TecN2.setColumns(10);
		TecN2.setBounds(295, 148, 86, 20);
		panel_2.add(TecN2);
		
		JLabel lblNewLabel_4_1_1_4 = new JLabel("1ere Notes");
		lblNewLabel_4_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_4.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_1_4.setBounds(126, -11, 71, 43);
		panel_2.add(lblNewLabel_4_1_1_4);
		
		JLabel lblNewLabel_4_1_1_4_1 = new JLabel("2\u00E9me Notes");
		lblNewLabel_4_1_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_4_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_4_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_1_4_1.setBounds(295, -11, 86, 43);
		panel_2.add(lblNewLabel_4_1_1_4_1);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Module Professionnel");
		lblNewLabel_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_3.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		lblNewLabel_4_1_3.setBounds(62, 422, 337, 58);
		contentPane.add(lblNewLabel_4_1_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(10, 470, 460, 97);
		contentPane.add(panel_2_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Syst\u00E9me D'exploiataion Peopri\u00E9taire");
		lblNewLabel_4_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_1_1_1.setBounds(10, 11, 196, 31);
		panel_2_1.add(lblNewLabel_4_1_1_1_1);
		
		WindN1 = new JTextField();
		WindN1.setColumns(10);
		WindN1.setBounds(216, 17, 86, 20);
		panel_2_1.add(WindN1);
		
		ResN1 = new JTextField();
		ResN1.setColumns(10);
		ResN1.setBounds(216, 59, 86, 20);
		panel_2_1.add(ResN1);
		
		WindN2 = new JTextField();
		WindN2.setColumns(10);
		WindN2.setBounds(327, 17, 86, 20);
		panel_2_1.add(WindN2);
		
		ResN2 = new JTextField();
		ResN2.setColumns(10);
		ResN2.setBounds(327, 59, 86, 20);
		panel_2_1.add(ResN2);
		
		JLabel lblNewLabel_4_1_1_5 = new JLabel("Reseau Informatique");
		lblNewLabel_4_1_1_5.setBounds(10, 53, 196, 31);
		panel_2_1.add(lblNewLabel_4_1_1_5);
		lblNewLabel_4_1_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_5.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_5.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		
		JLabel lblNewLabel_4_1_1_4_2 = new JLabel("1ere Notes");
		lblNewLabel_4_1_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_4_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_4_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_1_4_2.setBounds(216, -15, 86, 49);
		panel_2_1.add(lblNewLabel_4_1_1_4_2);
		
		JLabel lblNewLabel_4_1_1_4_1_1 = new JLabel("2\u00E9me Notes");
		lblNewLabel_4_1_1_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_4_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_4_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_1_4_1_1.setBounds(327, -15, 86, 49);
		panel_2_1.add(lblNewLabel_4_1_1_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Module Technique");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		lblNewLabel_4_1_2.setBounds(572, 180, 337, 43);
		contentPane.add(lblNewLabel_4_1_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(491, 221, 480, 219);
		contentPane.add(panel_2_2);
		
		JLabel lblNewLabel_4_1_1_6 = new JLabel("Developement Des Applications Informatiques");
		lblNewLabel_4_1_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_6.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_6.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_1_6.setBounds(10, 11, 253, 31);
		panel_2_2.add(lblNewLabel_4_1_1_6);
		
		JLabel lblNewLabel_4_1_1_1_2 = new JLabel("Architecture Des Ordinateurs");
		lblNewLabel_4_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_1_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblNewLabel_4_1_1_1_2.setBounds(10, 53, 246, 31);
		panel_2_2.add(lblNewLabel_4_1_1_1_2);
		
		JLabel lblNewLabel_4_1_1_2_1 = new JLabel("Syst\u00E9me D'exploitation GNU/Linux");
		lblNewLabel_4_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_2_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_2_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblNewLabel_4_1_1_2_1.setBounds(10, 98, 253, 31);
		panel_2_2.add(lblNewLabel_4_1_1_2_1);
		
		JLabel lblNewLabel_4_1_1_3_1 = new JLabel("Environement Economique Et Juridrique");
		lblNewLabel_4_1_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_3_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_3_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_1_3_1.setBounds(10, 140, 253, 31);
		panel_2_2.add(lblNewLabel_4_1_1_3_1);
		
		DevN1 = new JTextField();
		DevN1.setColumns(10);
		DevN1.setBounds(275, 17, 86, 20);
		panel_2_2.add(DevN1);
		
		ArchN1 = new JTextField();
		ArchN1.setColumns(10);
		ArchN1.setBounds(275, 61, 86, 20);
		panel_2_2.add(ArchN1);
		
		LinuxN1 = new JTextField();
		LinuxN1.setColumns(10);
		LinuxN1.setBounds(275, 106, 86, 20);
		panel_2_2.add(LinuxN1);
		
		EejN1 = new JTextField();
		EejN1.setColumns(10);
		EejN1.setBounds(275, 148, 86, 20);
		panel_2_2.add(EejN1);
		
		DevN2 = new JTextField();
		DevN2.setColumns(10);
		DevN2.setBounds(371, 17, 86, 20);
		panel_2_2.add(DevN2);
		
		ArchN2 = new JTextField();
		ArchN2.setColumns(10);
		ArchN2.setBounds(371, 61, 86, 20);
		panel_2_2.add(ArchN2);
		
		LinuxN2 = new JTextField();
		LinuxN2.setColumns(10);
		LinuxN2.setBounds(371, 106, 86, 20);
		panel_2_2.add(LinuxN2);
		
		EejN2 = new JTextField();
		EejN2.setColumns(10);
		EejN2.setBounds(371, 148, 86, 20);
		panel_2_2.add(EejN2);
		
		JLabel lblNewLabel_4_1_1_3_1_1 = new JLabel("Mathematique");
		lblNewLabel_4_1_1_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_3_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_3_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_1_3_1_1.setBounds(10, 182, 253, 31);
		panel_2_2.add(lblNewLabel_4_1_1_3_1_1);
		
		MathN1 = new JTextField();
		MathN1.setColumns(10);
		MathN1.setBounds(275, 188, 86, 20);
		panel_2_2.add(MathN1);
		
		MathN2 = new JTextField();
		MathN2.setColumns(10);
		MathN2.setBounds(371, 188, 86, 20);
		panel_2_2.add(MathN2);
		
		JLabel lblNewLabel_4_1_1_4_1_2_1 = new JLabel("2\u00E9me Notes");
		lblNewLabel_4_1_1_4_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_4_1_2_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_4_1_2_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_1_4_1_2_1.setBounds(371, -11, 86, 43);
		panel_2_2.add(lblNewLabel_4_1_1_4_1_2_1);
		
		JLabel lblNewLabel_4_1_1_4_3_1 = new JLabel("1ere Notes");
		lblNewLabel_4_1_1_4_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_4_3_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_4_1_1_4_3_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_1_1_4_3_1.setBounds(273, -11, 88, 43);
		panel_2_2.add(lblNewLabel_4_1_1_4_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("Votre r\u00E9sultat final sera enregistr\u00E9 dans : \" C:\\App\\Resultat.txt \" . C'est \u00E7a le chemin de votre r\u00E9sultat .");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(491, 435, 505, 34);
		contentPane.add(lblNewLabel_1);
		
		
		
	}
}
