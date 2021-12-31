package GUIElements;

import Constants.ConstColors;
import Constants.ConstGUI;

import javax.swing.*;


public class MainFrame extends JFrame {


    public MainFrame() {
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setTitle(ConstGUI.HOME_PANEL_TITLE);
        this.setSize(950, 700);
        this.setResizable(false);
        this.setVisible(true);
//        this.getContentPane().setBackground(ConstColors.COLOR_LIGHT_BLUEISH);
        this.setFont(ConstGUI.BUTTON_FONT);
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
