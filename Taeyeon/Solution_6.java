package Taeyeon;

import java.util.*;

class Solution_6 {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int[] num = new int[answer.length];

        for(int i = 0; i < answer.length; i++){
            num[i] = Integer.parseInt(answer[i]);
        }

        Arrays.sort(num);

        return num[0] + " " + num[num.length-1];
    }

    public static void main(String[] args){

    }
}