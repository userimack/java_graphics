import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Paint extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(25,25,100,30);
		
		g.setColor(new Color(190,81,215));
		g.fillRect(25,65,100,30);
		
		g.setColor(Color.RED);
		g.drawString("Mahendra Yadav",25,120);
		
	}
}

class GraphicsProg{
	public static void main(String[] args){
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Paint p = new Paint();
		f.add(p);
		f.setSize(400,250);
		f.setVisible(true); 
	}
}