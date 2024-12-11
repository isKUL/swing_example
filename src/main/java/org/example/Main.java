package org.example;

import com.formdev.flatlaf.FlatLightLaf;
import ui.Ui;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new FlatLightLaf());
        UIManager.put( "Button.arc", 10 );
        UIManager.put( "TabbedPane.showTabSeparators", true );
        UIManager.put( "TabbedPane.selectedBackground", Color.white );
        UIManager.put( "TabbedPane.tabArc", 10 );
        Ui ui = new Ui();
    }

    private static String getLookAndFeelClassName(String nameSnippet) {
        UIManager.LookAndFeelInfo[] plafs = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : plafs) {
            if (info.getName().toUpperCase().contains(nameSnippet.toUpperCase())) {
                return info.getClassName();
            }
        }
        return null;
    }
}