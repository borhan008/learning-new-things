import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {
	Label() {
	JLabel label = new JLabel();
	label.setText("Hello world");
	Border border = BorderFactory.createLineBorder(Color.green, 3);
	
	ImageIcon image = new ImageIcon("logo.jpg");
	label.setIcon(image);
	label.setHorizontalTextPosition(JLabel.CENTER);
	label.setVerticalTextPosition(JLabel.TOP);
	label.setForeground(Color.green);
	label.setFont(new Font("Roboto", Font.BOLD , 20));
	label.setIconTextGap(10);
	label.setBackground(Color.black);
	label.setOpaque(true);
	label.setBorder(border);
	label.setVerticalAlignment(JLabel.CENTER);
	label.setHorizontalAlignment(JLabel.CENTER);
	
	
	JFrame frame = new JFrame();
	frame.setSize(500, 500);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(label);
	
	frame.setLayout(null);
	label.setBounds(10, 10, 200, 200);
	}
}
