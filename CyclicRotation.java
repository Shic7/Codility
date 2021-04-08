class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        int[] new_arr = new int[A.length];
        
        for(int i=0; i< A.length; i++)
        {
            int new_pos = (i + K) % A.length;         
            new_arr[new_pos] = A[i]; 
        }
        
        return new_arr; 
    }
}
