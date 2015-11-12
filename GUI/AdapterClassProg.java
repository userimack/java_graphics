 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
 class GuiAdapter extends JFrame{
	 private String details;
	 private JLabel statusbar;
	 
	 GuiAdapter(){
		 super("Title");
		 
		 statusbar = new JLabel("This is Default");
		 add(statusbar, BorderLayout.SOUTH);
		 addMouseListener(new Mouseclass());
	 }
	 
	 private class Mouseclass extends MouseAdapter{
		 public void mouseClicked(MouseEvent event){
			 details = String.format("You Clicked %d ", event.getClickCount());
			 
			 if(event.isMetaDown())
			 	details += "with right mouse button";
			else if (event.isAltDown())
				details += "with center mouse button";
			else
				details += "with left mouse button";
			
			statusbar.setText(details);
		 }
	 }
 }
 
 class AdapterClassProg {
	public static void main(String args[]) {
		GuiAdapter go = new GuiAdapter();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,200);
		go.setVisible(true);
	}
}
 
  