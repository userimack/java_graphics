import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Paint extends JFrame{
	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;
	
	Paint(){
		super("Title");
		panel = new JPanel();
		panel.setBackground(color);
		
		b = new JButton("Choose a color!!");
		b.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					color = JColorChooser.showDialog(null,"Pick your color!",color);
				if(color==null)
					color=(Color.WHITE);
					
				panel.setBackground(color);
				}				
			}
		);
		
		add(panel,BorderLayout.CENTER);
		add(b,BorderLayout.SOUTH);
		setSize(425,150);
		setVisible(true);
	}
}
 
class ColorChooserProg{
	public static void main(String[] args){
		Paint p = new Paint();
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
} 
 