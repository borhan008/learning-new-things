import java.awt.Color;

import javax.swing.*;

public class Jlayeredpane extends JFrame{
	Jlayeredpane(){
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.black);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.red);
		label2.setBounds(100, 100, 200, 200);

		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150, 150, 200, 200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		//layeredPane.add(label1, JLayeredPane.DRAG_LAYER);
		//layeredPane.add(label2, JLayeredPane.PALETTE_LAYER);
		//layeredPane.add(label3, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(100));
		layeredPane.add(label3, Integer.valueOf(1));		
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(layeredPane);
		this.setVisible(true);
	}
}
