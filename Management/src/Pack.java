import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pack {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pack window = new Pack();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pack() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 851, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TRAVEL WITH US ALL PAKISTAN");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(176, 11, 649, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Family Packages  \r\n\r\n10 days 9 nights stay/\r\n breakfast,lunch,dinner/\r\nTravelling and hotel includes/                 ONLY IN RS : 55000\r\n");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 56, 815, 67);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFamilyPackages = new JLabel("1 person  Packages  \r\n10 days 9 nights stay\r\n/ breakfast,lunch,dinner\r\n/Travelling and hotel includes                                          ONLY IN RS : 5000\r\n");
		lblFamilyPackages.setForeground(Color.WHITE);
		lblFamilyPackages.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblFamilyPackages.setBounds(10, 303, 815, 55);
		frame.getContentPane().add(lblFamilyPackages);
		
		JLabel lblMiniFamilyPackages = new JLabel(" Mini Family Packages (3 person) \r\n10 days 9 nights stay/\r\n breakfast,lunch,dinner\r\n/Travelling and hotel includes/               ONLY IN RS : 15000\r\n");
		lblMiniFamilyPackages.setForeground(Color.WHITE);
		lblMiniFamilyPackages.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblMiniFamilyPackages.setBounds(10, 168, 815, 67);
		frame.getContentPane().add(lblMiniFamilyPackages);
		
		JButton btnNewButton_1 = new JButton("APPLY");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(btnNewButton_1, " your family package is Selected");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(347, 134, 117, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("APPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton_2, " your Single package is selected");
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(347, 369, 117, 23);
		frame.getContentPane().add(btnNewButton_2);
		
	
		JButton btnNewButton_1_1 = new JButton("APPLY");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton_2, "your mini family package is Selected ");
					
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1_1.setBackground(Color.PINK);
		btnNewButton_1_1.setBounds(347, 246, 117, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
//		JButton btnNewButton = new JButton("APPLY");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(btnNewButton, "  your family pack is Selected ");
//			}
//		});
//		
		JButton btnNewButton_3 = new JButton("back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Area info=new Area();
				Area.main(null);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_3.setBounds(10, 437, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
	 
		JLabel Photo = new JLabel("");
	ImageIcon Img=new ImageIcon(this.getClass().getResource("/pakistan.jpg"));
	Photo.setIcon(Img);
	Photo.setBounds(-10, 0, 845, 471);
	frame.getContentPane().add(Photo); 
	
	
//		btnNewButton.setBackground(Color.GREEN);
//		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
//		btnNewButton.setBounds(347, 144, 117, 23);
	}
}
