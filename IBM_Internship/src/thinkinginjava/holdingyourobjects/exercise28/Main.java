package thinkinginjava.holdingyourobjects.exercise28;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        Random random = new Random();
        int i = 0;
        while (i < 10) {
            priorityQueue.offer(random.nextDouble());
            i++;
        }
        while(priorityQueue.peek() != null){
            System.out.println(priorityQueue.poll());
        }
    }
}
