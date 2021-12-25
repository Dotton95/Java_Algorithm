import java.util.Arrays;
import java.util.Comparator;


class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        		  Arrays.sort(phone_book);
	      for(int i=1; i<phone_book.length; i++) {
	    	  if(phone_book[i].startsWith(phone_book[i-1])) {return false;}
	      }
	      return true;
    }
    /*
     	전화번호목록 test = new 전화번호목록();
		String[] phone_book  = {"119", "97674223", "1195524421"};
	
		boolean result = test.solution(phone_book);
		System.out.println(result);	
     */
}