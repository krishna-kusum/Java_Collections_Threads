class YourTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Running Thread YourTask...");
        System.out.println("Thread name is "+ Thread.currentThread().getName());
    }
}

public class RunnableTask {
    //    represents main thread
    public static void main(String[] args){
        Thread task = new Thread(new YourTask());
        task.setName("Your-Task");
        task.start();
    }
}
