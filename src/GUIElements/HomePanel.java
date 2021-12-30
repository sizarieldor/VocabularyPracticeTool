package GUIElements;

import Constants.ConstColors;
import Constants.ConstGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static com.company.Main.wordInputPanel;

public class HomePanel extends JPanel implements ActionListener {
    JButton buttonWordInput;
    JButton buttonWordPractice;
    JButton buttonSentenceInput;
    JButton buttonSentencePractice;
    ArrayList<JButton> buttonList;

    public HomePanel(){
        this.setSize(800, 600);
        this.setVisible(true);
        this.setBackground(ConstColors.COLOR_LIGHT_BLUEISH);
        this.setLayout(null);
        this.setFont(ConstGUI.REGULAR_FONT);
        buttonList = new ArrayList<>();
        buttonList.add(buttonWordInput);
        buttonList.add(buttonWordPractice);
        buttonList.add(buttonSentenceInput);
        buttonList.add(buttonSentencePractice); //TODO fix adding these to the list to help initialize


        buttonWordInput = new JButton("Input new words");
        buttonWordInput.setBounds(50,100,200,50);
        buttonWordInput.setBackground(ConstColors.COLOR_LIGHT_GREENISH);
        buttonWordInput.addActionListener(this);

        buttonWordPractice = new JButton("Practice words");
        buttonWordPractice.setBounds(50, 200, 200, 50);
        buttonWordPractice.setBackground(ConstColors.COLOR_LIGHT_GREENISH);
        buttonWordPractice.addActionListener(this);

        buttonSentenceInput = new JButton("Input new sentences");
        buttonSentenceInput.setBounds(50,300,200, 50);
        buttonSentenceInput.setBackground(ConstColors.COLOR_LIGHT_GREENISH);
        buttonSentenceInput.addActionListener(this);

        buttonSentencePractice = new JButton("Practice sentences");
        buttonSentencePractice.setBounds(50,400,200, 50);
        buttonSentencePractice.setBackground(ConstColors.COLOR_LIGHT_GREENISH);
        buttonSentencePractice.addActionListener(this);

        this.add(buttonWordInput);
        this.add(buttonWordPractice);
        this.add(buttonSentenceInput);
        this.add(buttonSentencePractice);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonWordInput){
            this.setVisible(false);
            wordInputPanel.setVisible(true);
        }
    }
}
