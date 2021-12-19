import java.util.Arrays;
class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for(int i=0; i<citations.length;i++) {
        	int h = citations.length-i;
        	if(citations[i]>=h) {
        		answer = h;
        		break;
        	}
        }
        return answer;
    }
    /*
     	HIndex test = new HIndex();
		int[] citations = {3,0,6,1,5};
		
		int result = test.solution(citations);
		System.out.println(result);	
     */
}