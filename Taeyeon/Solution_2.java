package Taeyeon;

public class Solution_2 {
        public static int solution(int age) {
            int answer = 2022 + 1;
            answer -= age;
            return answer;
        }

        public static void main(String[] args){
            int age = 40;
            int age1 = 23;

            System.out.println(solution(age));
            System.out.println(solution(age1));
        }
}
