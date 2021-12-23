
public class Main {

	public static void main(String[] args) {
		완주하지못한선수 test = new 완주하지못한선수();
		String[] participant  = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};

		String result = test.solution(participant,completion);
		System.out.println(result);	
	}
}
