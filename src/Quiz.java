// main class for main frame quiz

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame {
    public static void main(String[] args) {
        new Quiz();
    }

    final int WIDTH_WINDOW = 600;
    final int HEIGHT_WINDOW = 200;
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

        quiz1.setBounds(50, (HEIGHT_WINDOW / 2) - HIEGHT / 2, WHIDTH, HIEGHT);
        quiz2.setBounds(50 + WHIDTH + 10, (HEIGHT_WINDOW / 2) - HIEGHT / 2, WHIDTH, HIEGHT);
        quiz3.setBounds(50 + WHIDTH + 10 + 10 + WHIDTH, (HEIGHT_WINDOW / 2) - HIEGHT / 2, WHIDTH, HIEGHT);

        quiz1.addActionListener(new ButtonListener(quiz1.getText()));
        quiz2.addActionListener(new ButtonListener(quiz2.getText()));
        quiz3.addActionListener(new ButtonListener(quiz3.getText()));

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
        setPreferredSize(new Dimension(WIDTH_WINDOW, HEIGHT_WINDOW + 25));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        private String string;

        public ButtonListener(String string) {
            this.string = string;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(string.equals("Викторина первая")){ // Если нажали на первую кнопку то создаём окно с первой викториной
                new Quiz_one();
            } else if(string.equals("Викторина вторая")) {
                new Quiz_two();
            } else {

            }
        }
    }
}
