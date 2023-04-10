class Solution_8 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;

        while(true) {
            int sum = 0;
            for(int i = start; i < start + num; i++) {
                sum+=i;
            }
            if(sum == total) {
                for(int i = 0; i < num; i++)
                {
                    answer[i] = start;
                    start++;
                }
                break;
            }
            else if(sum < total) {start++;}
            else {start--;}
        }

        return answer;
    }
}