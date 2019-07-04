package clinic.busySpin;

import java.util.ArrayList;

class Producer implements Runnable
{
    ArrayList<Integer> proList;

    Producer()
    {
        proList = new ArrayList<>();
    }

    @Override
    public void run()
    {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                proList.add(i);
                System.out.println("Producer is still Producing, Produced : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.notify();
        }
    }
}
