package com.janra.gol.wrappers.timer.impl;

import com.janra.gol.wrappers.timer.ITimerTask;

import java.util.TimerTask;

public class TaskWrapper extends TimerTask
{
    private final ITimerTask _task;

    public TaskWrapper(ITimerTask task)
    {
        _task = task;
    }

    @Override
    public void run()
    {
        _task.run();
    }
}
