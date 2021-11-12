package JList;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class jlist extends JFrame{

		private JList list;
		private static String[] colornames = {"black" , "blue" , "yellow" , "white"};
		private static Color[] colors = {Color.BLACK, Color.BLUE , Color.YELLOW,Color.WHITE};
	
		
		public jlist() {
			super("title");
			setLayout(new FlowLayout());
			
			
			list = new JList(colornames);
			list.setVisibleRowCount(4);
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			add(new JScrollPane(list));
			
			
			list.addListSelectionListener(
					
					new ListSelectionListener() {
						
						public void valueChanged(ListSelectionEvent event) {
							getContentPane().setBackground(colors[list.getSelectedIndex()]);
						}
					}
					);
			
		}
}
