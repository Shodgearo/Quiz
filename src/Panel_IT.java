// For IT theme

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_IT extends JPanel {
    private JButton[][] cards;
    private String info = "ИТ и Интернет";
    private String arrayAnimeQuestion[][] = {{"Как называется программа для обозревания сети интернет?",
                                              "Как называется веб-страница или группа веб-страниц, объединённых единой темой или автором, или фирмой?",
                                              "Как называеся технология в телефоне или планшете, позволяющая манипулировать устройством с помощью прикосновений?",
                                              "Что произойдет, если, в ОС Windows, нажать на комбинацию клавишь Win + R?",
                                              "Веб-браузер Тор. Почему, если у этого браузера изменить рамеры окна, то при повторном запуске это значение никогда не сохранится?"},
                                             {"Какая комбинация клавиш копирует выделенный объект или текст?",
                                              "Как называется серия ОС получивших самое широкое распростронение среди пользователей ПК?",
                                              "Как называется количество операций, которое может выполнить процессор за секунду?",
                                              "Как называется технология, увеличившая корость передачи даных по сети и использующая стекло или пластик в качесте основного материала?",
                                              "Как называется язык программирования, на котором написано приложеие Quiz?"},
                                             {"Оптический манипулятор, без которого работа на компьютере сильно затруднительна.\n",
                                              "Как имя создателя популярнейшей социальной сети в мире Facebook.",
                                              "Маршрутизатор в сети дающий точку доступа для беспроводных и проводных устройств для доступа в интернет внутри сети.",
                                              "Как называется ОС на ядре Linux, получившая наибольшее распространение среди пользователей ПК?",
                                              "Протокол сетевого уровня, объединивший отдельные компьютерные сети в всемрную сеть интернет."}};

    public Panel_IT() {
        initComponents();
        initPanel();
    }

    private void initComponents() {
        String s;

        cards = new JButton[3][5];

        //Init
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 3) s = String.valueOf((1 + j) * 100);
                else if (j == 3) s = "500";
                else s = "1000";

                cards[i][j] = new JButton(s);
                cards[i][j].addActionListener(new ListenerForOutQuestion(i, j));
            }
        }

        //Add
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                add(cards[i][j]);
            }
        }
    }

    private void initPanel() {
        setLayout(new GridLayout(3, 1, 5, 5));
        setPreferredSize(new Dimension(850, 160));
    }

    private class ListenerForOutQuestion implements ActionListener {
        int i, j;

        public ListenerForOutQuestion(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            new WindowQuestion(arrayAnimeQuestion[i][j], info);

            cards[i][j].setBackground(Color.PINK);
        }
    }
}