import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Radiobtn extends JFrame implements ActionListener{
	JRadioButton r1, r2, r3;
	Radiobtn(){
		this.setTitle("Title");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		 r1 = new JRadioButton("R1");
		 r2 = new JRadioButton("R2");
		 r3 = new JRadioButton("R3");
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(r1); group.add(r2); group.add(r3);
		this.add(r1); this.add(r2); this.add(r3);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("logo.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(255,255,255));

	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == r1) {
			System.out.println("R1");
		}
		if(e.getSource() == r2) {
			System.out.println("R2");
		}
		if(e.getSource() == r3) {
			System.out.println("R3");
		}
	}
}
