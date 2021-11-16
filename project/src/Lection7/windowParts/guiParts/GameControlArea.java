package Lection7.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class GameControlArea extends JPanel {

    private JLabel areaName;
    private JButton btnStartGame;
    private JButton btnEndGame;

    public GameControlArea() {
        setLayout(new GridLayout(3, 1));
        areaName = new JLabel("== Game Control ==", SwingConstants.CENTER);
        btnStartGame = new JButton("<html><b>Launch Game</b></html>");
        btnEndGame = new JButton("<html><b>Exit Game</b></html>");

        add(areaName);
        add(btnStartGame);
        add(btnEndGame);

    }
}
