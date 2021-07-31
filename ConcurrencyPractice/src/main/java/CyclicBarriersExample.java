import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarriersExample implements Runnable{

    private int id;
    private Random random;
    private CyclicBarrier cyclicBarrier;


    public CyclicBarriersExample(int id, Random random, CyclicBarrier cyclicBarrier) {
        this.id = id;
        this.random = random;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        doWork();
    }

    private void doWork() {
        System.out.println("Thread with ID " + id + " starts the task...");
    }
}
