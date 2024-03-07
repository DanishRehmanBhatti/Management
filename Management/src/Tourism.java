import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tourism {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tourism window = new Tourism();
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
	public Tourism() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PAKISTAN TOURISM MANAGEMENT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(189, 27, 453, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Personal Information ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GRAY));
		panel.setToolTipText("");
		panel.setBounds(288, 96, 402, 333);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First name");
		lblNewLabel_1.setBounds(22, 29, 103, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(141, 26, 222, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Surname");
		lblNewLabel_2.setBounds(22, 60, 80, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 57, 222, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(22, 88, 46, 14);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(141, 88, 222, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Passport Number");
		lblNewLabel_4.setBounds(22, 124, 113, 14);
		panel.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 119, 222, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nationality");
		lblNewLabel_5.setBounds(22, 205, 80, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Duration");
		lblNewLabel_6.setBounds(22, 159, 68, 14);
		panel.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(141, 156, 222, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox slt = new JComboBox();
		slt.setModel(new DefaultComboBoxModel(new String[] {"SELECT YOUR COUNTRY", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo (Congo-Brazzaville)", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czechia (Czech Republic)", "Democratic Republic of the Congo (Congo-Kinshasa)", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini (formerly \"Swaziland\")", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein"}));
		slt.setBounds(141, 201, 222, 22);
		panel.add(slt);
		
		JCheckBox ConditionCheckBox = new JCheckBox("I have provided all the knowledge correctly");
		ConditionCheckBox.setBounds(55, 251, 287, 23);
		panel.add(ConditionCheckBox);
		
		
		JButton ConB = new JButton("Continue");
		ConB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		ConB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String NF=textField.getText();
				String pass=textField_1.getText();
				String SN=textField_2.getText ();
				String email=textField_3.getText();
				String DUR=textField_4.getText();
				
				if(NF.contains("Danish") && SN.contains("Rehman") && pass.contains("1234") && email.contains("DANISHREHMAN") && DUR.contains("20 days")
						&& slt.getSelectedItem().equals("Afghanistan")  && ConditionCheckBox.isSelected()) {
					
					textField.setText(null);	
					  textField_1.setText(null);	
					     textField_2.setText(null);	
					        textField_3.setText(null);		
					          textField_4.setText(null);	
					
                	Area in=new Area();
                	Area.main(null);
					
}		
				else {
					 JOptionPane.showMessageDialog(null, " please fill all the information according to your best knowledge");
					
					    textField.setText(null);	
						   textField_1.setText(null);	
						      textField_2.setText(null);
						         textField_3.setText(null);	
						        	textField_4.setText(null);	
					
						
				}
			}
		});
		ConB.setBounds(204, 299, 118, 23);
		panel.add(ConB);
		
		JButton ExitB = new JButton("Exit");
		ExitB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		ExitB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame =new JFrame("Exit");
				
			if (JOptionPane.showConfirmDialog(frame, " Confirm if you want to exit","Tourism",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
				
	
			}
		});
		
     	ExitB.setBounds(56, 299, 113, 23);
		panel.add(ExitB);
		
		JLabel photo = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/visa.jpeg")).getImage();
		photo.setIcon(new ImageIcon(img));
		photo.setBounds(78, 75, 244, 268);
		frame.getContentPane().add(photo);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(0, 0, 800, 469);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
