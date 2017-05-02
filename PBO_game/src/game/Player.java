package game;

import javax.swing.*;

public class Player extends JLabel {
    
    private String name;
    private int life;
    private int score;
    private int x, y, dx, dy;
    private boolean dead;
    public ImageIcon image;
    
    public Player(String plyName) {
        this.name = plyName;
        this.life = 3;
        this.dead = false;
        this.image = new ImageIcon(getClass().getResource("assets//farmer.png"));
        
    }
    
    public void place() {
        
    }
    
}
