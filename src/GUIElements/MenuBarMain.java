package GUIElements;

import javax.swing.*;

public class MenuBarMain extends JMenuBar {
    public MenuBarMain() {

        JMenuItem placeholderItem = new JMenuItem("Coming soon");

        JMenu menu1 = new JMenu("File");
        menu1.add(placeholderItem);

        JMenuItem menuItemAbout = new JMenuItem("About");
        JMenuItem menuitemHelp = new JMenuItem("Help");

        JMenu menu2 = new JMenu("Help");
        menu2.add(menuItemAbout);
        menu2.add(menuitemHelp);

        this.add(menu1);
        this.add(menu2);
    }
}
