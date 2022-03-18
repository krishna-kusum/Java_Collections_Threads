package com.Prowess_Soft.ThreadPool;

public class WorkerThread implements Runnable{

    private int numberMessage;
    public WorkerThread(int numberMessage){
        this.numberMessage = numberMessage;
    }

    public void replyToMessage(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println("Unable to process Number "+ numberMessage);
        }
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" [RECEIVED] Number "+numberMessage);
        replyToMessage();
        System.out.println(Thread.currentThread().getName()+" [DONE] Processing Number "+ numberMessage);
    }
}
