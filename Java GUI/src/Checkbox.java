import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Checkbox implements ActionListener{
	JFrame frame = new JFrame();
	JCheckBox checkbox;
	JButton btn = new JButton();
	Checkbox(){
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		checkbox = new JCheckBox();
		checkbox.setText("I am not robot");
		checkbox.setFocusable(false);
		checkbox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn.setText("Submit");
		btn.addActionListener(this);
		
		frame.add(checkbox);
		frame.add(btn);
		frame.pack();
		frame.setVisible(true);				
	};
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			System.out.println(checkbox.isSelected());
		}
	}
}
