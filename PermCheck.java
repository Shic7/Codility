import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();

        for(int i=1; i < A.length+1; i++)
            set.add(i);

        for(int i=0; i < A.length; i++)
        {
            if(set.contains(A[i]))
                set.remove(A[i]);

            else
                set.add(A[i]);  
        }

        if(set.isEmpty())
            return 1;

        return 0;
    }
}
