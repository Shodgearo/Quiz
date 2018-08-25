// Описание первой викторины

import javax.swing.*;
import java.awt.*;

public class Quiz_one extends JFrame {
    final int WHIDTH_WINDOW = 1000;
    final int HIEGHT_WINDOW = 800;

    private JPanel panel;
    private JTextField field_q;

    public Quiz_one() {
        initField();
        initPanel();
        initWindow();
    }

    private void initField() {
        field_q = new JTextField();
        field_q.setFont(new Font("Times New Roman", Font.PLAIN, 34));
        field_q.setBounds(100, 600, 800, 100);
    }

    private void initPanel() {
        panel = new JPanel();

        panel.setLayout(null);
        panel.add(field_q);
        add(panel);
    }

    private void initWindow() {
        setTitle("Quiz one");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WHIDTH_WINDOW, HIEGHT_WINDOW));
        setResizable(true);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
