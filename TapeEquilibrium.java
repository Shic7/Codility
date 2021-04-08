class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum;
        int totalA = 0;
        int totalB = 0;
        int min = 0;
        boolean flag = false;

        for(int k=A.length-1; k > 0; k--)
            totalB += A[k];

        for(int i=0; i < A.length-1; i++)
        {           
            totalA += A[i];

            sum = totalA - totalB;
            sum = Math.abs(sum);

            if(flag==false)
            {
                min = sum;
                flag = true;
            }

            if(min > sum)
                min = sum;

            totalB -= A[i+1];
        }

        return min;
    }
}
