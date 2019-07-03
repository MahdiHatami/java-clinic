package clinic.BusySpin;

class Consumer extends Thread
{
    Producer producer;

    Consumer(Producer prod)
    {
        producer = prod;
    }

    @Override
    public void run()
    {
        synchronized (this.producer) {
            try {
                this.producer.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer starts consuming products.");
        int size = this.producer.proList.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Consumed : " + this.producer.proList.remove(0) + " ");
        }
    }
}
