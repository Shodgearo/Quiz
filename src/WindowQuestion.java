// For out question

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class WindowQuestion extends JFrame {
    private Integer[] names = {1, 2, 3};
    private String question;
    private JPanel panel;
    private JTextArea area;
    private JLabel label;
    private JButton right, right_on_2, falseing;
    private JComboBox<Integer> players;
    private LinkedList list;

    public WindowQuestion(String question, String label) {
        this.question = question;

        initComponent(question, label);
        initFrame();
    }

    private void initComponent(String question, String label) {
        this.label = new JLabel(label);
        this.label.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        this.label.setBounds(350, 10, 150, 50);

        list = Quiz_three.getList();
        players = new JComboBox<Integer>(names);
        players.setBounds(380, 10, 100, 50);

        right = new JButton("Верно");
        right.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        right.setBounds(20, 10, 100, 50);
        right.addActionListener(new ListenerRight());

        right_on_2 = new JButton("Верно на 50%");
        right_on_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        right_on_2.setBounds(130, 10, 200, 50);

        falseing = new JButton("Не верно");
        falseing.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        falseing.setBounds(520, 10, 150, 50);

        area = new JTextArea();
        area.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        area.setBounds(10, 70, 665, 180);
        area.setText(question);
        area.setLineWrap(true);

        panel = new JPanel();
        panel.setLayout(null);
        panel.add(right);
        panel.add(right_on_2);
        panel.add(this.label);
//        panel.add(players);
        panel.add(falseing);
        panel.add(area);
        add(panel);
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(700, 300));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class ListenerRight implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
}
