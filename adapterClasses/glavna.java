package adapterClasses;

import javax.swing.JFrame;

public class glavna {
	public static void main(String[] args) {
		
		adapter a = new adapter();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(300,300);
		a.setVisible(true);
	}
}
