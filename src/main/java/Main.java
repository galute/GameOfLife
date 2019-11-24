import com.janra.gol.factories.IWrapperFactory;
import com.janra.gol.factories.WrapperFactory;
import com.janra.gol.wrappers.console.IConsole;
import com.janra.gol.wrappers.timer.ITimer;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) throws InterruptedException
    {
        IWrapperFactory factory = WrapperFactory.create();
        ITimer timer = factory.createTimer();

        try
        {
            IConsole console = factory.createConsole(20, 40);


            timer.start(new TimerExample(console), 1);
        }
        catch (Exception ex)
        {
            System.out.println("Unexpected exception " + ex.getClass().getTypeName() + " thrown: " + ex.getMessage());
        }
        finally
        {
            timer.cancel();
        }

    }
}

