package Taeyeon;

import java.util.Arrays;

class Solution_4 {
    public static int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(5500));
        System.out.println(solution(15000));
    }
}
