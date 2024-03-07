import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Area {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area window = new Area();
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
	public Area() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BEST TOURISM PLACES IN PAKISTAN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(250, 11, 373, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel skarduP = new JLabel(""); 
		ImageIcon img= new ImageIcon(this.getClass().getResource("/sawat.jpeg"));
		skarduP.setIcon(img);
		skarduP.setBounds(71, 78, 178, 121);
		frame.getContentPane().add(skarduP);
		
		JLabel islamabad = new JLabel("");
	ImageIcon img1= new ImageIcon(this.getClass().getResource("/islamabd.jpeg"));
		islamabad.setIcon(img1);
	islamabad.setBounds(306, 71, 211, 128);
		frame.getContentPane().add(islamabad);
		
		JLabel lahore = new JLabel("");
		ImageIcon img2= new ImageIcon(this.getClass().getResource("/Lahore.jpeg"));
		lahore.setIcon(img2);
		lahore.setBounds(590, 78, 211, 121);
		frame.getContentPane().add(lahore);
		
		JLabel kashmir = new JLabel("");
		ImageIcon img3= new ImageIcon(this.getClass().getResource("/kashmir.jpeg"));
		kashmir.setIcon(img3);
		kashmir.setBounds(71, 263, 178, 142);
		frame.getContentPane().add(kashmir);
		
		JLabel Karachi = new JLabel("");
		ImageIcon img4=new ImageIcon(this.getClass().getResource("/Karachi.jpeg"));
				Karachi.setIcon(img4);
		Karachi.setBounds(306, 263, 211, 142);
		frame.getContentPane().add(Karachi);
		
		JLabel Quetta = new JLabel("");
		ImageIcon img5=new ImageIcon(this.getClass().getResource("/Quetta.jpeg"));
		Quetta.setIcon(img5);
		Quetta.setBounds(590, 263, 211, 142);
		frame.getContentPane().add(Quetta);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(71, 235, 730, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(71, 446, 730, 2);
		frame.getContentPane().add(separator_1);
		
		JButton Bs = new JButton("Sawat");
		Bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Pack intro=new Pack(); 
			Pack.main(null);
			}
		});
		Bs.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bs.setBounds(121, 206, 89, 23);
		frame.getContentPane().add(Bs);
		
		JButton bisl = new JButton("Islamabad");
		bisl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pack intro1=new Pack(); 
				Pack.main(null);
				
			}
		});
		bisl.setFont(new Font("Tahoma", Font.BOLD, 13));
		bisl.setBounds(356, 206, 105, 23);
		frame.getContentPane().add(bisl);
		
		JButton bLah = new JButton("Lahore");
		bLah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pack intro2=new Pack(); 
				Pack.main(null);
				
			}
		});
		bLah.setFont(new Font("Tahoma", Font.BOLD, 13));
		bLah.setBounds(659, 207, 89, 23);
		frame.getContentPane().add(bLah);
		
		JButton bKas = new JButton("Kashmir");
		bKas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					Pack intro3=new Pack(); 
					Pack.main(null);	
				}
		});
		
		bKas.setFont(new Font("Tahoma", Font.BOLD, 13));
		bKas.setBounds(121, 416, 89, 23);
		frame.getContentPane().add(bKas);
		
		JButton bKar = new JButton("Karachi");
		bKar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Pack intro4=new Pack(); 
					Pack.main(null);                   }
		});
		bKar.setFont(new Font("Tahoma", Font.BOLD, 13));
		bKar.setBounds(356, 416, 89, 23);
		frame.getContentPane().add(bKar);
		
		JButton btnNewButton_4 = new JButton("Quetta");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pack intro5=new Pack(); 
				Pack.main(null);
			
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBounds(659, 416, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		}
}
