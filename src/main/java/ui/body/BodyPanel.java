package ui.body;

import ui.body.left.LeftPanel;
import ui.body.right.RightPanel;

import javax.swing.*;
import java.awt.*;

public class BodyPanel extends JPanel {
    private JPanel leftPanel;
    private JPanel rightPanel;
    public BodyPanel() {
        GridBagConstraints c = null;
        this.setLayout(new GridBagLayout());
        //this.setBackground(Color.green);
        this.setLayout(new GridBagLayout());

        leftPanel = new LeftPanel();
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.3;
        c.weighty = 1.0;
        //c.anchor = GridBagConstraints.NORTHWEST;
        c.fill = GridBagConstraints.BOTH;
        this.add(leftPanel,c);

        rightPanel = new RightPanel();
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.7;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        this.add(rightPanel,c);
    }
}
