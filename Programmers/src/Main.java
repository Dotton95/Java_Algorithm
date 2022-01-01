
public class Main {

	public static void main(String[] args) {
		모의고사 test = new 모의고사();
		int[] answers = {1,2,3,4,5};
		int[] result = test.solution(answers);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);	
		}
	}
}
