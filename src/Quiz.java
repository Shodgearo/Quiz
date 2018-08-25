// main class for main frame quiz

import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    public static void main(String[] args) {
        new Quiz();
    }

    final int WHIDTH_WINDOW = 600;
    final int HIEGHT_WINDOW = 200;
    JPanel mainPane;
    JButton quiz1, quiz2, quiz3; //Кнопки, при нажатии на которые нас перенесёт на соответствующий этап.

    Quiz() {
        initPanel();
        initButton();
        toolsWindow();
    }

    private void initButton() {
        final int WHIDTH = 150;
        final int HIEGHT = 60;

        quiz1 = new JButton("Викторина первая");
        quiz2 = new JButton("Викторина вторая");
        quiz3 = new JButton("Викторина третья");

        quiz1.setBounds(50, (HIEGHT_WINDOW / 2) - HIEGHT / 2, WHIDTH, HIEGHT);
        quiz2.setBounds(50 + WHIDTH + 10, (HIEGHT_WINDOW / 2) - HIEGHT / 2, WHIDTH, HIEGHT);
        quiz3.setBounds(50 + WHIDTH + 10 + 10 + WHIDTH, (HIEGHT_WINDOW / 2) - HIEGHT / 2, WHIDTH, HIEGHT);

        mainPane.add(quiz1);
        mainPane.add(quiz2);
        mainPane.add(quiz3);
    }

    private void initPanel() {
        mainPane = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(loadImage(), 0, 0, this);
            }
        };

        add(mainPane);
        mainPane.setLayout(null);
    }

    private Image loadImage() {
        return new ImageIcon("assets\\bg.png").getImage();
    }

    private void toolsWindow() {
        setTitle("Quiz");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WHIDTH_WINDOW, HIEGHT_WINDOW + 25));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
