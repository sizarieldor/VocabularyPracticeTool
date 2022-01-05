package GUIElements;

import Constants.ConstantsColors;
import Constants.ConstantsGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PanelSentencePractice extends BasePanel{
    //950x600
    JButton buttonNLtoENGenerate;
    JButton buttonNLtoENCheck;
    JButton buttonENtoNLGenerate;
    JButton buttonENtoNLCheck;

    public PanelSentencePractice(){
        this.setBackground(ConstantsColors.COLOR_LIGHT_REDDISH);

        int groupVerticalOffset = 200;
        int groupHorizontalOffset = 375;

        //add text box and buttons
        //================================
        //NL to EN group:
        JLabel labelBigNLtoEN = new JLabel("Nederlands -> English");
        labelBigNLtoEN.setBounds(250, 25, 400, 50);
        labelBigNLtoEN.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(labelBigNLtoEN);
        labelBigNLtoEN.setVisible(true);

        JLabel labelNLlanguageTop = new JLabel("Nederlands:");
        labelNLlanguageTop.setBounds(25, 100, 300, 25);
        labelNLlanguageTop.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelNLlanguageTop);
        labelNLlanguageTop.setVisible(true);

        JTextField textBoxNLTop = new JTextField();
        textBoxNLTop.setBounds(25, 125, 350, 25);
        textBoxNLTop.setFont(ConstantsGUI.REGULAR_FONT);
        textBoxNLTop.setEditable(false);
        this.add(textBoxNLTop);
        textBoxNLTop.setVisible(true);

        JLabel labelENlanguageTop = new JLabel("Missing word:");
        labelENlanguageTop.setBounds(25 + groupHorizontalOffset, 100, 300, 25);
        labelENlanguageTop.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelENlanguageTop);
        labelENlanguageTop.setVisible(true);

        JTextField textBoxENTop = new JTextField();
        textBoxENTop.setBounds(25 + groupHorizontalOffset, 125, 350, 25);
        textBoxENTop.setFont(ConstantsGUI.REGULAR_FONT);
        this.add(textBoxENTop);
        textBoxENTop.setVisible(true);

        buttonNLtoENGenerate = new JButton("Generate");
        buttonNLtoENGenerate.setBounds(25, 175, 200, 25);
        buttonNLtoENGenerate.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(buttonNLtoENGenerate);
        buttonNLtoENCheck.addActionListener(this);
        buttonNLtoENGenerate.setVisible(true);

        buttonNLtoENCheck = new JButton("Check");
        buttonNLtoENCheck.setBounds(25 + groupHorizontalOffset, 175, 200, 25);
        buttonNLtoENCheck.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(buttonNLtoENCheck);
        buttonNLtoENCheck.addActionListener(this);
        buttonNLtoENCheck.setVisible(true);

        //================================
        //EN to NL group:

        JLabel labelBigENtoNL = new JLabel("English -> Nederlands");
        labelBigENtoNL.setBounds(250, 275, 400, 50);
        labelBigENtoNL.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(labelBigENtoNL);
        labelBigENtoNL.setVisible(true);


        JLabel labelNLlanguageBot = new JLabel("Missing word:");
        labelNLlanguageBot.setBounds(25, 150 + groupVerticalOffset, 300, 25);
        labelNLlanguageBot.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelNLlanguageBot);
        labelNLlanguageBot.setVisible(true);

        JTextField textBoxNLBot = new JTextField();
        textBoxNLBot.setBounds(25, 175 + groupVerticalOffset, 350, 25);
        textBoxNLBot.setFont(ConstantsGUI.REGULAR_FONT);
        this.add(textBoxNLBot);
        textBoxNLBot.setVisible(true);

        JLabel labelENlanguageBot = new JLabel("English:");
        labelENlanguageBot.setBounds(25 + groupHorizontalOffset, 150 + groupVerticalOffset, 300, 25);
        labelENlanguageBot.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelENlanguageBot);
        labelENlanguageBot.setVisible(true);

        JTextField textBoxENBot = new JTextField();
        textBoxENBot.setBounds(25 + groupHorizontalOffset, 175 + groupVerticalOffset, 350, 25);
        textBoxENBot.setFont(ConstantsGUI.REGULAR_FONT);
        textBoxENBot.setEditable(false);
        this.add(textBoxENBot);
        textBoxENBot.setVisible(true);

        buttonENtoNLGenerate = new JButton("Generate");
        buttonENtoNLGenerate.setBounds(25 + groupHorizontalOffset, 225 + groupVerticalOffset, 200, 25);
        buttonENtoNLGenerate.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(buttonENtoNLGenerate);
        buttonENtoNLGenerate.addActionListener(this);
        buttonENtoNLGenerate.setVisible(true);

        buttonENtoNLCheck = new JButton("Check");
        buttonENtoNLCheck.setBounds(25, 225 + groupVerticalOffset, 200, 25);
        buttonENtoNLCheck.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(buttonENtoNLCheck);
        buttonENtoNLCheck.addActionListener(this);
        buttonENtoNLCheck.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonNLtoENGenerate ){

        } else if (e.getSource()==buttonNLtoENCheck){

        } else if (e.getSource()==buttonENtoNLGenerate){

        } else if (e.getSource()==buttonENtoNLCheck){

        }
    }
}
