package com.janra.gol.wrappers.console.impl;

import com.janra.gol.wrappers.console.IConsole;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Console implements IConsole
{
    final MainWindow _frame = new MainWindow(1,1);
    final JTextArea _textArea;

    public Console()
    {
        _textArea = new JTextArea(24, 80);
        initialise();
    }

    public Console(int rows, int columns)
    {
        _textArea = new JTextArea(rows, columns);
        initialise();
    }

    private void initialise()
    {
        _textArea.setBackground(Color.BLACK);
        _textArea.setForeground(Color.LIGHT_GRAY);
        _textArea.setFont(new Font("monospaced", Font.PLAIN, 12));

        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException
            {
                _textArea.append(String.valueOf((char) b));
            }
        }));

        _frame.add(_textArea);
        _frame.pack();
        _frame.setVisible(true);
    }

    @Override
    public void setText(String message)
    {
        _textArea.setText(message);
    }
}
