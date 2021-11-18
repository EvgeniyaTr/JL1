package Lection7.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class PlayerControlArea extends JPanel {

    private JButton btnUp;
    private JButton btnLeft;
    private JButton btnDown;
    private JButton btnRight;
    private JPanel emptySpace;
    private JPanel emptySpace1;

    public PlayerControlArea() {

        setLayout(new GridLayout(2,3));
        btnUp = new JButton("▲");
        btnLeft = new JButton("◀");
        btnDown = new JButton("▼");
        btnRight = new JButton("►");
        emptySpace = new JPanel();
        emptySpace1 = new JPanel();

        add(emptySpace);
        add(btnUp);
        add(emptySpace1);
        add(btnLeft);
        add(btnDown);
        add(btnRight);

    }
}
