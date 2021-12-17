import java.util.*;
class Solution {
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
}