import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
                Queue<Integer> que = new LinkedList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<progresses.length;i++) {
        	que.add(((100-progresses[i])/speeds[i])+((100-progresses[i])%speeds[i]==0?0:1));
        }
        
        int cnt = 1;
        int top = que.poll();
        
        while(!que.isEmpty()) {
        	int next = que.poll();
        	if(next <= top) {
        		cnt++;
        	}else {
        		list.add(cnt);
        		cnt = 1;
        		top = next;
        	}
        }
        list.add(cnt);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size();i++){
        	answer[i] = list.get(i);
        }
        return answer;
    }
    /*
     	기능개발 test = new 기능개발();
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		int[] result = test.solution(progresses,speeds);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);	
		}
     */
}