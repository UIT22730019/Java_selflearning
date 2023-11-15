
/*
 * Tên : Nguyễn Trung Thành
 * MSSV : 22730019
 * Lớp: CN1.K2022.1
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JLabel lg;
	private static JButton button1;

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		panel.setLayout(null);

		lg = new JLabel("Login");
		lg.setFont(new Font(null, Font.BOLD, 30));
		lg.setBounds(250, 10, 100, 100);
		panel.add(lg);

		userLabel = new JLabel("User Name");
		userLabel.setBounds(50, 50, 100, 100);
		panel.add(userLabel);

		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(50, 100, 100, 100);
		panel.add(passwordLabel);

		userText = new JTextField("User Name");
		userText.setBounds(140, 88, 400, 25);
		panel.add(userText);

		passwordText = new JPasswordField();
		passwordText.setBounds(140, 138, 400, 25);
		panel.add(passwordText);

		button = new JButton("Login");
		button.setBounds(348, 230, 100, 25);
		button.addActionListener(new GUI());
		panel.add(button);

		button1 = new JButton("Cancel");
		button1.setBounds(448, 230, 100, 25);
		button1.addActionListener(new GUI());
		panel.add(button1);

		success = new JLabel("");
		success.setBounds(50, 200, 100, 100);
		panel.add(success);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();

		if (user.equals("nguyenTrungThanh") && password.equals("22730019")) {
			success.setText("Login successful !!!");
		}

	}

}
