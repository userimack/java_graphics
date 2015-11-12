import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class GUI extends JFrame {
	private JButton reg;
	private JButton custom;
	
	GUI(){
		super("Title Bar");
		setLayout(new FlowLayout());
		
		reg = new JButton("Reg Button");
		add (reg);		
		
		ImageIcon a=new ImageIcon(getClass().getResource("a.png"));
		ImageIcon b=new ImageIcon(getClass().getResource("b.png"));
		custom = new JButton("Custom", a );
		custom.setRolloverIcon(b);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
	}
	
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));			
		}
		
	}
}

class JbuttonProg {
	public static void main(String args[]){
		GUI g = new GUI();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(300,200);
		g.setVisible(true);
	}
}