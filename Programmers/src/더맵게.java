import java.util.*;
class ���ʰ� {
    public int solution(int[] scoville, int K) {
 int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int aScoville : scoville) {
            heap.offer(aScoville);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();


            int result = a + (b * 2);

            heap.offer(result);
            answer ++;
        }
        return answer;
    }
    /*
     	���ʰ� test = new ���ʰ�();
		int[] scoville = {1,2,3,9,10,12};
		int k = 7;
		int result = test.solution(scoville,k);
		System.out.println(result);	
     */
}