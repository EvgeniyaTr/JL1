package Lection7.windowParts;

import Lection7.windowParts.guiParts.GameControlArea;
import Lection7.windowParts.guiParts.GameInfoArea;
import Lection7.windowParts.guiParts.PlayerControlArea;
import Lection7.windowParts.guiParts.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

public class GuiPanel extends JPanel {

    //элементы панели
    private GameInfoArea gameInfoArea;
    private GameControlArea gameControlArea;
    private PlayerControlArea playerControlArea;
    private PlayerInfoArea playerInfoArea;

    //текстовая область для логов + скролл
    private JTextArea gameLog;
    private JScrollPane scrollLog;


    public GuiPanel() {
        prepare();
        createParts();
        prepareLogArea();

        add(gameControlArea);
        add(playerInfoArea);
        add(gameInfoArea);
        add(playerControlArea);
        add(scrollLog);

    }

    public void prepare() {
        setBackground(new Color(43, 107, 94));
        setLayout(new GridLayout(5, 1));
    }


    public void createParts() {
        gameControlArea = new GameControlArea();
        playerInfoArea = new PlayerInfoArea();
        gameInfoArea = new GameInfoArea();
        playerControlArea = new PlayerControlArea();
    }

    public void prepareLogArea() {
        gameLog = new JTextArea("Game Log");
        scrollLog = new JScrollPane(gameLog);
    }
}
