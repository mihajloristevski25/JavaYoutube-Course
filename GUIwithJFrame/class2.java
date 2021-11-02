package GUIwithJFrame;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class class2 extends JFrame{
	
	private JLabel item1;
	
	public class2() {
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence");
		item1.setToolTipText("This is showing up on hower");
		add(item1);
		
		
	}
	
}
