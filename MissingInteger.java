import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);     
        int min = 1; 
        
        for (int i = 0; i < A.length; i++)
        {
            if(A[i] == min)
            {
                min++;
            }

            else if(A[i] == min+1)
            {
                break;
            }
        }   
        return min;    
    }
}
