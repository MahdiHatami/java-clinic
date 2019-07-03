package clinic.problem2;

import org.jfugue.Player;

import java.awt.*;


public class MouseMusic implements Runnable
{

    public final Object lock = new Object();

    public MouseMusic()
    {

    }

    @Override
    public void run()
    {
        while (true) {
            synchronized (lock) {
                while (MouseChecker.state) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            Player player = new Player();

            Point loc = MouseInfo.getPointerInfo().getLocation();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = screenSize.getWidth();
            double height = screenSize.getHeight();
            int pitch = 127 - (int) (loc.y * 127 / height);
            int volume = (int) (loc.x * 16383 / width);

            player.play("X[Volume]=" + volume + " [" + pitch + "]");
        }
    }
}

