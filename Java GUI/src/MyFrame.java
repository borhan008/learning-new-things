import java.awt.Color;
import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame(){
		this.setTitle("Title");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("logo.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(255,255,255));
 	}
}
