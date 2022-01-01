import java.util.ArrayList;
class 모의고사 {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] thr = {3,3,1,1,2,2,4,4,5,5};
        int size = answers.length;
        int[] score = new int[3];
        
        for(int i=0;i<size;i++){
            if(answers[i]==one[i%one.length]) score[0]++;
            if(answers[i]==two[i%two.length]) score[1]++;
            if(answers[i]==thr[i%thr.length]) score[2]++;
        }
        int max = Math.max(Math.max(score[0],score[1]),score[2]);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==score[0]) list.add(1);
        if(max==score[1]) list.add(2);
        if(max==score[2]) list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++)
            answer[i] = list.get(i);
        return answer;
    }
    /*
     	모의고사 test = new 모의고사();
		int[] answers = {1,2,3,4,5};
		int[] result = test.solution(answers);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);	
		}
     */
}