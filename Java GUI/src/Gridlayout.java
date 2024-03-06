import java.awt.GridLayout;

import javax.swing.*;

public class Gridlayout extends JFrame{
	Gridlayout(){
		this.setSize(500, 500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 3, 10, 10)); //x,y, h-margin, v-margin
		
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
