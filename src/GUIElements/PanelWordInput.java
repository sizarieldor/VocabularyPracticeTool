package GUIElements;

import Constants.ConstantsColors;
import Constants.ConstantsGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static com.company.Main.databaseWriter;
import static com.company.Main.wordsDatabaseFile;

public class PanelWordInput extends BasePanel {
    //950x600

    JButton buttonRecordWord;
    JTextField textBoxNL;
    JTextField textBoxEN;
    JLabel dummyLabel;

    public PanelWordInput() {
        this.setBackground(ConstantsColors.COLOR_LIGHT_REDDISH);
        //TODO add dialog box for confirmation
        int groupHorizontalOffset = 375;

        JLabel labelBigAddNewWord = new JLabel("Add a new word to the database");
        labelBigAddNewWord.setBounds(250, 25, 400, 50);
        labelBigAddNewWord.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(labelBigAddNewWord);
        labelBigAddNewWord.setVisible(true);

        JLabel labelNLlanguageTop = new JLabel("Nederlands:");
        labelNLlanguageTop.setBounds(25, 100, 300, 25);
        labelNLlanguageTop.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelNLlanguageTop);
        labelNLlanguageTop.setVisible(true);

        textBoxNL = new JTextField();
        textBoxNL.setBounds(25, 125, wordTextFieldWidth, 25);
        textBoxNL.setFont(ConstantsGUI.REGULAR_FONT);
        this.add(textBoxNL);
        textBoxNL.setVisible(true);

        JLabel labelENlanguageTop = new JLabel("English:");
        labelENlanguageTop.setBounds(25 + groupHorizontalOffset, 100, 300, 25);
        labelENlanguageTop.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelENlanguageTop);
        labelENlanguageTop.setVisible(true);

        textBoxEN = new JTextField();
        textBoxEN.setBounds(25 + groupHorizontalOffset, 125, wordTextFieldWidth, 25);
        textBoxEN.setFont(ConstantsGUI.REGULAR_FONT);
        this.add(textBoxEN);
        textBoxEN.setVisible(true);

        buttonRecordWord = new JButton("Add to your words");
        buttonRecordWord.setBounds(25, 175, 225, 25);
        buttonRecordWord.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(buttonRecordWord);
        buttonRecordWord.addActionListener(this);
        buttonRecordWord.setVisible(true);

        dummyLabel = new JLabel("dummytext");
        dummyLabel.setBounds(25,300,300,40);
        this.add(dummyLabel);
        dummyLabel.setVisible(true);

//        JButton buttonNLtoENCheck = new JButton("Check");
//        buttonNLtoENCheck.setBounds(75 + groupHorizontalOffset, 175, 200, 25);
//        buttonNLtoENCheck.setFont(ConstGUI.BUTTON_FONT);
//        this.add(buttonNLtoENCheck);
//        buttonNLtoENCheck.setVisible(true);

        //TODO add dialog box for confirmation
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== buttonRecordWord){
            //add word to dictionary
//            String wordInDutch = textBoxNL.getText().trim().toLowerCase();
//            String wordInEnglish = textBoxEN.getText().trim().toLowerCase();
//            databaseWriter.writeWordIntoDatabase(wordsDatabaseFile,wordInDutch,wordInEnglish);
            dummyLabel.setText(textBoxNL.getText().trim().toLowerCase() + " " + textBoxEN.getText().trim().toLowerCase());
        }
    }
}
