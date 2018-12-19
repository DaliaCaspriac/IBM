package thinkinginjava.holdingyourobjects.exercise27;

import java.util.*;

public class QueueConsumator {
    public static void consumeQueue(Queue<Command> queue){
        Iterator<Command> it = queue.iterator();
        while(queue.peek()!= null){
            System.out.println(queue.peek().operation());
            queue.remove();
        }
    }
    public static void main(String[] args) {
        QueueFiller queueFiller = new QueueFiller();
        List<Command> commands = new ArrayList<>(
                Arrays.asList(
                        new Command("add"), new Command("display"),
                        new Command("fill"), new Command("delete")
                )
        );
        Queue<Command> queue = queueFiller.fillQueue(commands);
        //System.out.println(queue.peek().operation());
        consumeQueue(queue);
    }
}
