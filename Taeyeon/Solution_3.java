package Taeyeon;

class Solution_3 {
    public static int solution(int n, int k) {
        int answer = (n*12000) + ((k - (n/10)) * 2000);
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }
}
