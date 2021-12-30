import java.util.*;
class Ã¼À°º¹ {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<Integer>();
        List<Integer> reserList = new ArrayList<Integer>();
        for(int a : lost) lostList.add(a);
        for(int a : reserve) reserList.add(a);
        
        for(int i=0;i<lostList.size();i++){
            for(int j=0;j<reserList.size();j++){
                if(lostList.get(i)==reserList.get(j)){
                    lostList.remove(i);
                    reserList.remove(j);
                    i--;
                    break;
                }
            }
        }
        for(int i=0;i<lostList.size();i++){
            for(int j=0;j<reserList.size();j++){
                if(lostList.get(i)==reserList.get(j)+1||
                   lostList.get(i)==reserList.get(j)-1){
                    lostList.remove(i);
                    reserList.remove(j);
                    i--;
                    break;
                }
            }
        }
        return n-lostList.size();
    }
    /*
     	Ã¼À°º¹ test = new Ã¼À°º¹();
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		int result = test.solution(n,lost,reserve);
		System.out.println(result);	
     */
}