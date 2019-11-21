
package com.janra.gol.factories;

import com.janra.gol.factories.WrapperFactory;
import com.janra.gol.wrappers.Console;
import com.janra.gol.wrappers.IConsole;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WrapperFactoryTests
{
    private WrapperFactory _unitUnderTest;

    @Before
    public void Setup()
    {
        _unitUnderTest = new WrapperFactory();
    }

    @Test
    public void createsConsole()
    {
        try
        {
            IConsole result = _unitUnderTest.createConsole(10, 20);
            Assert.assertNotNull("Factory returned null Console", result);
            Assert.assertTrue("Factory return instance of " + result.getClass().getTypeName(),
                    result instanceof Console);
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }
}
