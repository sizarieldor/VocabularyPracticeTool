package GUIElements;

import Constants.ConstColors;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasePanel extends JPanel implements ActionListener {

    public BasePanel(){
        this.setVisible(false);
        this.setBackground(ConstColors.COLOR_LIGHT_GRAY);
        this.setLayout(null);
        this.setBounds(0, 100, 950, 600); //no need to use .setSize() when using this method
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
