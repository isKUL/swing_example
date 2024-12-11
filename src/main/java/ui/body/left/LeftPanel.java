package ui.body.left;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    private JTree tree;
    private JScrollPane scrollPane;

    public LeftPanel() {
        GridBagConstraints c = null;
        //this.setBackground(Color.ORANGE);
        this.setLayout(new GridBagLayout());

        tree = new JTree();
        c = new GridBagConstraints();
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;

        scrollPane = new JScrollPane(tree);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        this.add(scrollPane, c);
    }
}
