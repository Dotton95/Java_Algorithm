
public class Main {

	public static void main(String[] args) {
		프린터 test = new 프린터();
		int[] priorities = {2,1,3,2};
		int location = 2;
		int result = test.solution(priorities,location);
		System.out.println(result);	
	}
}
