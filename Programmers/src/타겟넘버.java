class Ÿ�ٳѹ� {
 public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    
    private int dfs(int[] numbers, int node, int sum, int target){
        if(node == numbers.length){
            if(sum==target)
                return 1;
            return 0;
        }
        return dfs(numbers, node+1, sum + numbers[node], target) 
        	 + dfs(numbers, node+1, sum - numbers[node], target);
    }
    /*
     *	Ÿ�ٳѹ� test = new Ÿ�ٳѹ�();
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int result = test.solution(numbers,target);
		System.out.println(result);	
     */
}