package jayun;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strs = s.split(" ");
        int[] nums = new int[strs.length];
        
        for(int i=0; i<strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        
        int min = nums[0];
        int max = nums[0];
 
        for(int i=0; i<nums.length; i++) {
            if(min>nums[i]) {
                min = nums[i];
            }
            if(max<nums[i]) {
                max = nums[i];
            }
        }
        answer = min +" "+ max;
        
        return answer;
    }
}
