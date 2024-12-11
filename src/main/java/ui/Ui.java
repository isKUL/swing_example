package ui;

import ui.body.BodyPanel;
import ui.body.head.HeadPanel;

import javax.swing.*;
import java.awt.*;
import java.nio.file.Path;

public class Ui extends JFrame {
    private JPanel bodyPanel;
    private JPanel headPanel;
    private JTabbedPane tabbedPane;
    private JPanel ui;
    private JPanel code;
    private JTree tree;

    public Ui() throws Exception {
        createUI();
    }
    private void createUI() {
        GridBagConstraints c = null;

        this.setLayout(new GridBagLayout());
        this.setMinimumSize(new Dimension(800,600));
        this.setSize(new Dimension(800,600));
        this.setPreferredSize(new Dimension(800,600));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JQRunner - UI");

        headPanel = new HeadPanel();
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        this.add(headPanel,c);

        bodyPanel = new BodyPanel();
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        this.add(bodyPanel,c);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Действия");
        menu1.add("Сохранить всё");
        menu1.add("Отменить всё");
        menuBar.add(menu1);
        JMenu menu2 = new JMenu("Справка");
        menu2.add("О программе");
        menuBar.add(menu2);
        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }
}
