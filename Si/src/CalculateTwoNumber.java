import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField textNumber1;
	private JTextField textNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
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
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblNumber1.setBounds(36, 11, 109, 33);
		contentPane.add(lblNumber1);

		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumber2.setBounds(36, 55, 109, 29);
		contentPane.add(lblNumber2);

		textNumber1 = new JTextField();
		textNumber1.setBounds(165, 18, 200, 24);
		contentPane.add(textNumber1);
		textNumber1.setColumns(10);

		textNumber2 = new JTextField();
		textNumber2.setBounds(165, 59, 200, 24);
		contentPane.add(textNumber2);
		textNumber2.setColumns(10);

		final JComboBox<String> cmdOperator = new JComboBox<String>();
		cmdOperator.setBounds(165, 100, 105, 24);		
		cmdOperator.addItem("+");
		cmdOperator.addItem("-");
		cmdOperator.addItem("*");
		cmdOperator.addItem("%");
		contentPane.add(cmdOperator);

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperator.setBounds(36, 95, 95, 30);
		contentPane.add(lblOperator);

		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResult.setBounds(193, 183, 67, 29);
		contentPane.add(lblResult);

		JLabel lblNewLabel = new JLabel("How to show digit");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(36, 136, 122, 24);
		contentPane.add(lblNewLabel);

		JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(161, 139, 109, 23);
		contentPane.add(oneDigit);

		JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(275, 139, 109, 23);
		contentPane.add(twoDigit);

		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);

		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operetor = null;
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(textNumber1.getText());
					num2 = Double.parseDouble(textNumber2.getText());
					operetor = (String)cmdOperator.getSelectedItem();
					if(operetor.equals("+")){
						sum = num1+num2;
					}
					if(operetor.equals("-")){
						sum = num1-num2;
					}
					if(operetor.equals("*")){
						sum = num1*num2;
					}
					if(operetor.equals("/")){
						sum = num1%num2;
					}
					lblResult.setText(String.format("%.2f", sum));
				}
			}
		});
		btnOK.setBounds(99, 211, 95, 39);
		contentPane.add(btnOK);

		JButton btnEXIT = new JButton("EXIT");
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEXIT.setBounds(251, 211, 95, 39);
		contentPane.add(btnEXIT);







	}
}