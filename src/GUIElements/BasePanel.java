package GUIElements;

import Constants.ConstColors;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasePanel extends JPanel implements ActionListener {

    public BasePanel(){
        this.setSize(800, 600);
        this.setVisible(true);
        this.setBackground(ConstColors.COLOR_LIGHT_BLUEISH);
        this.setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
