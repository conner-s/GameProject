package com.company;

import javax.swing.*;
import java.awt.*;

public class Game1 extends JPanel {

    JButton Back;
    Character player;
    public Game1(Character player){
        super();
        this.player = player;
        setBackground(Color.DARK_GRAY);
        Back = new JButton("Back");

        add(Back);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.drawString("Game1", 500, 300);
        g.drawRect(player.x, player.y, 10, 10);

    }

    public void setCharacter(int charNum){

    }

}
