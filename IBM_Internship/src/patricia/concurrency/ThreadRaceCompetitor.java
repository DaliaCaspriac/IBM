package patricia.concurrency;

import java.sql.Time;

public class ThreadRaceCompetitor extends Thread {
    private String name;
    private ThreadRaceContext context;
    public ThreadRaceCompetitor(String name){
        this.name = name;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        try {
            System.out.println("I am " + name);
            int sum = 0;
            for(int i = 0; i < 100; i++){
                sum += i;
            }
            ThreadRaceCompetitor.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        context = new ThreadRaceContext(name,start,end);
    }

    public ThreadRaceContext getContext() {
        return context;
    }
}
