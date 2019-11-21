package com.janra.gol.stubs;

import com.janra.gol.factories.IWrapperFactory;
import com.janra.gol.wrappers.IConsole;

public class WrapperFactoryStub implements IWrapperFactory
{
    public Integer ConsoleRows = 0;
    public Integer ConsoleColumns = 0;

    @Override
    public IConsole createConsole(int rows, int columns)
    {
        ConsoleRows = rows;
        ConsoleColumns = columns;
        return new ConsoleStub();
    }
}
