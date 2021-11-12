package adapterClasses;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class adapter extends JFrame{
	private String details;
	private JLabel statusbar;
	
	
	public adapter() {
		super("title");
		
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
		
		
	}
	
	private class Mouseclass extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			details = String.format("YOu clicked %d ",e.getClickCount());
			
			if(e.isMetaDown()) 
				details += "with right mouse button";
			else if(e.isAltDown()) 
				details += "with center mouse button";
			else 
				details += "with left mouse button";
			
			
			statusbar.setText(details);
			
		}
	}
	
}
