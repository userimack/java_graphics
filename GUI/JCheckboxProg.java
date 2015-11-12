import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GuiCheckbox extends JFrame{
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	GuiCheckbox (){
		super("The Title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("This is a sentence",20);
		tf.setFont(new Font("Serif",Font.PLAIN,14));
		add(tf);
		
		boldbox = new JCheckBox("bold");
		italicbox = new JCheckBox("Italics");
		add(boldbox);
		add(italicbox);
			
		HandlerClass handler = new HandlerClass();
		boldbox.addItemListener(handler); 
		italicbox.addItemListener(handler);	
		
	}
	
	private class  HandlerClass implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			Font font =null;
			
			if(boldbox.isSelected()  && italicbox.isSelected()) 
				font = new Font("Serif", Font.BOLD + Font.ITALIC,14);
				
			else if(boldbox.isSelected())
				font = new Font("Serif",Font.BOLD,14);
				
			else if(italicbox.isSelected())
				font = new Font("Serif",Font.ITALIC,14);
			
			else
				font = new Font("Serif",Font.PLAIN,14);
				
			tf.setFont(font);
			
		}
	}
}
class JCheckBoxProg{
	public static void main(String args[]) {
		GuiCheckbox go = new GuiCheckbox();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(250,200);
		go.setVisible(true);
	}
}