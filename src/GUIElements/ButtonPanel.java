/*
package GUIElements;

import Constants.ConstColors;
import Constants.ConstGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static com.company.Main.panelWordPractice; //import all other panels
import static com.company.Main.panelWordInput; //import all other panels
import static com.company.Main.panelSentencePractice; //import all other panels
import static com.company.Main.panelSentenceInput; //import all other panels


public class ButtonPanel extends JPanel implements ActionListener {
    JButton buttonWordInput;
    JButton buttonWordPractice;
    JButton buttonSentenceInput;
    JButton buttonSentencePractice;
    ArrayList<JButton> buttonList;

    public ButtonPanel() {
        this.setBounds(0,0,950,100);
        this.setVisible(true);
        this.setBackground(ConstColors.COLOR_LIGHT_GRAY);
        this.setLayout(null);
        this.setFont(ConstGUI.BUTTON_FONT);

        int startXCoordinate = 25;
        int startYCoordinate = 25;
        int defaultButtonWidth = 200;
        int defaultButtonHeight = 50;

        buttonWordPractice = new JButton("Practice words");
        buttonWordPractice.setBounds(startXCoordinate, startYCoordinate, defaultButtonWidth, defaultButtonHeight);

        buttonWordInput = new JButton("Input new words");
        buttonWordInput.setBounds(startXCoordinate * 2 + defaultButtonWidth, startYCoordinate, defaultButtonWidth, defaultButtonHeight);

        buttonSentencePractice = new JButton("Practice sentences");
        buttonSentencePractice.setBounds(startXCoordinate * 3 + defaultButtonWidth * 2, startYCoordinate, defaultButtonWidth, defaultButtonHeight);

        buttonSentenceInput = new JButton("Input new sentences");
        buttonSentenceInput.setBounds(startXCoordinate * 4 + defaultButtonWidth * 3, startYCoordinate, defaultButtonWidth, defaultButtonHeight);

        buttonList = new ArrayList<>();
        buttonList.add(buttonWordInput);
        buttonList.add(buttonWordPractice);
        buttonList.add(buttonSentenceInput);
        buttonList.add(buttonSentencePractice);

        for (JButton jButton : buttonList) {
            jButton.setBackground(ConstColors.COLOR_LIGHT_GREENISH);
            jButton.addActionListener(this);
            jButton.setFont(ConstGUI.BUTTON_FONT);
            this.add(jButton);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonWordPractice) { //show one, hide the other 3
            panelWordPractice.setVisible(true);
            panelWordInput.setVisible(false);
            panelSentencePractice.setVisible(false);
            panelSentenceInput.setVisible(false);
        } else if (e.getSource()==buttonWordInput) {
            panelWordPractice.setVisible(false);
            panelWordInput.setVisible(true);
            panelSentencePractice.setVisible(false);
            panelSentenceInput.setVisible(false);
        } else if (e.getSource()==buttonSentencePractice){
            panelWordPractice.setVisible(false);
            panelWordInput.setVisible(false);
            panelSentencePractice.setVisible(true);
            panelSentenceInput.setVisible(false);
        } else if (e.getSource()==buttonSentenceInput){
            panelWordPractice.setVisible(false);
            panelWordInput.setVisible(false);
            panelSentencePractice.setVisible(false);
            panelSentenceInput.setVisible(true);
        }
    }
}
*/
