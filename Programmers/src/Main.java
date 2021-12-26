
public class Main {

	public static void main(String[] args) {
		위장 test = new 위장();
		String[][] clothes  = {
				{"yellowhat", "headgear"},
				{"bluesunglasses", "eyewear"}, 
				{"green_turban", "headgear"}};
	
		int result = test.solution(clothes);
		System.out.println(result);	
	}
}
