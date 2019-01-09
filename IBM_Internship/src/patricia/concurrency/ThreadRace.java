package patricia.concurrency;

public class ThreadRace {
    public static void main(String[] args) {
        ThreadRaceContext[] contexts = new ThreadRaceContext[4];
        ThreadRaceCompetitor thread1 = new ThreadRaceCompetitor("Thread 1");
        ThreadRaceCompetitor thread2 = new ThreadRaceCompetitor("Thread 2");
        ThreadRaceCompetitor thread3 = new ThreadRaceCompetitor("Thread 3");
        ThreadRaceCompetitor thread4 = new ThreadRaceCompetitor("Thread 4");

        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        contexts[0] = thread1.getContext();
        contexts[1] = thread2.getContext();
        contexts[2] = thread3.getContext();
        contexts[3] = thread4.getContext();

        for(ThreadRaceContext context : contexts){
            System.out.println(context.toString());
        }
    }
}
