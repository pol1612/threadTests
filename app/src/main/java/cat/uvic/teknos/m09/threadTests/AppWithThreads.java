package cat.uvic.teknos.m09.threadTests;

public class AppWithThreads {
    public static void main(String[] args) throws InterruptedException {

        ImportantStuff1 importantStuff1=new ImportantStuff1();
        ImportantStuff2 importantStuff2=new ImportantStuff2();
        ImportantStuff3 importantStuff3=new ImportantStuff3();

        var thread1=new Thread(importantStuff1);
        var thread2=new Thread(importantStuff2);
        var thread3=new Thread(importantStuff3);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("the end");

    }
}
