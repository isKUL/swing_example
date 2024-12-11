package ui.body.right;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.EditorKit;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class TabCode extends JPanel {
    private RSyntaxTextArea codePane;
    private JScrollPane scrollPane;

    public TabCode() {
        GridBagConstraints c = null;
        this.setLayout(new GridBagLayout());

        codePane = new RSyntaxTextArea();
        codePane.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_XML);
        codePane.setText("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                +"<a>isFocusTraversalPolicySet</a>\n"
                +"<a>isFocusTraversalPolicySet</a1>\n"
                +"<b>MenuText</b>\n"
        );
        codePane.setEditable(false);

        scrollPane = new JScrollPane(codePane);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        c = new GridBagConstraints();
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        this.add(scrollPane, c);
    }

}
