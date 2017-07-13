/**
 * Created by Jordan on 7/10/2017.
 */
public class MsLunch {

    private long c1 = 0;
    private long c2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void incl() {
        synchronized (lock1) {
            c1++;
        }
    }

    public void inc2() {
        synchronized (lock2) {
            c2++;
        }
    }

    public void guardedJoy() {
        // Simple loop guard. Wastes
        // processro time. Don't do this!
        while(!joy) {}
        System.out.println("Joy has been achieved!");

    }
}
