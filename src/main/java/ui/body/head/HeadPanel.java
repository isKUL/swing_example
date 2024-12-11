package ui.body.head;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HeadPanel extends JPanel {
    private JLabel pathLabel;
    private JTextField textField;
    private JButton selectButton;

    public HeadPanel() {
        GridBagConstraints c = null;
        this.setMinimumSize(new Dimension(800,40));
        this.setPreferredSize(new Dimension(800,40));
        this.setLayout(new GridBagLayout());
        //this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        pathLabel = new JLabel();
        pathLabel.setText("Каталог JQRunner:");
        c = new GridBagConstraints();
        c.insets = new Insets(0,5,0,0);
        c.gridx = 0;
        c.gridy = 1;
        this.add(pathLabel,c);

        textField = new JTextField();
        textField.setEditable(false);
        c = new GridBagConstraints();
        c.insets = new Insets(0,5,0,5);
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(textField,c);

        selectButton= new JButton();
        selectButton.setText("Выбрать");
        selectButton.setMargin(new Insets(0,10,0,10));
        selectButton.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.setCurrentDirectory(new File(Path.of("","conf").toAbsolutePath().toString()));
            if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                textField.setText(fc.getSelectedFile().getAbsolutePath());
            }
        });
        c = new GridBagConstraints();
        c.insets = new Insets(0,0,0,5);
        c.gridx = 2;
        c.gridy = 1;
        this.add(selectButton,c);
     }
}
