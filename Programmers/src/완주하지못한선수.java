import java.util.Arrays;
class �����������Ѽ��� {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
		Arrays.sort(completion);
		int i;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[i];
    }
    /*
     	�����������Ѽ��� test = new �����������Ѽ���();
		String[] participant  = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};

		String result = test.solution(participant,completion);
		System.out.println(result);	
     */
}