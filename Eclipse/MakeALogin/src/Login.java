
/*
 * Tên : 
 * MSSV : 
 * Lớp: CN1.K2022.1
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {


	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		panel.setLayout(null);

		JLabel log = new JLabel("Login");
		log.setFont(new Font(null, Font.BOLD, 30));
		log.setBounds(250, 10, 100, 100);
		panel.add(log);

		JLabel user = new JLabel("User Name");
		user.setBounds(50, 50, 100, 100);
		panel.add(user);

		JLabel pass = new JLabel("Password");
		pass.setBounds(50, 100, 100, 100);
		panel.add(pass);

		JTextField text = new JTextField("User Name");
		text.setBounds(140, 88, 400, 25);
		panel.add(text);

		JPasswordField text2 = new JPasswordField();
		text2.setBounds(140, 138, 400, 25);
		panel.add(text2);

		JButton button = new JButton("Login");
		button.setBounds(348, 230, 100, 25);
		button.addActionListener(new Login());
		panel.add(button);

		JButton button1 = new JButton("Cancel");
		button1.setBounds(448, 230, 100, 25);
		button1.addActionListener(new Login());
		panel.add(button1);

		frame.setVisible(true);
	}

	private AbstractButton passwordText;
	private AbstractButton userText;

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + "," + password);

	}

}
