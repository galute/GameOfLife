
package com.janra.gol.factories;

import com.janra.gol.wrappers.console.impl.Console;
import com.janra.gol.wrappers.console.IConsole;
import com.janra.gol.wrappers.timer.ITimer;
import com.janra.gol.wrappers.timer.impl.TimerImpl;
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

    @Test
    public void createsTimer()
    {
        try
        {
            ITimer result = _unitUnderTest.createTimer();
            Assert.assertNotNull("Factory returned null Timer", result);
            Assert.assertTrue("Factory return instance of " + result.getClass().getTypeName(),
                    result instanceof TimerImpl);
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }

    @Test
    public void createsNew()
    {
        try
        {
            IWrapperFactory result = WrapperFactory.create();
            Assert.assertNotNull("Factory returned null factory", result);
            Assert.assertTrue("Factory return instance of " + result.getClass().getTypeName(),
                    result instanceof WrapperFactory);
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
    }
}
