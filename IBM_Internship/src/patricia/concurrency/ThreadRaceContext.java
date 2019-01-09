package patricia.concurrency;

import java.sql.Time;

public class ThreadRaceContext {
    private String thread;
    private long start;
    private long end;

    public ThreadRaceContext(String thread, long start, long end){
        this.thread = thread;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "ThreadRaceContext{" +
                "thread='" + thread + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
