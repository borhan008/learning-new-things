import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Joptionpane {
	Joptionpane(){
		/*JOptionPane.showMessageDialog(null, "INfooo", "title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "INfooo", "title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "INfooo", "title", JOptionPane.QUESTION_MESSAGE);		
		JOptionPane.showMessageDialog(null, "INfooo", "title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "INfooo", "title", JOptionPane.ERROR_MESSAGE);
*/
		/*
		int n = JOptionPane.showConfirmDialog(null, "Infooo", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(n);
		*/

		/*
		String name = JOptionPane.showInputDialog("Name");
		System.out.print(name);
		*/
		
		String [] res = {"Option 1", "Option 2", "Option 3"};
		ImageIcon icon = new ImageIcon("logo.jpg");
		
		JOptionPane.showOptionDialog(null, "Infoo", "title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icon, res, 0);
	}
}
