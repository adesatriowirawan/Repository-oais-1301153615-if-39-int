package Entity;

import javax.swing.*;

public class Hole extends JPanel {
    
    private ImageIcon hole_icon;
    private JLabel hole;
    private int pos_x;
    private int pos_y;
    
    public Hole() {
        hole_icon = new ImageIcon(getClass().getResource("assets//hole.png"));
        hole = new JLabel(hole_icon);
        this.add(hole);
        this.setSize(37,37);
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }
    
}
