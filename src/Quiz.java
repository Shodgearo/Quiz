// main class for main frame quiz

import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    public static void main(String[] args) {
        new Quiz();
    }

    JPanel mainPane;
    JButton quiz1, quiz2, quiz3; //Кнопки, при нажатии на которые нас перенесёт на соответствующий этап.

    Quiz() {
        initPanel();
        toolsWindow();
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
    }

    private Image loadImage() {
        return new ImageIcon("assets\\bg.png").getImage();
    }

    private void toolsWindow() {
        setTitle("Quiz");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 230));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
