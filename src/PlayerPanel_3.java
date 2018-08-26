// Class for third quiz for create players

import javax.swing.*;
import java.awt.*;

public class PlayerPanel_3 extends JPanel {
    private JTextField scoreField, nameFiled;

    public PlayerPanel_3() {
        initComponent();
        initFrame();
    }

    private void initComponent() {
        nameFiled = new JTextField(10);
        nameFiled.setFont(new Font("Times New Roman", Font.BOLD, 22));
        nameFiled.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);

        scoreField = new JTextField("0", 10);
        scoreField.setFont(new Font("Times New Roman", Font.BOLD, 22));
        scoreField.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
        scoreField.setEditable(false);

        add(nameFiled);
        add(scoreField);
    }

    private void initFrame() {
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(200, 100));
    }
}
