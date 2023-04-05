package jayun;

public class AddNumber {

	public static void main(String[] args) {
		int answer = 0;
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    
    for(int t : tangerine){
        hm.put(t, hm.getOrDefault(t, 0)+1);
    }
    
    List<Integer> list = new ArrayList<>(hm.values());
    Collections.sort(list, Collections.reverseOrder());
    
    for (Integer i : list) {
      k -= i;
      answer++;
      if(k < 1) return answer;
    }
    
    return answer;

}
