// For sport theme

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_Sport extends JPanel {
    private JButton[][] cards;
    private String info = "Спорт";
    private String arrayAnimeQuestion[][] = {{"Какая страна стала чемпионом мира по футболу в 2018 году?",
                                              "Какой вид спорта подразумевает катание на санях?",
                                              "С 2017 года этот спорт официально был признан в России как вид спорта. О чём идёт речь?",
                                              "В чём отличие скелетона и бобслея?",
                                              "Одна команда в официальном турнирном матче по бейсболу, где принимала гостей, жульничала этим способом, в следствии чего мяч не мог улететь далеко. Команда не трогала не игроков ни спортинвентарь, не нарушала правил поведения и арбитры не могли зафиксировать нарушения. Как им это удалось?"},
                                             {"Как называется нарушение правил в баскетболе?",
                                              "Как имя самого быстрого бегуна на планете на короткие дистанции?",
                                              "Один из самых популярных и титулованых баскетболистов. Наибольшую популярность приобрёл выступая за команду Чикаго Буллс. Пожертвовал свою сезонную зарплату потерпевшим в событии 11-го сентября. Прозвище: \"Его воздушество\". Как его имя?",
                                              "Какой экстримальный вид спорта считается олимпийским с 2017 года, подразумевающий выполнение трюков и прыжков?",
                                              "Самый известный спортсмен мира скейтбординга. Выпущена видеоигра имеющее название как и его имя. Создатель новых трюков."},
                                             {"Есть два вида спорта: индивидуальный и ... ?",
                                              "С 2017 года этот спорт официально был признан в России как вид спорта. О чём идёт речь?",
                                              "Пенальти в хоккее.",
                                              "Как называется футбольный клуб Омска?",
                                              "Один преподаватель физической культуры предложил своим студентам игру. Игра приобрела популярность и стала называться \"баскетбол\". Какое основное правило баскетбола не входило в первоначальный замысел создтеля?"}};

    public Panel_Sport() {
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