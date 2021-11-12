package mouseEvents;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouse extends JFrame{

	private JPanel mousepanel;
	private JLabel statusbar;
	
	public mouse() {
		super("title");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
		
		
	}
	
	private class Handlerclass implements MouseListener, MouseMotionListener{
		
		public void mouseClicked(MouseEvent event) {
				statusbar.setText(String.format("Clicked at %d, %d" , event.getX(), event.getY()));
		}

		public void mousePressed(MouseEvent event) {
				statusbar.setText("you pressed down the mouse");
		}
		public void mouseReleased(MouseEvent event) {
				statusbar.setText("You released the mouse");
		}
		public void mouseEntered(MouseEvent event) {
				statusbar.setText("You entered the area");
				mousepanel.setBackground(Color.BLACK);
		}
		public void mouseExited(MouseEvent event) {
				statusbar.setText("Mouse exited the window");
				mousepanel.setBackground(Color.WHITE);
		}
		//These are mouse motion Events
		
		public void mouseDragged(MouseEvent e) {
			statusbar.setText("You are Draging the mouse");
		}
	
		public void mouseMoved(MouseEvent e) {
			statusbar.setText("You moved the mouse");
		}
		
		
	}
	
}
