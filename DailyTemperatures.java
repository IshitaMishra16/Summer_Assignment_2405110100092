package Day_4;

import java.util.*;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result = dailyTemperatures(temperatures);

        System.out.println("Output:");
        for (int days : result) {
            System.out.print(days + " ");
        }
    }
}
