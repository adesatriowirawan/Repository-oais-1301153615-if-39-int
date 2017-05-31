package Entity;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Board extends JFrame {
    
   private int boardStart = 200;
    
   private static int rows = 16;
   private static int columns = 16;
   private static int x = 16;
   private static int y = 16;
   private String playerName;
   private int playerScore = 0;
   private int rng;
   private int map[][] = new int[x][y];
   
   public Board() {
       
       playerName = JOptionPane.showInputDialog("Input your name : ");
       
       //Board
       this.setLayout(null);
       this.setTitle("Yakult Hunter 1.0");
       this.setSize(850,680);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       
       //Score Label
       JLabel scoreLabel = new JLabel("Score :  "+String.valueOf(this.playerScore));
       this.add(scoreLabel);
       scoreLabel.setSize(100,100);
       scoreLabel.setLocation(10,40);
       
       //Player Label
       JLabel playerNameLabel = new JLabel("Player :   "+this.playerName);
       this.add(playerNameLabel);
       playerNameLabel.setSize(100,100);
       playerNameLabel.setLocation(10,10);
       
       //Player Object
       Player p = new Player();
       this.add(p);
       rng = (int)(Math.random()*15);
       p.setPos_x(rng);
       p.setPos_y(0);
       p.setLocation(p.getPos_x()*37+boardStart, p.getPos_y()*37);
       
       this.addKeyListener(new KeyListener() {
           
           public void keyPressed(KeyEvent e) {
               int key = e.getKeyCode();
               
               if(key == KeyEvent.VK_W && p.getPos_y() != 0 ){
                    p.moveUp();
               }
               
               if(key == KeyEvent.VK_A && p.getPos_x() != 0){
                    p.moveLeft();
               }
               
               if(key == KeyEvent.VK_S && p.getPos_y() != 15){
                    p.moveDown();
               }
               
               if(key == KeyEvent.VK_D && p.getPos_x() != 15){
                    p.moveRight();
               }
           }
           
           public void keyReleased(KeyEvent arg0) {
               //no implementation
           }
           
           public void keyTyped(KeyEvent arg0) {
               //no implementation
           }
       });
       
       //Dog Object 1
       Dog d1 = new Dog();
       this.add(d1);
       rng = (int)(Math.random()*15);
       d1.setPos_x(rng);
       rng = (int)(Math.random()*15);
       d1.setPos_y(rng);
       d1.setLocation(d1.getPos_x()*37+boardStart, d1.getPos_y()*37);
       
       //Dog Object 2
       Dog d2 = new Dog();
       this.add(d2);
       rng = (int)(Math.random()*15);
       d2.setPos_x(rng);
       rng = (int)(Math.random()*15);
       d2.setPos_y(rng);
       d2.setLocation(d2.getPos_x()*37+boardStart, d2.getPos_y()*37);
       
       //Hole Object 1
       Hole h1 = new Hole();
       this.add(h1);
       rng = (int)(Math.random()*15);
       h1.setPos_x(rng);
       rng = (int)(Math.random()*15);
       h1.setPos_y(rng);
       h1.setLocation(h1.getPos_x()*37+boardStart, h1.getPos_y()*37);
       
       //Hole Object 2
       Hole h2 = new Hole();
       this.add(h2);
       rng = (int)(Math.random()*15);
       h2.setPos_x(rng);
       rng = (int)(Math.random()*15);
       h2.setPos_y(rng);
       h2.setLocation(h2.getPos_x()*37+boardStart, h2.getPos_y()*37);
       
       //Hole Object 3
       Hole h3 = new Hole();
       this.add(h3);
       rng = (int)(Math.random()*15);
       h3.setPos_x(rng);
       rng = (int)(Math.random()*15);
       h3.setPos_y(rng);
       h3.setLocation(h3.getPos_x()*37+boardStart, h3.getPos_y()*37);
       
       //Rock Object 1
       Rock r1 = new Rock();
       this.add(r1);
       rng = (int)(Math.random()*15);
       r1.setPos_x(rng);
       rng = (int)(Math.random()*15);
       r1.setPos_y(rng);
       r1.setLocation(r1.getPos_x()*37+boardStart, r1.getPos_y()*37);
       
       //Rock Object 2
       Rock r2 = new Rock();
       this.add(r2);
       rng = (int)(Math.random()*15);
       r2.setPos_x(rng);
       rng = (int)(Math.random()*15);
       r2.setPos_y(rng);
       r2.setLocation(r2.getPos_x()*37+boardStart, r2.getPos_y()*37);
       
       //Rock Object 3
       Rock r3 = new Rock();
       this.add(r3);
       rng = (int)(Math.random()*15);
       r3.setPos_x(rng);
       rng = (int)(Math.random()*15);
       r3.setPos_y(rng);
       r3.setLocation(r3.getPos_x()*37+boardStart, r3.getPos_y()*37);
       
       //Rock Object 4
       Rock r4 = new Rock();
       this.add(r4);
       rng = (int)(Math.random()*15);
       r4.setPos_x(rng);
       rng = (int)(Math.random()*15);
       r4.setPos_y(rng);
       r4.setLocation(r4.getPos_x()*37+boardStart, r4.getPos_y()*37);
       
       //Rock Object 5
       Rock r5 = new Rock();
       this.add(r5);
       rng = (int)(Math.random()*15);
       r5.setPos_x(rng);
       rng = (int)(Math.random()*15);
       r5.setPos_y(rng);
       r5.setLocation(r5.getPos_x()*37+boardStart, r5.getPos_y()*37);
              
       //Yakult Object 1
       Yakult y1 = new Yakult();
       this.add(y1);
       rng = (int)(Math.random()*15);
       y1.setPos_x(rng);
       rng = (int) (Math.random()*15);
       y1.setPos_y(rng);
       y1.setLocation(y1.getPos_x()*37+boardStart, y1.getPos_y()*37);
       
       //Yakult Object 2
       Yakult y2 = new Yakult();
       this.add(y2);
       rng = (int)(Math.random()*15);
       y2.setPos_x(rng);
       rng = (int) (Math.random()*15);
       y2.setPos_y(rng);
       y2.setLocation(y2.getPos_x()*37+boardStart, y2.getPos_y()*37);
       
       //Yakult Object 3
       Yakult y3 = new Yakult();
       this.add(y3);
       rng = (int)(Math.random()*15);
       y3.setPos_x(rng);
       rng = (int) (Math.random()*15);
       y3.setPos_y(rng);
       y3.setLocation(y3.getPos_x()*37+boardStart, y3.getPos_y()*37);
       
       //Yakult Object 4
       Yakult y4 = new Yakult();
       this.add(y4);
       rng = (int)(Math.random()*15);
       y4.setPos_x(rng);
       rng = (int) (Math.random()*15);
       y4.setPos_y(rng);
       y4.setLocation(y4.getPos_x()*37+boardStart, y4.getPos_y()*37);
       
       //Yakult Object 5
       Yakult y5 = new Yakult();
       this.add(y5);
       rng = (int)(Math.random()*15);
       y5.setPos_x(rng);
       rng = (int) (Math.random()*15);
       y5.setPos_y(rng);
       y5.setLocation(y5.getPos_x()*37+boardStart, y5.getPos_y()*37);
       
       //Background
       ImageIcon image_icon = new ImageIcon(getClass().getResource("assets//board.png"));
       JLabel image_label = new JLabel(image_icon);
       this.add(image_label);
       image_label.setSize(592,592);
       image_label.setLocation(boardStart,0);
       
       this.setVisible(true);
       
   }
   
   public int getBoardStart() {
       return boardStart;
   }

   public int getPlayerScore() {
       return playerScore;
   }

   public void setPlayerScore(int playerScore) {
       this.playerScore = playerScore;
   }
   
}
