package GUIElements;

import Constants.ConstantsColors;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasePanel extends JPanel implements ActionListener {
    protected int wordTextFieldWidth = 250;

    public BasePanel(){
        this.setBackground(ConstantsColors.COLOR_LIGHT_GRAY);
        this.setLayout(null);
        this.setBounds(0, 100, 950, 600); //no need to use .setSize() when using this method
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
