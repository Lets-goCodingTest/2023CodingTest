package hanul;

public class numberexpress {
    public int solution(int n) {
        int answer = 1;

        for(int i=1; i<n; i++) {
            int sum = i;
            for(int j=i+1; j<n; j++) {
                sum += j;
                if(sum>n) {
                    break;
                } else if(sum==n) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

