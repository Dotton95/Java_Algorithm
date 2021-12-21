import java.util.*;
class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq 
            = new PriorityQueue<>(Collections.reverseOrder());
        for(int a : priorities) pq.offer(a);
        while(!pq.isEmpty()){
            for(int i=0;i<priorities.length;i++){
                if(pq.peek()==priorities[i]){
                    pq.poll();
                    answer++;
                    if(location==i){
                        pq.clear();
                        break;
                    }
                }
            }
        }
        return answer;
    }
    /*
     	프린터 test = new 프린터();
		int[] priorities = {2,1,3,2};
		int location = 2;
		int result = test.solution(priorities,location);
		System.out.println(result);	
     */
}