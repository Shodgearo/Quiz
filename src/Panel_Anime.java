// Panel for tab anime theme

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_Anime extends JPanel {
    private JButton[][] cards;
    private String info = "Аниме";
    private String arrayAnimeQuestion[][] = {{"Аниме \"Наруто\". Какоую первую технику изучил главный герой?",
                                              "Чаще всего, по какому произведению создаётся аниме?",
                                              "Аватар. Легенда об Аанге. Как называется вторая часть этого сериала?",
                                              "Как имя легендарного шиноби, сильнейшего из клана Учиха и одним из создателей деревни скрытого листа?",
                                              "Как называется последняя форма глаз, которую может получить ниндзя из клана Учиха или которая передаются каждые шесть поколений и которым обладал лидер Акацки?"},
                                             {"Как называется самое популярное аниме, снятое по одноименной манге, в жанре детектив?",
                                              "Как называется профессия человека озвучивающего аниме?",
                                              "Как называется жанр аниме, расчитанный на целевую аудиторию: юноши, 12-18 лет?",
                                              "Как называется самый популярный журнал, публикующий сёнэн-мангу и описанный в аниме \"Bakuman\"?",
                                              "Назовите автора аниме \"Унесённые призраками.\"\n"},
                                             {"Как называется самое продолжительное аниме в истории?",
                                              "Как называется второй сезон анмие \"Наруто\"?",
                                              "До скольки минут может длиться стандартная серия аниме-сериала?",
                                              "Как читать мангу?",
                                              "Следующая форма Пикачу?"}};

    public Panel_Anime() {
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
