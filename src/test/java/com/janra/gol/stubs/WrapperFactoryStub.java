package com.janra.gol.stubs;

import com.janra.gol.factories.IWrapperFactory;
import com.janra.gol.wrappers.console.IConsole;
import com.janra.gol.wrappers.timer.ITimer;

public class WrapperFactoryStub implements IWrapperFactory
{
    public Integer ConsoleRows = 0;
    public Integer ConsoleColumns = 0;
    public ConsoleStub Console = new ConsoleStub();
    public TimerStub Timer = new TimerStub();

    @Override
    public IConsole createConsole(int rows, int columns)
    {
        ConsoleRows = rows;
        ConsoleColumns = columns;
        return Console;
    }

    @Override
    public ITimer createTimer()
    {
        return Timer;
    }
}
