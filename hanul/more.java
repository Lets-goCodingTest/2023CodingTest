package org.example;

public class more {
    public int solution(int a, int b) {
        int answer = 0;
        int str1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int str2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));

        if(str1 < str2) {
            answer = str2;
        } else {
            answer = str1;
        }

        return answer;
    }
}

