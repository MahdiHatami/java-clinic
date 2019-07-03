package clinic.problem2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseChecker extends JPanel implements MouseListener, Runnable
{
    private static final long serialVersionUID = 1L;
    public static boolean state = true;
    public MouseMusic music;

    public MouseChecker()
    {

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        state = false;
        synchronized (music.lock) {
            music.lock.notifyAll();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        state = false;
        synchronized (music.lock) {
            music.lock.notifyAll();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {

    }

    @Override
    public void run()
    {
        JFrame frame = new JFrame("Mouse Music");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = this;
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
        addMouseListener(this);
        music = new MouseMusic();
        new Thread(music).start();
    }
}
