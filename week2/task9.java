import java.util.*;

public class task9 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 2, 3, 2};
        int n = 6, m = 3;

        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            deque.addLast(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (deque.size() == m) {
                max = Math.max(max, map.size());

                int first = deque.removeFirst();
                map.put(first, map.get(first) - 1);
                if (map.get(first) == 0)
                    map.remove(first);
            }
        }

        System.out.println(max);
    }
}