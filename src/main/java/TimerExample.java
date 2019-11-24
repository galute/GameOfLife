import com.janra.gol.wrappers.console.IConsole;
import com.janra.gol.wrappers.timer.ITimerTask;

public class TimerExample implements ITimerTask
{
    private final IConsole _console;
    private Boolean _flipFlop = false;

    public TimerExample(IConsole console)
    {
        _console = console;
    }

    @Override
    public void run()
    {
        if (_flipFlop)
        {
            _console.setText("XXXX  X XX X\nX XX  XX X X\n   XX X X  X");
            _flipFlop = false;
        }
        else
        {
            _console.setText("X  XXX  X XX\nX    XX XX X\nX X XXXXXXX");
            _flipFlop = true;
        }
    }
}
