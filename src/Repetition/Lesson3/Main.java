package Repetition.Lesson3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static boolean marker = false;
//    public static boolean shouldCheckUpdates = false;


    public static void main(String[] args) throws InterruptedException {
        thread();

        for (int i = 0; i < 5; i++) {
            Thread t1 = new Thread(() -> {
                System.out.println("ping");
                marker = true;
            });


            Thread t2 = new Thread(() -> {
                System.out.println("pong");
                marker = false;
            });

            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }




    }
    public static void thread(){
        ReentrantLock lock = new ReentrantLock();

        Thread t3 = new Thread(() -> {
            lock.lock();
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
            lock.unlock();
        });

        Thread t4 = new Thread(() -> {
            lock.lock();
            for (int i = 5; i < 11; i++) {
                System.out.println(i);
            }
            lock.unlock();
        });

        t3.start();
        t4.start();

    }


}