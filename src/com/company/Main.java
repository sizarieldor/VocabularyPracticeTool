package com.company;

import GUIElements.*;

import javax.swing.*;

import java.io.File;

import ReaderAndWriter.DatabaseReader;
import ReaderAndWriter.DatabaseWriter;

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
    //gamify the word/sentence answering? win streak?
    //OCR support for text?

    //initialize major components
    public static JFrame mainFrame = new FrameMain();
    //    public static JLabel mainLabel = new MainLabel();
//    public static JPanel buttonPanel = new ButtonPanel();
    public static JPanel panelWordPractice = new PanelWordPractice();
    public static JPanel panelWordInput = new PanelWordInput();
    public static JPanel panelSentencePractice = new PanelSentencePractice();
    public static JPanel panelSentenceInput = new PanelSentenceInput();
    public static File wordsDatabaseFile = new File("words_database.txt"); //TODO make a .ini file and connect stuff to it
    public static DatabaseReader databaseReader = new DatabaseReader(wordsDatabaseFile);
    public static DatabaseWriter databaseWriter = new DatabaseWriter();


    public static void main(String[] args) {
        //TODO load a bunch of things from the .ini file
        databaseWriter.createWordDatabase(); //this will probably be empty

//        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLayout(null);

        JMenuBar menuBar = new MenuBarMain();
        mainFrame.setJMenuBar(menuBar);
        menuBar.setVisible(true);

        JTabbedPane tabbedPane = new BaseTabbedPane();
        mainFrame.add(tabbedPane);
        tabbedPane.setBounds(0, 0, 900, 700);

        mainFrame.setVisible(true);
    }
}
