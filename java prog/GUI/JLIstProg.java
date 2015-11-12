import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class GuiJList extends JFrame {
	private JList list;
	private static String[] colorname = {"black", "blue","red","white"};
	private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
	
	GuiJList(){
		super("Title");
		setLayout(new FlowLayout());
		
		list = new JList(colorname);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
			new ListSelectionListener(){
				public void valueChanged(ListSelectionEvent event){
					getContentPane().setBackground(colors[list.getSelectedIndex()]);
				}
			}
		);	
	}
 }
 
class JListProg{
	public static void main(String args[]) {
		GuiJList go = new GuiJList();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,200);
		go.setVisible(true);
	}
}