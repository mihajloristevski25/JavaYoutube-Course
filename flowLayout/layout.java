package flowLayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class layout extends JFrame {

	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout lay;
	private Container container;
	
	public layout() {
		super("title");
		lay = new FlowLayout();
		container = getContentPane();
		setLayout(lay);
		// lev button
		lb = new JButton("leftB");
		add(lb);
		lb.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						lay.setAlignment(FlowLayout.LEFT);
						lay.layoutContainer(container);
					}
					
				}
				
				);
		// center button
		cb = new JButton("centerB");
		add(cb);
		cb.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						lay.setAlignment(FlowLayout.CENTER);
						lay.layoutContainer(container);
					}
					
				}
				
				);
		// desen button
		rb = new JButton("rightB");
		add(rb);
		rb.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						lay.setAlignment(FlowLayout.RIGHT);
						lay.layoutContainer(container);
					}
					
				}
				
				);
		
		
	}
	
}
