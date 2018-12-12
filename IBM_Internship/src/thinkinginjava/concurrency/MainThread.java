package thinkinginjava.concurrency;

public class MainThread {
    public static void main(String[] args) {
//        LiftOff launch = new LiftOff();
//        launch.run();
//        for(int i = 0 ; i < 5; i++){
//            new Thread(new LiftOff()).start();
//        }
//        System.out.println("Waiting for LiftOff");
        //exercise 1
//        for(int i = 0; i < 5; i++){
//            new Thread(new Exercise1()).start();
//        }

        //exercise 2
        int var = 3;
        for(int i = 0; i < 3; i++){
            new Thread(new Exercise2(var++)).start();
        }
    }
}
