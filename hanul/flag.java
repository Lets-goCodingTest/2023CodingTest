package org.example;

public class flag {
    public int solution(int a, int b, boolean flag) {
        return flag == true ? a + b : a - b;
    }
}

// .. 굳이 '== true'는 붙일 필요가 없었다.