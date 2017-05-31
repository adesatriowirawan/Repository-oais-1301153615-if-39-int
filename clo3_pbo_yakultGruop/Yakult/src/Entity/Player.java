package Entity;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Player extends JPanel {
    
    private ImageIcon player_icon;
    private JLabel player;
    private int pos_x;
    private int pos_y;
    
    public Player() {
        player_icon = new ImageIcon(getClass().getResource("assets//player.png"));
        player = new JLabel(player_icon);
        player.setVisible(true);
        this.add(player);
        this.setSize(37,37);
    }
    
    public void moveLeft() {
        this.setLocation(this.getX()-37, this.getY()+0);
        pos_x--;
    }
    
    public void moveRight() {
        this.setLocation(this.getX()+37, this.getY()+0);
        pos_x++;
    }
    
    public void moveUp() {
        this.setLocation(this.getX()+0, this.getY()-37);
        pos_y--;
    }
    
    public void moveDown() {
        this.setLocation(this.getX()+0, this.getY()+37);
        pos_y++;
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
