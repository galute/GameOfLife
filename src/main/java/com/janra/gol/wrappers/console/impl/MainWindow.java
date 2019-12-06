package com.janra.gol.wrappers.console.impl;

import javax.swing.JFrame;

public class MainWindow extends JFrame
{
    public MainWindow(int x, int y)
    {
        super();
        setSize(x, y);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setVisible(Boolean isVisible)
    {
        setVisible(isVisible);
    }
}
