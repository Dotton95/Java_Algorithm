
public class Main {

	public static void main(String[] args) {
		기능개발 test = new 기능개발();
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		int[] result = test.solution(progresses,speeds);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);	
		}
	}
}
