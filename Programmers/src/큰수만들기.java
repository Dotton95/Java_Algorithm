class 큰수만들기 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int size = number.length();

        int start = 0;
        int cnt = size - k;
        int end = size - cnt;

        while (true) {
            if (answer.length() == size - k) break;
            int idx = start;
            int bigger = -1;
            for (int i = start; i <= end; i++) {
     
                if (i >= number.length()) break;
                int cur = number.charAt(i) - '0';
                if (bigger < cur) {
                    bigger = cur;
                    idx = i;
                }
            }
            answer.append(bigger);
            start = idx + 1;
            end = size - --cnt;
        }

        return answer.toString();
    }
    /*
     	큰수만들기 test = new 큰수만들기();
		String numbers = "1924";
		int k = 2;
		String result = test.solution(numbers,k);
		System.out.println(result);	
     */
}