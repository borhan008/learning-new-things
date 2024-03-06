import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Textfield implements ActionListener {
	JFrame frame = new JFrame();
	JButton btn;
	JTextField textfield;
	Textfield(){
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.setLayout(new FlowLayout());
		textfield = new JTextField();
		textfield.setPreferredSize(new Dimension(250, 40));
		 
		btn = new JButton("Submit");
		btn.addActionListener(this);
		frame.add(btn);

		frame.add(textfield);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			System.out.println(textfield.getText());
		}
	}
}
