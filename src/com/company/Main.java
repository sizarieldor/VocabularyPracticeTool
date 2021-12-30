package com.company;

import GUIElements.HomePanel;
import GUIElements.MainFrame;
import GUIElements.WordInputPanel;

import javax.swing.*;
import java.awt.*;

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
//    public static JFrame wordInputFrame = new WordInputFrame();
//    public static JLabel mainLabel = new MainLabel();
    public static JPanel homePanel = new HomePanel();
    public static JPanel wordInputPanel = new WordInputPanel();

    public static void main(String[] args) {
//        homeFrame.add(mainLabel);
        mainFrame.setVisible(true);
        mainFrame.setLayout(null);
        mainFrame.add(homePanel);
        mainFrame.add(wordInputPanel);
        wordInputPanel.setBounds(300, 0, 800, 800);
//
//        JPanel panel = new JPanel();
//        homeFrame.add(panel);
//        panel.setBackground(GUIConstants.COLOR_LIGHT_BLUEISH);
        //initialize menus:
    }
}
