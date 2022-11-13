package tete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Toolkit;

public class infos extends JFrame {

	private JPanel contentPane;
    static JLabel name ;
     static  JLabel age;
     static JLabel moy ;
     static JLabel code ;
     static JLabel pasw ;
     static JLabel paswnb;
     static JLabel voil ;
     static infos frame;
     static JButton Return;
 	static JButton exit;
     
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new infos();
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
	public infos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\salah\\OneDrive\\Bureau\\recherche-doc-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		 voil = new JLabel("Voila Vos Information :");
		voil.setBackground(Color.WHITE);
		voil.setForeground(Color.RED);
		voil.setFont(new Font("Tahoma", Font.BOLD, 20));
		voil.setHorizontalAlignment(SwingConstants.CENTER);
		voil.setBounds(102, 54, 358, 50);
		contentPane.add(voil);
		
		 name = new JLabel("");
		name.setFont(new Font("Tahoma", Font.BOLD, 15));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(10, 140, 321, 14);
		contentPane.add(name);
		
		 age = new JLabel("");
		age.setHorizontalAlignment(SwingConstants.CENTER);
		age.setFont(new Font("Tahoma", Font.BOLD, 15));
		age.setBounds(10, 182, 321, 19);
		contentPane.add(age);
		
		 moy = new JLabel("");
		moy.setHorizontalAlignment(SwingConstants.CENTER);
		moy.setFont(new Font("Tahoma", Font.BOLD, 15));
		moy.setBounds(10, 218, 321, 19);
		contentPane.add(moy);
		
		 code = new JLabel("");
		code.setHorizontalAlignment(SwingConstants.CENTER);
		code.setFont(new Font("Tahoma", Font.BOLD, 15));
		code.setBounds(10, 255, 321, 19);
		contentPane.add(code);
		
		 pasw = new JLabel("");
		pasw.setHorizontalAlignment(SwingConstants.CENTER);
		pasw.setFont(new Font("Tahoma", Font.BOLD, 15));
		pasw.setBounds(10, 292, 321, 14);
		contentPane.add(pasw);
		
		paswnb = new JLabel("");
		paswnb.setHorizontalAlignment(SwingConstants.CENTER);
		paswnb.setFont(new Font("Tahoma", Font.BOLD, 15));
		paswnb.setBounds(220, 292, 76, 14);
		contentPane.add(paswnb);
		
		
		
	}

}
