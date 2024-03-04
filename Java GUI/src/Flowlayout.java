import java.awt.FlowLayout;

import javax.swing.*;

public class Flowlayout extends JFrame {
	Flowlayout(){
		this.setSize(500, 500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 20));
		
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		
		this.setVisible(true);

	}
}
