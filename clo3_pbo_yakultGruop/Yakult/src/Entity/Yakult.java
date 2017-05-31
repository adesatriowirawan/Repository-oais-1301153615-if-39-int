package Entity;

import javax.swing.*;

public class Yakult extends JPanel {
    
    private ImageIcon yakult_icon;
    private JLabel yakult;
    private int pos_x;
    private int pos_y;
    
    public Yakult() {
        yakult_icon = new ImageIcon(getClass().getResource("assets//yakult.png"));
        yakult = new JLabel(yakult_icon);
        this.add(yakult);
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
