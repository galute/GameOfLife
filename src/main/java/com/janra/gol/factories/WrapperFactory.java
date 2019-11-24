package com.janra.gol.factories;

import com.janra.gol.wrappers.console.impl.Console;
import com.janra.gol.wrappers.console.IConsole;
import com.janra.gol.wrappers.timer.ITimer;
import com.janra.gol.wrappers.timer.impl.TimerImpl;

public class WrapperFactory implements IWrapperFactory
{
    public IConsole createConsole(int rows, int columns)
    {
        return new Console(rows, columns);
    }

    @Override
    public ITimer createTimer()
    {
        return new TimerImpl();
    }

    public static IWrapperFactory create()
    {
        return new WrapperFactory();
    }
}
