package GUIElements;

import Constants.ConstColors;
import Constants.ConstGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XWordInputFrame extends JFrame implements ActionListener {
    JButton buttonWordInput;
    JButton buttonWordPractice;
    JButton buttonSentenceInput;
    JButton buttonSentencePractice;

    public XWordInputFrame() {
        this.setTitle(ConstGUI.WORD_EXERCISE_TITLE);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(ConstColors.COLOR_LIGHT_REDDISH);
        this.setLayout(null);

        buttonWordInput = new JButton("Input new words"); //TODO button connect to listeners
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
        if (e.getSource() == buttonWordInput) {
            //word input window
        } else if (e.getSource() == buttonWordPractice) {
            //word practice window
        } else if (e.getSource() == buttonSentenceInput) {
            //sentence input window
        } else if (e.getSource()==buttonSentencePractice){
            //sentence practice window
        }
    }

/* OLD WAY
public static javax.swing.JFrame createMainFrame(){
        javax.swing.JFrame mainFrame = new javax.swing.JFrame();
        mainFrame.setTitle(GUIConstants.HOME_PANEL_TITLE);
        mainFrame.setSize(800, 600);
        mainFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.getContentPane().setBackground(GUIConstants.COLOR_LIGHT_BLUEISH);
        return mainFrame;
    }*/
}
