import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GuiRadioButton extends JFrame {
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
	
	GuiRadioButton () {
		super("Title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Mack",25);
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
		
		pf = new Font("Serif",Font.PLAIN,14);
		bf = new Font("Serif",Font.BOLD,14);
		itf = new Font("Serif",Font.ITALIC,14);
		bif = new Font("Serif",Font.BOLD + Font.ITALIC,14);
		tf.setFont(pf);
		//wait for event to happen in font to constructor
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));
		
	}
	
	private class HandlerClass implements ItemListener{
		private Font font;
		//the font object get variable font
		 HandlerClass(Font f){
			font = f;
		}
		//set the font to the font object that was passed in
		public void itemStateChanged(ItemEvent event){
			tf.setFont(font);
		}
		
	}
}

class JRadioButtonProg{
	public static void main(String args[]) {
		GuiRadioButton go = new GuiRadioButton();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,200);
		go.setVisible(true);
	}
}




