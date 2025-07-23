package position;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class PositionPanel extends JPanel{
    JLabel label;
    private int row;
    private int col;
    private boolean isClicked = false;


    public PositionPanel(String label, int row, int col) {
        setLayout(new BorderLayout());  // set Layout to BorderLayout first before adding components
        setComponents(label);

        this.row = row;
        this.col = col;
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

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setClicked(boolean clicked){
        isClicked = clicked;
    }

    public boolean wasClicked(){
        return isClicked;
    }
    
    public void addClickListener(MouseListener listener) {
        addMouseListener(listener);
    }
}
