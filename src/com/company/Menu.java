package com.company;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {

    JButton GamesButton, OptionsButton, InstructionButton, Credits;
    public Menu() {
        super();
        setBackground(Color.DARK_GRAY);
        GamesButton = new JButton("Game Menu");
        OptionsButton = new JButton("Options");
        InstructionButton = new JButton("Instructions");
        Credits = new JButton("Credits");
        BoxLayout layout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
        this.setLayout(layout);
        GamesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        OptionsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        InstructionButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        Credits.setAlignmentX(Component.CENTER_ALIGNMENT);
        GamesButton.setBackground(Color.LIGHT_GRAY);
        GamesButton.setForeground(Color.LIGHT_GRAY);

        add(GamesButton);
        add(OptionsButton);
        add(InstructionButton);
        add(Credits);


    }
}
