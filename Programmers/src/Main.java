
public class Main {

	public static void main(String[] args) {
		다리를지나는트럭 test = new 다리를지나는트럭();
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};

		int result = test.solution(bridge_length,weight,truck_weights);
		System.out.println(result);	
	}
}
