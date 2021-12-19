
public class Main {

	public static void main(String[] args) {
		HIndex test = new HIndex();
		int[] citations = {3,0,6,1,5};
		
		int result = test.solution(citations);
		System.out.println(result);	
	}
}
