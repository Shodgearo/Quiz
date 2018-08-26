// Description third quiz

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Quiz_three extends JFrame {
    final int WIDTH_WINDOW = 1000;
    final int HEIGHT_WINDOW = 800;

    private JPanel panel, tabOut, panel_players;
    private Panel_Anime panel_Anime;
    private Panel_Sport panel_Sport;
    private Panel_IT panel_IT;
    private LinkedList<PlayerPanel_3> list;
    private JButton button;
    private JLabel label_anime, label_sport, label_it;

    public Quiz_three() {
        list = new LinkedList<PlayerPanel_3>();
        initPanels();
        initLabels();
        initButton();
        initPanelResult();
        initWindow();
    }

    private void initLabels() {
        label_anime = new JLabel("Anime");
        label_anime.setBounds(20, 80, 80, 50);

        label_sport = new JLabel("Sport");
        label_sport.setBounds(20, 270, 80, 50);

        label_it = new JLabel("IT and Internet");
        label_it.setBounds(10, 460, 100, 50);

        panel.add(label_anime);
        panel.add(label_sport);
        panel.add(label_it);
    }

    private void initPanelResult() {
        tabOut = new JPanel();
        tabOut.setBounds(100, 20, 870, 550);
        tabOut.setBackground(new Color(182, 201, 193));
        tabOut.setLayout(new GridLayout(3, 1, 20, 20));

        addingTab();

        panel.add(tabOut);
    }

    private void addingTab() {
        panel_Anime = new Panel_Anime();
        panel_Sport = new Panel_Sport();
        panel_IT = new Panel_IT();

        tabOut.add(panel_Anime);
        tabOut.add(panel_Sport);
        tabOut.add(panel_IT);
    }

    private void initButton() {
        button = new JButton("+");
        button.setBounds(10, 635, 50, 50);
        button.addActionListener(new AddNewPlayer());
        panel.add(button);
    }

    private void initPanels() {
        panel = new JPanel();
        panel_players = new JPanel();
        panel_players.setLayout(new FlowLayout());
        panel_players.setBackground(Color.WHITE);
        panel_players.setBounds(100, 600, 800, 130);

        panel.setLayout(null);
        add(panel);
        panel.add(panel_players);
    }

    private void initWindow() {
        setTitle("Quiz two");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(WIDTH_WINDOW, HEIGHT_WINDOW));
        setResizable(true);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class AddNewPlayer implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            list.add(new PlayerPanel_3());

            panel_players.add(list.getLast());
            pack();
        }
    }
}
