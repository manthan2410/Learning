package producerConsumer;

public class producerThread extends Thread{
    Company c;

    producerThread(Company c)
    {
        this.c=c;
    }
    @Override
    public void  run()
    {
        int i=1;
        while(true)
        {
            this.c.produced_item(i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
