import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    public Test() {
        setTitle("Scrollable Panel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Create and add rows of panels with label and button
        for (int i = 0; i < 20; i++) {
            JPanel rowPanel = new JPanel();
            rowPanel.setPreferredSize(new Dimension(300, 50)); // Adjust size as needed

            JLabel label = new JLabel("Label  Label abelLabel LabelLabelLabelLabelLabelLabel  Label Label " + i);
            JButton button = new JButton("Button " + i);

            rowPanel.add(label);
            rowPanel.add(button);
            mainPanel.add(rowPanel);
        }

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        getContentPane().add(scrollPane);
        pack();
        setLocationRelativeTo(null); // Center the 
this.setVisible(true);
    }


}
