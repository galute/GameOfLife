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

import com.janra.gol.components.IGrid;

import java.util.ArrayList;
import java.util.List;

public class GridStub implements IGrid
{

    public Boolean ScopeResponse;
    public List<Boolean> IsAliveResponses  = new ArrayList<>();
    public Integer IsAliveIndex = -1;
    public final List<Integer> XCoords = new ArrayList<>();
    public final List<Integer> YCoords = new ArrayList<>();

    @Override
    public Boolean isAlive(Integer X, Integer Y)
    {
        XCoords.add(X);
        YCoords.add(Y);
        IsAliveIndex++;

        return IsAliveResponses.get(IsAliveIndex);
    }

    @Override
    public Boolean isOnGrid(Integer X, Integer Y)
    {
        return ScopeResponse;
    }
}
