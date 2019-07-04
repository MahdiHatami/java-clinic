package clinic.busySpin;

public class BusySpinDemo
{
    public static void main(String[] args)
    {
        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);
        Thread producerThread = new Thread(producer, "prodThread");
        Thread consumerThread = new Thread(consumer, "consThread");
        producerThread.start();
        consumerThread.start();

    }
}
