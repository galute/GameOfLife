package com.janra.gol.components;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CellTests
{
    private Cell _unitUnderTest;

    @Before
    public void Setup()
    {
        _unitUnderTest = new Cell();
    }

    @Test
    public void PlaceHolder()
    {
        try
        {
           Assert.assertTrue("placeholder test", true);
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }
}
