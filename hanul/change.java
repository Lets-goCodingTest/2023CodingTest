package hanul;

import java.util.Arrays;

public class change {
        public int solution(int n, int[] money) {
            int[] answer = new int[100001];
            Arrays.sort(money);

            answer[0] = 1;

            for (int i : money) {
                for (int j = i; j <= n; j++) {
                    answer[j] += answer[j - i];
                }
            }

            return answer[n] % 1000000007;
        }
}

