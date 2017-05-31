package State;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Entity.*;

public class Menu {
    
    private int menuW = 600;
    private int menuH = 600;
    private int buttonW = 150;
    private int buttonH = 60;
    private int buttonY = 460;
    
    
    public Menu() {
        
        //Main Menu
        JFrame menu = new JFrame("Yakult Picker 1.0");
        menu.setLayout(null);
        menu.setSize(menuW,menuH);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Logo
        ImageIcon logo_image = new ImageIcon(getClass().getResource("assets//yakulthunter.png"));
        JLabel logo_label = new JLabel(logo_image);
        JPanel logo = new JPanel();
        
        menu.add(logo);
        logo.add(logo_label);
        logo.setSize(412,412);
        logo.setLocation(90,10);
        
        //Start Button
        JButton start = new JButton("Start");
        menu.add(start);
        start.setSize(buttonW,buttonH);
        start.setLocation(10,buttonY);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Board b = new Board();
                menu.setVisible(false);
            }
        });
        
        //Help Button
        JButton help = new JButton("Help");
        menu.add(help);
        help.setSize(buttonW,buttonH);
        help.setLocation(220,buttonY);
        help.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Move with WASD on their respective directions. Collect as much yakult as possible!");
            }
        });
        
        //Exit Button
        JButton exit = new JButton("Exit");
        menu.add(exit);
        exit.setSize(buttonW,buttonH);
        exit.setLocation(430,buttonY);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        menu.setVisible(true);
    }

}
