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

import com.janra.gol.stubs.GridStub;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTests
{
    private GridStub _grid;
    private Calculator _unitUnderTest;

    @Before
    public void Setup()
    {
        _grid = new GridStub();
        _unitUnderTest = new Calculator(_grid);
    }

    private List<Boolean> buildIsAliveResponses()
    {
        List<Boolean> retVal = new ArrayList<>();

        retVal.add(true);
        retVal.add(false);
        retVal.add(false);
        retVal.add(false);
        retVal.add(false);
        retVal.add(false);
        retVal.add(false);
        retVal.add(false);

        return retVal;
    }

    @Test
    public void TestCoordinatesInScope()
    {
        try
        {
            _grid.ScopeResponse = false;
            _unitUnderTest.calculate(100, 100);
            Assert.fail("Expected exception not thrown");
        }
        catch (IllegalArgumentException ex)
        {
            Assert.assertEquals("Coordinates X = 100, Y = 100 off grid", ex.getMessage());
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }

    @Test
    public void PassesXCoordinatesPlusAndMinus()
    {
        try
        {
            _grid.ScopeResponse = true;
            _grid.IsAliveResponses = buildIsAliveResponses();
            _unitUnderTest.calculate(100, 100);
            Assert.assertEquals("1st lower x value wrong",99, _grid.XCoords.get(0).intValue());
            Assert.assertEquals("1st middle x value wrong",99, _grid.XCoords.get(1).intValue());
            Assert.assertEquals("1st upper x value wrong",99, _grid.XCoords.get(2).intValue());
            Assert.assertEquals("2nd lower x value wrong",100, _grid.XCoords.get(3).intValue());
            Assert.assertEquals("2nd upper x value wrong",100, _grid.XCoords.get(4).intValue());
            Assert.assertEquals("3rd lower x value wrong",101, _grid.XCoords.get(5).intValue());
            Assert.assertEquals("3rd middle x value wrong",101, _grid.XCoords.get(6).intValue());
            Assert.assertEquals("3rd upper x value wrong",101, _grid.XCoords.get(7).intValue());

            _grid.XCoords.forEach(x -> {
                if (x < 99 || x > 101)
                {
                    Assert.fail("X coordinate " + x + " out of bounds");
                }
            });
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }

    @Test
    public void PassesYCoordinatesPlusAndMinus()
    {
        try
        {
            _grid.ScopeResponse = true;
            _grid.IsAliveResponses = buildIsAliveResponses();
            _unitUnderTest.calculate(100, 100);
            Assert.assertEquals("1st lower y value wrong",99, _grid.YCoords.get(0).intValue());
            Assert.assertEquals("1st middle y value wrong",100, _grid.YCoords.get(1).intValue());
            Assert.assertEquals("1st upper y value wrong",101, _grid.YCoords.get(2).intValue());
            Assert.assertEquals("2nd lower y value wrong",99, _grid.YCoords.get(3).intValue());
            Assert.assertEquals("2nd upper y value wrong",101, _grid.YCoords.get(4).intValue());
            Assert.assertEquals("3rd lower y value wrong",99, _grid.YCoords.get(5).intValue());
            Assert.assertEquals("3rd middle y value wrong",100, _grid.YCoords.get(6).intValue());
            Assert.assertEquals("3rd upper y value wrong",101, _grid.YCoords.get(7).intValue());

            _grid.YCoords.forEach(y -> {
                if (y < 99 || y > 101)
                {
                    Assert.fail("Y coordinate " + y + " out of bounds");
                }
            });
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }

    @Test
    public void AccumulatesOneAlive()
    {
        try
        {
            _grid.IsAliveResponses = buildIsAliveResponses();

            _grid.ScopeResponse = true;
            _unitUnderTest.calculate(100, 100);
            Assert.assertEquals("Wrong count", 1, _unitUnderTest.count().intValue());

        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }

    @Test
    public void AccumulatesFourAlive()
    {
        try
        {
            _grid.IsAliveResponses.add(true);
            _grid.IsAliveResponses.add(true);
            _grid.IsAliveResponses.add(true);
            _grid.IsAliveResponses.add(false);
            _grid.IsAliveResponses.add(false);
            _grid.IsAliveResponses.add(false);
            _grid.IsAliveResponses.add(true);
            _grid.IsAliveResponses.add(false);

            _grid.ScopeResponse = true;
            _unitUnderTest.calculate(100, 100);
            Assert.assertEquals("Wrong count", 4, _unitUnderTest.count().intValue());

        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }
}
