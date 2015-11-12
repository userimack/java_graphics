import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Tuna extends JFrame {
	private JLabel item1;
	
	Tuna() {
		super("Title Bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence.");
		item1.setToolTipText("This is gona show up on hover!!");
		add(item1);
		
	}
}

class Jframe {
	public static void main(String[] args) {
		Tuna t = new Tuna();
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setSize(275,180);
		t.setVisible(true);
	}
}