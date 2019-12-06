package com.janra.gol.components;

public class Cell implements ICell
{
    private final Integer _x;
    private final Integer _y;
    private final ICalculator _calculator;
    private Boolean _isAlive = false;

    public Cell(Integer x, Integer y, ICalculator calculator)
    {
        _x = x;
        _y = y;
        _calculator = calculator;
    }

    public void calculate()
    {
        _isAlive = _calculator.calculate(_x, _y);
    }

    public Boolean isAlive()
    {
        return _isAlive;
    }
}
