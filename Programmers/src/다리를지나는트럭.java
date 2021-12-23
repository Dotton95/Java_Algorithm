import java.util.LinkedList;
import java.util.Queue;

class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int now_weight=0;
        int time = 0;
        Queue<Integer> truck_weights_queue = new LinkedList<Integer>();
        Queue<Integer> now_truck = new LinkedList<Integer>();
        
        for(int i=0;i<truck_weights.length;i++){
            truck_weights_queue.add(truck_weights[i]);
        }
        int remain_truck = truck_weights.length;
        while(remain_truck!=0){
            if(truck_weights_queue.peek()!=null){
                remain_truck= truck_weights_queue.peek();
            }else{
                remain_truck = 0;
            }
            if(remain_truck!=0&&(weight>=remain_truck+now_weight)){
                int start_truck = truck_weights_queue.poll();
                now_truck.add(start_truck);
                now_weight = start_truck + now_weight;
                time++;
            }else{
                time = time + bridge_length;
                int seq = now_truck.size();
                for(int i=0; i<seq; i++){
                    int done_truck_w = now_truck.poll();
                    
                    now_weight = now_weight-done_truck_w;
                    if(weight>now_weight+remain_truck){
                        int start_truck = 0;
                        if(truck_weights_queue.peek()!=null){
                            start_truck = truck_weights_queue.poll();
                        }
                        now_truck.add(start_truck);
                        now_weight = start_truck + now_weight;
                    }
                }
            }
        }
        answer = time;
        return answer;
    }
    /*
     	다리를지나는트럭 test = new 다리를지나는트럭();
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};

		int result = test.solution(bridge_length,weight,truck_weights);
		System.out.println(result);	
     */
}