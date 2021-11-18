package Lection7;


import Lection7.windowParts.GameMap;
import Lection7.windowParts.GuiPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    //приватные переменные - свойства окна при запуске
    private int windowWidth = 1024;
    private int windowHeight = 768;
    private int windowPosX = 300;
    private int windowPosY = 100;
    private String windowTitle = "HomeWork7";

    private GameMap gameMap;
    private GuiPanel guiPanel;


    MainWindow() {
        setupWindow();

        guiPanel = new GuiPanel();
        gameMap = new GameMap();

        add(gameMap);
        add(guiPanel, BorderLayout.EAST);


        setVisible(true);

    }

    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(windowWidth, windowHeight);
        setResizable(false);
        setLocation(windowPosX, windowPosY);
        setTitle(windowTitle);
    }

}
