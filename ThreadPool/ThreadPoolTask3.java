package com.Prowess_Soft.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTask3 {
    private static final int fixedThreadPoolSize = 5;

    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(fixedThreadPoolSize);

//
        for(int number = 1; number<=10; number++){
            Runnable worker = new WorkerThread(number);
            executor.execute(worker);
        }

        executor.shutdown();
        while (!executor.isTerminated()){

        }
        System.out.println("Submitted all Tasks...");

    }
}
