package EventHandlingForma;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class forma extends JFrame {
	
	private JTextField imetb;
	private JTextField prezimetb;
	private JTextField gradtb;
	private JTextField username;
	private JPasswordField pass;
	
	public forma() {
		
		super("Forma");
		setLayout(new FlowLayout());
		
		imetb = new JTextField("Внесете име",20);
		add(imetb);
		
		prezimetb = new JTextField("Внесете презиме",20);
		add(prezimetb);
		
		gradtb = new JTextField("Внесете град", 20);
		add(gradtb);
		
		username = new JTextField("Внесете корисничко име", 20);
		add(username);
		
		pass = new JPasswordField("Лозинка");
		add(pass);
		
		thehandler handler = new thehandler();
		imetb.addActionListener(handler);
		prezimetb.addActionListener(handler);
		gradtb.addActionListener(handler);
		username.addActionListener(handler);
		pass.addActionListener(handler);
		
	}
	
	private class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			String string = "";
			
			if(event.getSource()==imetb)
				string = String.format("Vnesenoto ime e : %s", event.getActionCommand());
			else if(event.getSource()==prezimetb)
				string = String.format("Vnesenoto prezime e : %s", event.getActionCommand());
			else if(event.getSource()==gradtb)
				string = String.format("Vneseniot grad e: %s", event.getActionCommand());
			else if(event.getSource()==username)
				string = String.format("Vnesenoto korisnicko ime e: %s", event.getActionCommand());
			else if(event.getSource()==pass)
				string = String.format("Vnesenata lozinka e: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
		
	}
	
}
