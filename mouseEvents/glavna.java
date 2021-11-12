package mouseEvents;

import javax.swing.JFrame;

public class glavna {
	public static void main(String[] args) {
		mouse m = new mouse();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setSize(300,300);
		m.setVisible(true);
	}
}
