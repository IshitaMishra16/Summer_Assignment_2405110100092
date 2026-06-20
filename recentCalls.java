package Day_5;

import java.util.Queue;
import java.util.LinkedList;

class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);

        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}

public class recentCalls {
    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();

        System.out.println(rc.ping(1));     // 1
        System.out.println(rc.ping(100));   // 2
        System.out.println(rc.ping(3001));  // 3
        System.out.println(rc.ping(3002));  // 3
    }
}
