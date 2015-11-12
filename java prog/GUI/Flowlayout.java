import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Layout extends JFrame{
	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;
	
	Layout(){
		super("Title");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		//Left button
		lb = new JButton("Left");
		add(lb);
		lb.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					layout.setAlignment(FlowLayout.LEFT);
					layout.layoutContainer(container);
				}
			}
		);
		
		//Center button
		cb = new JButton("Center");
		add(cb);
		cb.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					layout.setAlignment(FlowLayout.CENTER);
					layout.layoutContainer(container);
				}
			}   
		);
		
		//right button
		rb = new JButton("Right");
		add(rb);
		rb.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					layout.setAlignment(FlowLayout.RIGHT);
					layout.layoutContainer(container);
				}
			}
		);
	}
	
}

class Flowlayout{
	public static void main(String[] args){
		Layout l = new Layout();
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setSize(300,200);
		l.setVisible(true);
	}
}