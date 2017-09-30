package com.gmail.developer.mpm;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
        
        comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBoxFrame.setSize(350, 150);
        comboBoxFrame.setVisible(true);
    }
}
