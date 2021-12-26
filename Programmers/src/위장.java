import java.util.*;
import java.util.Map.Entry;
class 위장 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();
		 
		 for(int i=0; i<clothes.length;i++) {
			 String key  = clothes[i][1]; 
			 hm.put(key, hm.getOrDefault(key,0)+1);
		 }
		 int answer = 1;
		 for(Entry<String,Integer> entry : hm.entrySet()) {
			 answer *= entry.getValue()+1;
		 }
		 return answer - 1;
    }
    /*
     	위장 test = new 위장();
		String[][] clothes  = {
				{"yellowhat", "headgear"},
				{"bluesunglasses", "eyewear"}, 
				{"green_turban", "headgear"}};
		int result = test.solution(clothes);
		System.out.println(result);	
     */
}