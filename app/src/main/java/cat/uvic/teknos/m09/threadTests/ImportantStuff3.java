package cat.uvic.teknos.m09.threadTests;

public class ImportantStuff3 {
    public void doStuff() {
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("done Important Stuff 3");

    }
}
