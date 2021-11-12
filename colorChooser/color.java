package colorChooser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class color  extends JFrame{
	private JButton b;
	private Color clr = (Color.WHITE);
	private JPanel panel;
	
	public color () {
		super("Title");
		panel = new JPanel();
		panel.setBackground(clr);
		
		b = new JButton("Choose a color");
		b.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							clr = JColorChooser.showDialog(null, "pick color" , clr);
							if(clr == null)
								clr = (Color.WHITE);
							
							panel.setBackground(clr);
						}
					}
				
				);
		
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(425,140);
		setVisible(true);
	}
	
}
