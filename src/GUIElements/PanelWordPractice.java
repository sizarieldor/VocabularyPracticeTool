package GUIElements;

import Constants.ConstantsColors;
import Constants.ConstantsGUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.company.Main.databaseReader;

public class PanelWordPractice extends BasePanel {
    //950x600
    JButton buttonNLtoENGenerate;
    JButton buttonNLtoENCheck;
    JButton buttonENtoNLGenerate;
    JButton buttonENtoNLCheck;

    JTextField textBoxNLTop;
    JTextField textBoxENTop;
    JTextField textBoxNLBot;
    JTextField textBoxENBot;

    JLabel labelNLToENSun;
    JLabel labelNLToENCloud;
    JLabel labelENToNLSun;
    JLabel labelENToNLCloud;

    public PanelWordPractice() {
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

        textBoxNLTop = new JTextField();
        textBoxNLTop.setBounds(25, 125, wordTextFieldWidth, 25);
        textBoxNLTop.setFont(ConstantsGUI.REGULAR_FONT);
        textBoxNLTop.setEditable(false);
        this.add(textBoxNLTop);
        textBoxNLTop.setVisible(true);

        JLabel labelENlanguageTop = new JLabel("English:");
        labelENlanguageTop.setBounds(25 + groupHorizontalOffset, 100, 300, 25);
        labelENlanguageTop.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelENlanguageTop);
        labelENlanguageTop.setVisible(true);

        textBoxENTop = new JTextField();
        textBoxENTop.setBounds(25 + groupHorizontalOffset, 125, wordTextFieldWidth, 25);
        textBoxENTop.setFont(ConstantsGUI.REGULAR_FONT);
        this.add(textBoxENTop);
        textBoxENTop.setVisible(true);

        buttonNLtoENGenerate = new JButton("Generate");
        buttonNLtoENGenerate.setBounds(25, 175, 200, 25);
        buttonNLtoENGenerate.setFont(ConstantsGUI.BUTTON_FONT);
        this.add(buttonNLtoENGenerate);
        buttonNLtoENGenerate.addActionListener(this);
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


        JLabel labelNLlanguageBot = new JLabel("Nederlands:");
        labelNLlanguageBot.setBounds(25, 150 + groupVerticalOffset, 300, 25);
        labelNLlanguageBot.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelNLlanguageBot);
        labelNLlanguageBot.setVisible(true);

        textBoxNLBot = new JTextField();
        textBoxNLBot.setBounds(25, 175 + groupVerticalOffset, wordTextFieldWidth, 25);
        textBoxNLBot.setFont(ConstantsGUI.REGULAR_FONT);
        this.add(textBoxNLBot);
        textBoxNLBot.setVisible(true);

        JLabel labelENlanguageBot = new JLabel("English:");
        labelENlanguageBot.setBounds(25 + groupHorizontalOffset, 150 + groupVerticalOffset, 300, 25);
        labelENlanguageBot.setFont(ConstantsGUI.INFO_FONT);
        this.add(labelENlanguageBot);
        labelENlanguageBot.setVisible(true);

        textBoxENBot = new JTextField();
        textBoxENBot.setBounds(25 + groupHorizontalOffset, 175 + groupVerticalOffset, wordTextFieldWidth, 25);
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

        //create success/fail icons
        try {
            BufferedImage imageNLToENSun = ImageIO.read(new File("src\\sun.bmp"));
            labelNLToENSun = new JLabel(new ImageIcon(imageNLToENSun));
            this.add(labelNLToENSun);
            labelNLToENSun.setBounds(700,100,150,150);
            labelNLToENSun.setVisible(false);

            BufferedImage imageNLtoENCloud = ImageIO.read(new File("src\\cloud.bmp"));
            labelNLToENCloud = new JLabel(new ImageIcon(imageNLtoENCloud));
            this.add(labelNLToENCloud);
            labelNLToENCloud.setBounds(700,100,150,150);
            labelNLToENCloud.setVisible(false);

            BufferedImage imageENtoNLSun = ImageIO.read(new File("src\\sun.bmp"));
            labelENToNLSun = new JLabel(new ImageIcon(imageENtoNLSun));
            this.add(labelENToNLSun);
            labelENToNLSun.setBounds(700,100,150,150);
            labelENToNLSun.setVisible(false);

            BufferedImage imageENtoNLCloud = ImageIO.read(new File("src\\cloud.bmp"));
            labelENToNLCloud = new JLabel(new ImageIcon(imageENtoNLCloud));
            this.add(labelENToNLCloud);
            labelENToNLCloud.setBounds(700,100,150,150);
            labelENToNLCloud.setVisible(false);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonNLtoENGenerate ){
            //fetch a random word
            String randomDutchWord = databaseReader.generateRandomDutchWord();
            textBoxNLTop.setText(randomDutchWord);

        } else if (e.getSource()==buttonNLtoENCheck){
            //check if translation is correct
            String currentDutchWord = textBoxNLTop.getText();
            String correctEnglishTransl = databaseReader.translateDutchWord(currentDutchWord);
            String guessedEnglishTransl = textBoxENTop.getText().trim().toLowerCase();
            if(correctEnglishTransl.equals(guessedEnglishTransl)){
                //notification correct
                labelNLToENSun.setVisible(true);
                labelNLToENCloud.setVisible(false);
            } else {
                //notification incorrect
                labelNLToENSun.setVisible(false);
                labelNLToENCloud.setVisible(true);
            }

        } else if (e.getSource()==buttonENtoNLGenerate){
            String randomEnglishWord = databaseReader.generateRandomEnglishWord();
            textBoxENBot.setText(randomEnglishWord);

        } else if (e.getSource()==buttonENtoNLCheck){
            String currentEnglishWord = textBoxENBot.getText();
            String correctDutchTransl = databaseReader.translateEnglishWord(currentEnglishWord);
            String guessedDutchTransl = textBoxNLBot.getText().trim().toLowerCase();
            if(correctDutchTransl.equals(guessedDutchTransl)){
                //notificatio ncorrect
                labelENToNLSun.setVisible(true);
                labelENToNLCloud.setVisible(false);
            } else {
                //notif incorrect
                labelENToNLSun.setVisible(false);
                labelENToNLCloud.setVisible(true);
            }
        }
    }
}
