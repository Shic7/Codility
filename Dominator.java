import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<>();  

        for(int i=0; i < A.length; i++)
        {
            if(!map.containsKey(A[i]))
                map.put(A[i], 1);
            
            else
            {
                int count = map.get(A[i]);
                map.put(A[i], count+1);
            }
        }

        int max = 0; //number of occurences
        int max_key = 0; //key for number that appears

        for(int key: map.keySet())
        {
            int curr = map.get(key);

            if(curr > max)
            {
                max = curr; 
                max_key = key;
            }
        }

        if(max > A.length/2) //check if it occurs in more than half of array
            ;

        else
            return -1;

        int index = 0;

        for(int i=0; i < A.length; i++)
        {
            if(A[i] == max_key)
            {
                index = i;
                break;
            }
        }  

        return index;
    }
}
