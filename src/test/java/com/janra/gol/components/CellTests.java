package com.janra.gol.components;

import com.janra.gol.stubs.CalculatorStub;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CellTests
{
    private Cell _unitUnderTest;
    private CalculatorStub _calc;

    @Before
    public void Setup()
    {
        _calc = new CalculatorStub();
        _unitUnderTest = new Cell(1, 3, _calc);
    }

    @Test
    public void UsesCalculatorResponse()
    {
        try
        {
            _calc.Response = true;
            _unitUnderTest.calculate();

            Assert.assertTrue("Cell not using isAlive response from calculator", _unitUnderTest.isAlive());
            Assert.assertEquals("X coord for cell wrong", _calc.X.intValue(), 1);
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }

    @Test
    public void PassesCoordsToCalculator()
    {
        try
        {
            _unitUnderTest.calculate();

            Assert.assertEquals("X coord for cell wrong", 1, _calc.X.intValue());
            Assert.assertEquals("Y coord for cell wrong", 3, _calc.Y.intValue());
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }
}
