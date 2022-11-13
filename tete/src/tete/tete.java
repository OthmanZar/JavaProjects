package tete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import java.awt.Toolkit;
import java.sql.*;
public class tete extends JFrame {

	private JPanel contentPane;
	static JButton Return;
	
	/**
	 * Launch the application.
	 */
	static eleve eleve1 = new eleve();
	static Scanner scan = new  Scanner(System.in);
 static tete frame ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 frame = new tete();
				 tete.frame.setUndecorated(true);
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
	public tete() {
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\salah\\OneDrive\\Bureau\\qr-code-iphone-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 637, 456);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel bien = new JLabel("Bienvenue Dans le G\u00E9n\u00E9rateur de code");
		bien.setFont(new Font("Tahoma", Font.BOLD, 25));
		bien.setHorizontalAlignment(SwingConstants.CENTER);
		bien.setForeground(Color.RED);
		bien.setBounds(34, 22, 561, 62);
		contentPane.add(bien);
		
		JLabel menu = new JLabel("Voila Notre Menu ");
		menu.setBackground(Color.GRAY);
		menu.setFont(new Font("Tahoma", Font.BOLD, 15));
		menu.setForeground(Color.BLACK);
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setBounds(34, 126, 164, 35);
		contentPane.add(menu);
		
		JButton code = new JButton("Avoir un code");
		code.setBackground(Color.LIGHT_GRAY);
		code.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				put put1 = new put();
				put1.setVisible(true);
				
				put1.exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						put1.setVisible(false);
						
					}
				});
				put1.Return.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {	
						put1.setVisible(false);
						frame.setVisible(true);
						
					}
				});
				
			}
		});
		code.setForeground(SystemColor.desktop);
		code.setBounds(198, 172, 235, 35);
		contentPane.add(code);
		
		JButton rech = new JButton("Rechercher un nom");
		rech.setBackground(Color.LIGHT_GRAY);
		rech.setForeground(Color.BLACK);
		rech.setBounds(198, 227, 235, 35);
		rech.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				rech rech1 = new rech();
				rech1.setVisible(true);
				rech1.exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rech1.setVisible(false);
						
					}
				});
				rech1.Return.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {	
						rech1.setVisible(false);
						frame.setVisible(true);
						
					}
				});
			}
		});
		contentPane.add(rech);
		
		JButton info = new JButton("Avoir Les informations d'un nom");
		info.setBackground(Color.LIGHT_GRAY);
		info.setForeground(Color.BLACK);
		info.setBounds(198, 288, 235, 35);
		info.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				code code1 = new code();
				code1.setVisible(true);
				code1.exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						code1.setVisible(false);
						
					}
				});
				code1.Return.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {	
						code1.setVisible(false);
						frame.setVisible(true);
						
					}
				});
				

				
			}
		
		});
		contentPane.add(info);
		
		JButton exit = new JButton("Sortir");
		exit.setForeground(Color.RED);
		exit.setFont(new Font("Tahoma", Font.BOLD, 12));
		exit.setBounds(51, 346, 124, 43);
		exit.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
			}
		});
		contentPane.add(exit);
		
	}
}
