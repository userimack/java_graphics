import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GuiComboBox extends JFrame {
	private JComboBox	box;
	private JLabel picture;
	
	private static String[] filename = {"a.png","b.png"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};
	
	GuiComboBox(){
		super("Title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename);
		
		box.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent event){
					if(event.getStateChange() == ItemEvent.SELECTED)
						picture.setIcon(pics[box.getSelectedIndex()]);
					
					
				}
			}	
		);
		
		add(box);
		picture = new JLabel(pics[0]);
		add(picture);
		
	}	
}

class JComboBoxProg{
	public static void main(String args[]) {
		GuiComboBox go = new GuiComboBox ();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,200);
		go.setVisible(true);
	}
}


