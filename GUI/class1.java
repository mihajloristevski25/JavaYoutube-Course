package GUI;

import javax.swing.JOptionPane;

public class class1 {
	public static void main(String[] args) {
		
		String fn = JOptionPane.showInputDialog("Enter your first number");	
		String sn = JOptionPane.showInputDialog("Enter your second number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " + sum, "Answer", JOptionPane.PLAIN_MESSAGE);
	}
}
