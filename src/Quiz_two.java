// For second quiz

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Quiz_two extends JFrame {
    final int WIDTH_WINDOW = 1000;
    final int HEIGHT_WINDOW = 800;

    private JPanel panel, tabResult;
    private LinkedList<PlayerPanel_2> list;
    private JTextField field_q;
    private JButton button;

    public Quiz_two() {
        list = new LinkedList<PlayerPanel_2>();
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
            list.add(new PlayerPanel_2());

            tabResult.add(list.getLast());
            pack();
        }
    }
}
