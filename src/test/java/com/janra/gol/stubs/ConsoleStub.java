package com.janra.gol.stubs;

import com.janra.gol.wrappers.console.IConsole;

public class ConsoleStub implements IConsole
{
    public String Text = "";

    @Override
    public void setText(String message)
    {
        Text = message;
    }
}
