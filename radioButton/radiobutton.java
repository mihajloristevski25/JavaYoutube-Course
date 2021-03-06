package radioButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class radiobutton extends JFrame{
	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public radiobutton() {
		super("title");
		setLayout(new FlowLayout());
		
		
		tf = new JTextField("This is a sentence");
		add(tf);
		
		pb = new JRadioButton("plain",true);
		bb = new JRadioButton("bold",false);
		ib = new JRadioButton("italic",false);
		bib = new JRadioButton("bold and italic",false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN,14);
		bf = new Font("Serif", Font.BOLD,14);
		itf = new Font("Serif", Font.ITALIC,14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC ,14);
		tf.setFont(pf);
		
		// ceka event da se sluchi , prima font object vo constructor
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));
		
	}
	
	private class HandlerClass implements ItemListener{
		
		private Font font;
		//  go menva objektot koj so mu go davame vo promenlivata font
		public HandlerClass(Font f) {
			font = f;
		}
		
		//go mesti fontot na toj objekt koj sho mu e vnesen
		public void itemStateChanged(ItemEvent event) {
			tf.setFont(font);
		}
		
		
	}
	
}
