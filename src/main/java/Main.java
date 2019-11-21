import com.janra.gol.wrappers.Console;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) throws InterruptedException
    {
        Console console = new Console(20,40);

        console.setText("XXXX  X XX X\nX XX  XX X X\n   XX X X  X");
        Thread.sleep(5000);
        console.setText("X  XXX  X XX\nX    XX XX X\n X X XXXXXXX");
    }
}
