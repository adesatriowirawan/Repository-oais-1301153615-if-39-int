package Entity;

import javax.swing.*;

public class Dog extends JPanel {
    
    private ImageIcon dog_icon;
    private JLabel dog;
    private int pos_x;
    private int pos_y;
    
    public Dog() {
        dog_icon = new ImageIcon(getClass().getResource("assets//dog.png"));
        dog = new JLabel(dog_icon);
        this.add(dog);
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
