package Lection7.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {

    private JLabel areaName;
    private JLabel level;
    private JLabel mapSize;
    private JLabel countEnemies;

    public GameInfoArea () {
        setLayout(new GridLayout(4,1));
        areaName = new JLabel("== Game Info ==", SwingConstants.CENTER);
        level = new JLabel("Level # ");
        mapSize = new JLabel("Map size: ");
        countEnemies = new JLabel("Enemies: ");

        add(areaName);
        add(level);
        add(mapSize);
        add(countEnemies);

    }

}
