import java.util.*;
class 주식가격 {
    public int[] solution(int[] prices) {
        int cnt = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<=prices[j]) cnt++;
                else {
                    cnt++;
                    break;
                }
            }
            list.add(cnt);
            cnt = 0;
        }
        int[] answer = new int[prices.length];
        for(int i=0; i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    /*
     	주식가격 test = new 주식가격();
		int[] prices = {1,2,3,2,3};

		int[] result = test.solution(prices);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);	
		}
     */
}