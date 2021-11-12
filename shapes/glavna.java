package shapes;
import javax.swing.*;
import java.awt.*;


public class glavna {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		shapes s = new shapes();
		s.setBackground(Color.WHITE);
		f.add(s);
		f.setSize(500,270);
		f.setVisible(true);
	}
}
