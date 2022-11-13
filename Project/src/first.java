import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;
import javax.swing.JButton;

public class first extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first frame = new first();
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
	public first() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(324, 111, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(69, 284, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(324, 284, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(571, 296, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(260, 204, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(506, 204, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(108, 166, 89, 23);
		contentPane.add(btnNewButton_6);
	}
}
