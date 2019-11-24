package com.janra.gol.wrappers.timer.impl;

import com.janra.gol.factories.IWrapperFactory;
import com.janra.gol.wrappers.timer.ITimer;
import com.janra.gol.wrappers.timer.ITimerTask;

import java.util.Timer;

public class TimerImpl implements ITimer
{
    private Timer _timer;

    public TimerImpl()
    {
        _timer = new Timer();
    }

    @Override
    public void start(ITimerTask task, Integer intervalSeconds)
    {
        long interval = intervalSeconds.longValue() * 1000;
        _timer.schedule(new TaskWrapper(task), interval, interval);
    }

    @Override
    public void cancel()
    {
        _timer.cancel();
    }
}
