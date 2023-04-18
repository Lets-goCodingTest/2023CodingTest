class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < name.length; i++) {
        	for(int j = 0; j < photo.length; j++) {
        		for(int k = 0; k < photo[j].length; k++) {
        			if(photo[j][k].equals(name[i])) {
        				answer[j] += yearning[i];
        				continue;
        			}
        		}
        	}
        }
        return answer;
    }
}