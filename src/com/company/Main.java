package com.company;

import GUIElements.*;

import javax.swing.*;

public class Main {

    //function to input new words NL and EN -- record NL, EN, date of input, ?topic
    //[java file writing]
    //function to grab existing word in either language and ask user for corresponding definition; also based on date/topic
    //read existing dictionaries/word lists and add them to database
    //input text, split text into sentences, input a word, extract all sentences with word, store in dbase, chosen word is all UPPERCASE, load as exercise
    //[java uppercase-lowercase manipulation]
    //back up the word db and the sentence db periodically
    //[how does java keep track of dates]
    //init file with adjustments for backup frequency - max # of backups, duration of backup period
    //readme html with illustrations
    //gamify the word/sentence answering?
    //OCR support for text?

    public static JFrame mainFrame = new MainFrame();
//    public static JLabel mainLabel = new MainLabel();
    public static JPanel buttonPanel = new ButtonPanel();
    public static JPanel panelWordPractice = new PanelWordPractice();
    public static JPanel panelWordInput = new PanelWordInput();
    public static JPanel panelSentencePractice = new PanelSentencePractice();
    public static JPanel panelSentenceInput = new PanelSentenceInput();

    public static void main(String[] args) {
        //buttons: 2 - add new word; 1 - practice words; 4 - add new sentence; 3 - practice sentences
        //TODO: menubar for advanced stuff

        mainFrame.setVisible(true);
        mainFrame.setLayout(null);

        //add panels
        mainFrame.add(buttonPanel);
        mainFrame.add(panelWordPractice);
        mainFrame.add(panelWordInput);
        mainFrame.add(panelSentencePractice);
        mainFrame.add(panelSentenceInput);



    }
}
