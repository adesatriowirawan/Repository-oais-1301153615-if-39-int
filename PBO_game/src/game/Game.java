package game;

import javax.swing.*;

public class Game extends JFrame {
    
    ImageIcon bg_ii;
    ImageIcon player_ii;
    JLabel bg_l;
    JLabel player_l;
    JPanel board;
    
    public Game() {
        board = new JPanel();
        bg_ii = new ImageIcon(getClass().getResource("assets//board.png"));
        bg_l = new JLabel(bg_ii);
        
        add(board);
        board.add(bg_l);
        
        player_ii = new ImageIcon(getClass().getResource("assets//farmer.png"));
        player_l = new JLabel(player_ii);
        bg_l.add(player_l);
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        game.setSize(800,1000);
        game.setLocationRelativeTo(null);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
    }
    
}
