package org.example;

class Solution_14 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Idx = 0;
        int cards2Idx = 0;

        for(int i = 0; i < goal.length; i++) {
            String str = goal[i];
            if(cards1.length > cards1Idx && str.equals(cards1[cards1Idx])){
                cards1Idx++;
            } else if(cards2.length > cards2Idx && str.equals(cards2[cards2Idx])){
                cards2Idx++;
            } else return "No";
        }
        return "Yes";
    }
}