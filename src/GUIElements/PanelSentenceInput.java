package GUIElements;

import Constants.ConstantsColors;
import Constants.ConstantsGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PanelSentenceInput extends BasePanel{
    //950x600
    JButton buttonNLtoENGenerate;

    public PanelSentenceInput(){
        this.setBackground(ConstantsColors.COLOR_LIGHT_REDDISH);
        int groupHorizontalOffset = 375;

        JLabel labelBigAddNewWord = new JLabel("WIP -- Add a new sentence to the database");
        labelBigAddNewWord.setBounds(250, 25, 400, 50);
        labelBigAddNewWord.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(labelBigAddNewWord);
        labelBigAddNewWord.setVisible(true);

        JLabel labelNLwordTop = new JLabel("Specific word:");
        labelNLwordTop.setBounds(25, 100, 300, 25);
        labelNLwordTop.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelNLwordTop);
        labelNLwordTop.setVisible(true);

        JTextField textBoxNLWordTop = new JTextField();
        textBoxNLWordTop.setBounds(25, 125, 300, 25);
        textBoxNLWordTop.setFont(ConstantsGUI.REGULAR_FONT);
        this.add(textBoxNLWordTop);
        textBoxNLWordTop.setVisible(true);

        JLabel labelNLlanguageTop = new JLabel("Entire sentence in Dutch:");
        labelNLlanguageTop.setBounds(25, 175, 300, 25);
        labelNLlanguageTop.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelNLlanguageTop);
        labelNLlanguageTop.setVisible(true);

        JTextField textBoxNLTop = new JTextField();
        textBoxNLTop.setBounds(25, 200, 350, 25);
        textBoxNLTop.setFont(ConstantsGUI.REGULAR_FONT);
        this.add(textBoxNLTop);
        textBoxNLTop.setVisible(true);

        JLabel labelENlanguageTop = new JLabel("Entire sentence in English:");
        labelENlanguageTop.setBounds(25 + groupHorizontalOffset, 175, 300, 25);
        labelENlanguageTop.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelENlanguageTop);
        labelENlanguageTop.setVisible(true);

        JTextField textBoxENTop = new JTextField();
        textBoxENTop.setBounds(25 + groupHorizontalOffset, 200, 350, 25);
        textBoxENTop.setFont(ConstantsGUI.REGULAR_FONT);
        this.add(textBoxENTop);
        textBoxENTop.setVisible(true);

        buttonNLtoENGenerate = new JButton("Add to your sentences");
        buttonNLtoENGenerate.setBounds(25, 250, 225, 25);
        buttonNLtoENGenerate.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(buttonNLtoENGenerate);
        buttonNLtoENGenerate.addActionListener(this);
        buttonNLtoENGenerate.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //add word to database
    }
}
