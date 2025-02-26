package producerConsumer;

public class Company {
    private Integer n;
    boolean flag=true;
  synchronized   public void produced_item(int n)
    {
        if(!flag)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n=n;
        System.out.println(this.n+" Item got produced");
        flag=false;
        notify();
        return;
    }
  synchronized    public Integer consumed_item()
    {
        if(flag)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println(this.n+ "Item got consumed");
        flag=true;
        notify();
        return this.n;
    }
}
