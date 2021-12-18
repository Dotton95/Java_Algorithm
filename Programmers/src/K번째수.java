import java.util.*;
class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        		int[] answer = new int[commands.length];
		int start,end,k;
		int[] ex;
		
		for(int i = 0; i<commands.length;i++) {
			start = commands[i][0];
			end = commands[i][1];
			k = commands[i][2];
			ex = new int[end-start+1];
			
			int zero = 0;
			
			for(int j=start-1;j<end;j++) {
				ex[zero] = array[j];
				zero++;
			}
			Arrays.sort(ex);
			answer[i] = ex[k-1];		
		}
		return answer;
    }
    /*
     	K번째수 test = new K번째수();
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = test.solution(array, commands);
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);	
		}
     */
}