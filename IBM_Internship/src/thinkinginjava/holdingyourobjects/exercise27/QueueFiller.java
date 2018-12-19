package thinkinginjava.holdingyourobjects.exercise27;

import java.util.*;

public class QueueFiller {
    private Queue<Command> queue;

    public QueueFiller() {
        queue = new LinkedList<>();
    }

    public Queue<Command> fillQueue(List<Command> commands) {
        for (Command command : commands) {
            queue.add(command);
        }
        return queue;
    }
}
