import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demonewwindow extends JFrame{
	Demonewwindow(){
		JLabel label = new JLabel("Hello");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(label);
		this.setVisible(true);
	}
}
