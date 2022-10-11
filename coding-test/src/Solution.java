import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(int[] A) {
    	int binarian = 0;
        for (int i = 0; i < A.length; i++) {
			binarian += Math.pow(2, A[i]);
		}
        
        List<Integer> shortest = new ArrayList();
        while (binarian > 0) {
        	int temp = log2(binarian);
//        	 System.out.println(temp);
        	shortest.add(temp);
        	binarian -= Math.pow(2, temp);
        }
		return shortest.size();
    }

    private int log2(int x) {
        return (int) (Math.log(x) / Math.log(2));
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().solution(new int[] {1,0,2,0,0,2}));
		System.out.println(new Solution().solution(new int[] {1,5,4}));
	}
}