import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame {
	static JButton btn;
	Button() {
		btn = new JButton();
		btn.setBounds(200, 100, 100, 20);
		btn.addActionListener(e -> System.out.println("Clickd"));
		btn.setText("Button");
		btn.setFocusable(false);
		btn.setForeground(Color.red);
		btn.setBackground(Color.black);
		btn.setBorder(BorderFactory.createEtchedBorder());
		//btn.setEnabled(false);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setLayout(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.add(btn);
	
	}

}
