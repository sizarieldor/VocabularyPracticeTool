package GUIElements;

import Constants.ConstColors;
import Constants.ConstGUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainLabel extends JLabel{
    public MainLabel(){
        this.setText("my first label");
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setFont(new Font("Verdana", Font.BOLD,15));
        this.setBackground(ConstColors.COLOR_LIGHT_GREENISH);
        this.setOpaque(true);
        this.setBounds(300, 0, 200, 50);
        Border border = BorderFactory.createLineBorder(Color.orange,4);
        this.setBorder(border);
    }
}
