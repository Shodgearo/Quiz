// class for panel of player

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {
    JButton buttons[];

    public PlayerPanel() {
        initButtons();
        initFrame();
    }

    private void initButtons() {
        buttons = new JButton[11];

        // Create buttons
        for (int j = 0; j < buttons.length; j++) {
            buttons[j] = new JButton("--");
        }

        // Adding buttons
        for (int j = 0; j < buttons.length; j++) {
            add(buttons[j]);
        }
    }

    private void initFrame() {
        setLayout(new GridLayout(11, 0));
        setPreferredSize(new Dimension(120, 550));
    }
}
