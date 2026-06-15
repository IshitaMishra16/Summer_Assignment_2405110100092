import java.util.List;

public class linkedListCycle {
    public boolean hasCycle(List head) {
        List slow = head;
        List fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;           // cycle found
            }
        }

        return false;                  // no cycle
    }
}