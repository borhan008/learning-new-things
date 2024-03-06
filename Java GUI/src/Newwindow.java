import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Newwindow implements ActionListener{
	JFrame frame = new JFrame();
	JButton btn = new JButton("new window");
	Newwindow(){
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		btn.setBounds(100, 150, 200, 20);
		btn.setFocusable(false);
		btn.addActionListener(this);
		frame.add(btn);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			frame.dispose();
			Demonewwindow mywindow = new Demonewwindow();
		}
	}
}
