package GUIElements;

import Constants.ConstantsColors;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelMain extends JLabel{
    public LabelMain(){
        this.setText("my first label");
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setFont(new Font("Verdana", Font.BOLD,15));
        this.setBackground(ConstantsColors.COLOR_LIGHT_GREENISH);
        this.setOpaque(true);
        this.setBounds(300, 0, 200, 50);
        Border border = BorderFactory.createLineBorder(Color.orange,4);
        this.setBorder(border);
    }
}
