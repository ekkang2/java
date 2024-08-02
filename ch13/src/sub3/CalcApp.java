package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
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
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 268, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton.setBounds(12, 69, 63, 64);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1.setBounds(79, 69, 63, 64);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_2.setBounds(150, 69, 63, 64);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("/");
		btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(217, 69, 63, 64);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strnum4 = btnNewButton_3.getText();
				
				int num4 = Integer.parseInt(strnum4);
				
				textField.setText(""+num4); 
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_3.setBounds(12, 144, 63, 64);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1_2.setBounds(79, 144, 63, 64);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_2_1.setBounds(150, 144, 63, 64);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("x");
		btnNewButton_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1_1_1.setBounds(217, 144, 63, 64);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_3_1 = new JButton("1");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strnum1 = btnNewButton_3_1.getText();
				
				int num1 = Integer.parseInt(strnum1);
				
				textField.setText(""+num1); 
			}
		});
		btnNewButton_3_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_3_1.setBounds(12, 218, 63, 64);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_1_2_1 = new JButton("2");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strnum2 = btnNewButton_1_2_1.getText();
				
				int num2 = Integer.parseInt(strnum2);
				
				textField.setText(""+num2); 
				
			}
		});
		btnNewButton_1_2_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1_2_1.setBounds(79, 218, 63, 64);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("3");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strnum3 = btnNewButton_2_1_1.getText();
				
				int num3 = Integer.parseInt(strnum3);
				
				textField.setText(""+num3); 
				
			}
		});
		btnNewButton_2_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_2_1_1.setBounds(150, 218, 63, 64);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("-");
		btnNewButton_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1_1_1_1.setBounds(217, 218, 63, 64);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("C");
		btnNewButton_3_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_3_1_1.setBounds(12, 292, 63, 64);
		contentPane.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("0");
		btnNewButton_1_2_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1_2_1_1.setBounds(79, 292, 63, 64);
		contentPane.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("=");
		btnNewButton_2_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_2_1_1_1.setBounds(150, 292, 63, 64);
		contentPane.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("+");
		btnNewButton_1_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1_1_1_1_1.setBounds(217, 292, 63, 64);
		contentPane.add(btnNewButton_1_1_1_1_1);
	}

}
