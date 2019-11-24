package com.janra.gol.wrappers.timer;

public interface ITimer
{
    void start(ITimerTask task, Integer intervalSeconds);
    void cancel();
}
