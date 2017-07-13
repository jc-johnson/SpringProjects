/**
 * Created by Jordan on 7/9/2017.
 */
public class Counter {

    private int c = 0;

    public Counter(int value) {
        this.c = value;
    }

    public synchronized void increment(){
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }

    public static void main(String[] args) {

        Counter counter = new Counter(10);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.increment();
                System.out.println(counter.value());
                Thread thread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        counter.decrement();
                    }
                });
                System.out.println(counter.value());
                try {
                    Thread.sleep(1000);
                    System.out.println(counter.value());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.run();


    }
}
