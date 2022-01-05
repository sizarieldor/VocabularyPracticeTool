package GUIElements;

import Constants.ConstantsGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import static com.company.Main.panelWordPractice;
import static com.company.Main.panelWordInput;
import static com.company.Main.panelSentencePractice;
import static com.company.Main.panelSentenceInput;

public class BaseTabbedPane extends JTabbedPane {
    public BaseTabbedPane() {
        this.addTab("practice word", panelWordPractice);
        this.addTab("add word", panelWordInput);
        this.addTab("practice sent", panelSentencePractice);
        this.addTab("add sent", panelSentenceInput);

        this.setMnemonicAt(0, KeyEvent.VK_1);
        this.setMnemonicAt(1, KeyEvent.VK_2);
        this.setMnemonicAt(2, KeyEvent.VK_3);
        this.setMnemonicAt(3, KeyEvent.VK_4);

        JLabel tabLabelWordPractice = new JLabel("Practice words directly");
        JLabel tabLabelWordInput = new JLabel("Add a word");
        JLabel tabLabelSentencePractice = new JLabel("Practice words in sentences");
        JLabel tabLabelSentenceInput = new JLabel("Add a sentence");

        tabLabelWordPractice.setFont(ConstantsGUI.TAB_FONT);
        tabLabelWordInput.setFont(ConstantsGUI.TAB_FONT);
        tabLabelSentencePractice.setFont(ConstantsGUI.TAB_FONT);
        tabLabelSentenceInput.setFont(ConstantsGUI.TAB_FONT);

        this.setTabComponentAt(0, tabLabelWordPractice);
        this.setTabComponentAt(1, tabLabelWordInput);
        this.setTabComponentAt(2, tabLabelSentencePractice);
        this.setTabComponentAt(3, tabLabelSentenceInput);

        Dimension preferredTabSize = new Dimension(200, 30);
        tabLabelWordPractice.setPreferredSize(preferredTabSize);
        tabLabelWordInput.setPreferredSize(preferredTabSize);
        tabLabelSentencePractice.setPreferredSize(preferredTabSize);
        tabLabelSentenceInput.setPreferredSize(preferredTabSize);


        this.setVisible(true);

    }
}
