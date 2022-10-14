package cat.uvic.teknos.m09.threadTests;

public class ImportantStuff1 implements Runnable {
    @Override
    public  void run() {
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("done Important Stuff 1");

    }
}
