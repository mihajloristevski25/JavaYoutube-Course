package comboBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class combobox extends JFrame {

	private JComboBox box;
	private JLabel pic;
	
	private static String[] filename = {"spotify.png" , "webpack.png"};
	private  Icon[] pics = { new ImageIcon(getClass().getResource(filename[0])) , new ImageIcon(getClass().getResource(filename[1]))};
	public combobox() {
		super("Title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename);
		
		box.addItemListener(
				
				new ItemListener() {
					public void itemStateChanged(ItemEvent event) {
						if(event.getStateChange() == ItemEvent.SELECTED)
							pic.setIcon(pics[box.getSelectedIndex()]);
					}
				}
				
				);
		
		add(box);
		pic = new JLabel(pics[0]);
		add(pic);
		
		
	}
}
