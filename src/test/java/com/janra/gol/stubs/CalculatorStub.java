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
package com.janra.gol.stubs;

import com.janra.gol.components.ICalculator;

public class CalculatorStub implements ICalculator
{
    public Integer X;
    public Integer Y;
    public Boolean Response;

    @Override
    public Boolean calculate(Integer x, Integer y)
    {
        X = x;
        Y = y;
        return Response;
    }

    @Override
    public Integer count()
    {
        return 0;
    }
}
