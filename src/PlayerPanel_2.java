// Panels for quiz 2

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerPanel_2 extends JPanel {
    JTextField score;
    JTextField name_player;
    JComboBox variantScore[];

    private String[] variants = {" ", "+3", "-1"};

    public PlayerPanel_2() {
        initComponent();
        initFrame();
    }

    private void initComponent() {
        score = new JTextField("0");
        add(score);
        variantScore = new JComboBox[14];

        // Initialize JComboBoxes
        for (int i = 0; i < variantScore.length; i++) {
            variantScore[i] = new JComboBox<String>(variants);
            variantScore[i].addActionListener(new ListenerForAddScore(variantScore[i]));
        }

        // Add JComboBoxes
        for (int i = 0; i < variantScore.length; i++) {
            add(variantScore[i]);
        }

        // Add name player filed
        name_player = new JTextField();
        name_player.setFont(new Font("Times New Roman", Font.BOLD, 20));
        name_player.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        add(name_player);
    }

    private void initFrame() {
        setLayout(new GridLayout(16, 0));
        setPreferredSize(new Dimension(120, 550));
    }

    private class ListenerForAddScore implements ActionListener {
        JComboBox cb;

        public ListenerForAddScore(JComboBox cb) {
            this.cb = cb;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = Integer.parseInt(score.getText());
            int i = Integer.parseInt((String)cb.getSelectedItem());

            sum += i;
            score.setText(String.valueOf(sum));
        }
    }
}