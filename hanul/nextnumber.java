package hanul;

public class nextnumber {
        public int solution(int[] common) {
            int answer = 0;
            if ((common[1] - common[0]) == (common[2] - common[1])) {
                answer = common[common.length-1] + (common[1]-common[0]);
            } else {
                answer = common[common.length-1] * (common[1]/common[0]);
            }

            return answer;
        }
}
