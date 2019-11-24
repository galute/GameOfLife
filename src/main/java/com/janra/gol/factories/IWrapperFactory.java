package com.janra.gol.factories;

import com.janra.gol.wrappers.console.IConsole;
import com.janra.gol.wrappers.timer.ITimer;

public interface IWrapperFactory
{
    IConsole createConsole(int rows, int columns);
    ITimer createTimer();
}
