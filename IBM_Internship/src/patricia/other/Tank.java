package patricia.other;

import java.util.ArrayList;
import java.util.List;

public class Tank {
    private List<Integer> stack;
    private boolean filled;

    public Tank() {
        stack = new ArrayList<>();
        filled = false;
    }

    public void add(Integer item) {
        stack.add(item);
        filled = true;
    }

    public void empty() {
        stack.clear();
        filled = false;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (filled) {
                System.out.println("Message from finalizer");
            }
        }finally {
            super.finalize();
        }
    }
}