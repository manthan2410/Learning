package producerConsumer;

public class consumerThread extends Thread{
    Company c;

    consumerThread(Company c)
    {
        this.c=c;
    }
    @Override
    public void run()
    {
        while(true)
        {
            this.c.consumed_item();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
