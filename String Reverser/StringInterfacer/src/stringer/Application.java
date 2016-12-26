package stringer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application {
	
	private JFrame frame;
	private static JTextField textField;
	
	private static void displayResult(String input) {
		String result = "";
		String[] letters = input.split("");
		for(int i=input.length()-1; i>=0; i--) {
			result+=letters[i];
		}
		textField.setText(result);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(12, 93, 408, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblStringReverserEnter = new JLabel("String Reverser: enter a string!");
		lblStringReverserEnter.setBounds(143, 35, 186, 16);
		frame.getContentPane().add(lblStringReverserEnter);
		
		JButton btnGo = new JButton("Go!");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText();
				displayResult(input);
			}
		});
		btnGo.setBounds(162, 190, 97, 25);
		frame.getContentPane().add(btnGo);
	}
}
