// For IT theme

import javax.swing.*;
import java.awt.*;

public class Panel_IT extends JPanel {
    private JButton[][] cards;

    public Panel_IT() {
        initComponents();
        initPanel();
    }

    private void initComponents() {
        String s;

        cards = new JButton[3][5];

        //Init
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 3) s = String.valueOf((1 + j) * 100);
                else if (j == 3) s = "500";
                else s = "1000";

                cards[i][j] = new JButton(s);
            }
        }

        //Add
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                add(cards[i][j]);
            }
        }
    }

    private void initPanel() {
        setLayout(new GridLayout(3, 1, 5, 5));
        setPreferredSize(new Dimension(850, 160));
    }
}