
public class Main {

	public static void main(String[] args) {
		주식가격 test = new 주식가격();
		int[] prices = {1,2,3,2,3};

		int[] result = test.solution(prices);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);	
		}
	}
}
