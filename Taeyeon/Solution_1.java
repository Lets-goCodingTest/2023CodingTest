package Taeyeon;
class Solution_1 {
    public static int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 1234;
        int n1 = 930211;

        System.out.println(solution(n));
        System.out.println(solution(n1));
    }
}
