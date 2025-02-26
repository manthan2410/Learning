package producerConsumer;

public class main {
    public static void main(String[] args) {
        Company c1=new Company();
        producerThread producer=new producerThread(c1);
        consumerThread consumer=new consumerThread(c1);
        producer.start();
        consumer.start();

    }
}
