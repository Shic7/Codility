class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String binaryStr = Integer.toBinaryString(N);

        int max_gap = 0;
        int curr_gap = 0;

        for(int i=0; i < binaryStr.length(); i++)
        {
            if(binaryStr.charAt(i) == '0')
            {
                curr_gap++;
            }

            else
            {
                if(max_gap < curr_gap)
                    max_gap = curr_gap; 
                
                curr_gap = 0;
            }
        }

        return max_gap;
    }
