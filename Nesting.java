class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int pair = 0;
      
        char[] arr = S.toCharArray();

        for(int i=0; i < arr.length; i++)
        {
            if(arr[i] == '(')
                pair++;

            else //for invalid format string
            {
                pair--;

                if(pair < 0)
                    break;
            }
        }

        if(pair == 0)
            return 1;

        return 0; 
    }
}
