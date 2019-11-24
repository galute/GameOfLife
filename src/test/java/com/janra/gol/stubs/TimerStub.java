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

import com.janra.gol.wrappers.timer.ITimer;
import com.janra.gol.wrappers.timer.ITimerTask;

public class TimerStub implements ITimer
{
    public ITimerTask Task;
    public Integer Interval;
    public Integer CancelCount = 0;

    @Override
    public void start(ITimerTask task, Integer intervalSeconds)
    {
        Task = task;
        Interval = intervalSeconds;
    }

    @Override
    public void cancel()
    {
        CancelCount++;
    }
}
