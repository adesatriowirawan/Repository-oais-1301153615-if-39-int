package Entity;

import javax.swing.*;

public class Rock extends JPanel {
    
    private ImageIcon rock_icon;
    private JLabel rock;
    private int pos_x;
    private int pos_y;
    
    public Rock() {
        rock_icon = new ImageIcon(getClass().getResource("assets//rock.png"));
        rock = new JLabel(rock_icon);
        this.add(rock);
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
