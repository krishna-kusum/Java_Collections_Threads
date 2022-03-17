class MyTask extends Thread{
    @Override
    public void run(){
        System.out.println("Running Thread Threads.MyTask...");
        System.out.println("Thread name is "+ Thread.currentThread().getName());
    }
}

public class ThreadTask {
    //    represents main thread
    public static void main(String[] args){
        MyTask task = new MyTask();
        task.setName("My-Task");
        task.start();
    }
}
