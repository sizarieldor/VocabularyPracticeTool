package GUIElements;

import Constants.ConstantsGUI;

import javax.swing.*;


public class FrameMain extends JFrame {


    public FrameMain() {
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setTitle("Woordenschat Gereedschap");
        this.setSize(905, 700);
        this.setResizable(false);
//        this.getContentPane().setBackground(ConstColors.COLOR_LIGHT_BLUEISH);
        this.setFont(ConstantsGUI.BUTTON_FONT);
        this.setVisible(true);

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
