package hanul;

public class cnumbersum {
    public int[] solution(int num, int total) {
            int[] answer = new int[num];
            int check = num*(num+1) / 2;
            int start = (total - check) / num + 1;
            for (int i = 0; i < answer.length; i++) {
                answer[i] = start + i ;
            }
            return answer;
    }
}