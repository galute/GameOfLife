/*
 * *****************************************************************************
 *
 * Copyright 2019: Refinitiv. All Rights Reserved.
 * This document contains information proprietary to Refinitiv
 * and may not be reproduced and/or used in whole or part without the express
 * written permission of Refinitiv.
 *
 * *****************************************************************************
 */
package com.janra.gol.components;

public class Calculator implements ICalculator
{
    private final IGrid _grid;
    private Integer _count = 0;

    public Calculator(IGrid grid)
    {
        _grid = grid;
    }

    @Override
    public Boolean calculate(Integer x, Integer y)
    {
        if (!_grid.isOnGrid(x, y))
        {
            throw new IllegalArgumentException("Coordinates X = " + x + ", Y = " + y + " off grid");
        }

        for (Integer testX = x - 1; testX <= x + 1; testX++)
        {
            for (Integer testY = y - 1; testY <= y + 1; testY++)
            {
                if (!(testX == x && testY == y))
                {
                    if(_grid.isAlive(testX, testY))
                    {
                        _count++;
                    }
                }
            }
        }

        return null;
    }

    @Override
    public Integer count()
    {
        return _count;
    }
}
