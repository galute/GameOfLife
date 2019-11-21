package com.janra.gol.factories;

import com.janra.gol.wrappers.Console;
import com.janra.gol.wrappers.IConsole;

public class WrapperFactory
{
    public IConsole createConsole(int rows, int columns)
    {
        return new Console(rows, columns);
    }
}
