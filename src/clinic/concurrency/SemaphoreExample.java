package clinic.concurrency;


import java.util.concurrent.Semaphore;

/*
    Consider an ATM cubicle with 4 ATMs,
    Semaphore can make sure only 4 people can access simultaneously.
 */
public class SemaphoreExample
{
    private static Semaphore semaphore = new Semaphore(4);

    static class MyAtmThread extends Thread
    {
        String name;

        public MyAtmThread(String name)
        {
            this.name = name;
        }

        @Override
        public void run()
        {
            try {
                System.out.println(name + " : acquiring lock...");
                System.out.println(name + " : available Semaphore permits now: "
                        + semaphore.availablePermits());

                semaphore.acquire();
                System.out.println(name + " : got the permit!");

                try {
                    for (int i = 1; i <= 5; i++) {

                        System.out.println(name + " : is performing operation " + i
                                + ", available Semaphore permits : "
                                + semaphore.availablePermits());

                        Thread.sleep(1000);
                    }
                } finally {
                    // calling release() after a successful acquire()
                    System.out.println(name + " : releasing lock...");
                    semaphore.release();
                    System.out.println(name + " : available Semaphore permits now: "
                            + semaphore.availablePermits());

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {

        System.out.println("Total available Semaphore permits : "
                + semaphore.availablePermits());

        MyAtmThread t1 = new MyAtmThread("A");
        t1.start();

        MyAtmThread t2 = new MyAtmThread("B");
        t2.start();

        MyAtmThread t3 = new MyAtmThread("C");
        t3.start();

        MyAtmThread t4 = new MyAtmThread("D");
        t4.start();

        MyAtmThread t5 = new MyAtmThread("E");
        t5.start();

        MyAtmThread t6 = new MyAtmThread("F");
        t6.start();
    }


}
