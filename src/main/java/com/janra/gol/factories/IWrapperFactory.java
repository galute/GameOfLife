package com.janra.gol.factories;

import com.janra.gol.wrappers.IConsole;

public interface IWrapperFactory
{
    IConsole createConsole(int rows, int columns);
}
