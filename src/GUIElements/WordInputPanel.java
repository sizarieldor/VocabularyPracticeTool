package GUIElements;

import Constants.ConstColors;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.Main.homePanel;

public class WordInputPanel extends JPanel implements ActionListener {
    JButton buttonWordInput;
    JButton buttonWordPractice;
    JButton buttonSentenceInput;
    JButton buttonSentencePractice;

    public WordInputPanel() {
        this.setSize(800, 600);
        this.setVisible(false); //DEFAULT VISIBILITY
        this.setBackground(ConstColors.COLOR_LIGHT_REDDISH);
        this.setLayout(null);

        buttonWordPractice = new JButton("Practice words");
        buttonWordPractice.setBounds(50, 200, 200, 50);
        buttonWordPractice.setBackground(ConstColors.COLOR_LIGHT_GREENISH);
        buttonWordPractice.addActionListener(this);

        this.add(buttonWordPractice);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonWordPractice) {
            this.setVisible(false);
            homePanel.setVisible(true);
        }
    }
}
