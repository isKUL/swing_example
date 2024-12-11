package ui.body.right;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {
    private JTabbedPane tabbedPane;
    private JPanel ui;
    private JPanel code;

    public RightPanel() {
        GridBagConstraints c = null;
        //this.setBackground(Color.GRAY);
        this.setLayout(new GridBagLayout());

        ui = new TabUi();
        code = new TabCode();

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Интерфейс", ui);
        tabbedPane.addTab("Код", code);
        c = new GridBagConstraints();
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        this.add(tabbedPane, c);
    }
}
