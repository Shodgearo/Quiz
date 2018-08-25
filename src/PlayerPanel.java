// class for panel of player

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerPanel extends JPanel {
    JButton buttons[];
    JTextField name_player;
    ImageIcon cross, oval;

    public PlayerPanel() {
        initPics();
        initComponent();
        initFrame();
    }

    private void initPics() { // Грузим крестик и кружок
        cross = new ImageIcon("assets\\Cross.png");
        oval = new ImageIcon("assets\\Oval.png");
    }

    private void initComponent() {
        buttons = new JButton[10];

        // Create buttons
        for (int j = 0; j < buttons.length; j++) {
            buttons[j] = new JButton("--");
        }

        // Tool buttons
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setActionCommand(String.valueOf(i));
            buttons[i].addActionListener(new ListenerButtons());
            if (i > 6) buttons[i].setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
            else buttons[i].setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
        }

        // Adding buttons
        for (int j = 0; j < buttons.length; j++) {
            add(buttons[j]);
        }

        // field for outing name player
        name_player = new JTextField();
        name_player.setFont(new Font("Times New Roman", Font.BOLD, 20));
        name_player.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        add(name_player);
    }

    private void initFrame() {
        setLayout(new GridLayout(11, 0));
        setPreferredSize(new Dimension(120, 550));
    }

    private class ListenerButtons implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int index = Integer.parseInt(e.getActionCommand());

            if (index <= 6)buttons[index].setIcon(oval);
            else buttons[index].setIcon(cross);
        }
    }
}
