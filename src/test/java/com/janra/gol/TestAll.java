package com.janra.gol;

import com.janra.gol.components.ComponentsTestSuite;
import com.janra.gol.factories.FactoriesTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        ComponentsTestSuite.class,
        FactoriesTestSuite.class
})

public class TestAll
{
}
