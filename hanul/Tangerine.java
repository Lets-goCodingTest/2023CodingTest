package hanul;

import java.util.*;
public class Tangerine {
    public int solution(int k, int[] tangerine) {
            int answer = 0;

            Map<Integer, Integer> map = new HashMap<>();

            for (int item : tangerine) {
                map.put(item, map.getOrDefault(item, 0) + 1);
            }

            List<Integer> lists = new ArrayList<>(map.values());

            lists.sort(Collections.reverseOrder());

            int count = 0;

            for (Integer x : lists) {
                answer += 1;
                count += x;

                if (count >= k) {
                    break;
                }
            }
     return answer;
    }
}