package position;

import javax.swing.*;
import java.awt.*;

public class PositionPanel extends JPanel{
    JLabel label;


    public PositionPanel(String label) {
        setLayout(new BorderLayout());  // set Layout to BorderLayout first before adding components
        setComponents(label); // Default to a white king symbol
    }

    private void setComponents(String labelPiece) {
        label = new JLabel(labelPiece);
        label.setFont(new Font("Serif", Font.BOLD, 32));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        add(label);
    }

    public void setLabel(String labelPiece) {
        label.setText(labelPiece);
        repaint(); // Repaint to update the display
    }

    public String getLabel() {
        return label.getText();
    }
}
