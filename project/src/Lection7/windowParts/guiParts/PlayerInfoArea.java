package Lection7.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {
    private JLabel areaName;
    private JLabel playerName;
    private JLabel playerHealth;

    public PlayerInfoArea() {

        setLayout(new GridLayout(3, 1));
        areaName = new JLabel("== Player Info ==", SwingConstants.CENTER);
        playerName = new JLabel("Player: ");
        playerHealth = new JLabel("Current HP: ");




        add(areaName);
        add(playerName);
        add(playerHealth);
    }

}
