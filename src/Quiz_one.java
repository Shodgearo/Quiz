// Описание первой викторины

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Quiz_one extends JFrame {
    final int WIDTH_WINDOW = 1000;
    final int HEIGHT_WINDOW = 800;

    private JPanel panel, tabResult;
    private LinkedList<PlayerPanel> list;
    private JTextField field_q;
    private JButton button;

    public Quiz_one() {
        list = new LinkedList<PlayerPanel>();
        initPanel();
        initButton();
        initField();
        initPanelResult();
        initWindow();
    }

    private void initPanelResult() {
        tabResult = new JPanel();
        tabResult.setBounds(70, 20, 870, 550);
        tabResult.setBackground(new Color(182, 201, 193));
        tabResult.setLayout(new FlowLayout());
        panel.add(tabResult);
    }

    private void initButton() {
        button = new JButton("+");
        button.setBounds(10, 300, 50, 50);
        button.addActionListener(new AddNewPlayer());
        panel.add(button);
    }

    private void initField() {
        field_q = new JTextField();
        field_q.setFont(new Font("Times New Roman", Font.PLAIN, 34));
        field_q.setBounds(100, 600, 800, 100);
        panel.add(field_q);
    }

    private void initPanel() {
        panel = new JPanel();

        panel.setLayout(null);
        add(panel);
    }

    private void initWindow() {
        setTitle("Quiz one");
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
            list.add(new PlayerPanel());

            tabResult.add(list.getLast());
            pack();
        }
    }
}
