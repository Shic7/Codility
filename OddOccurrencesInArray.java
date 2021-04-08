import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        Set<Integer> set = new HashSet<>();
        int unpaired;

        for(int i=0; i < A.length; i++)
        {
            if(set.contains(A[i]))
                set.remove(A[i]);

            else
                set.add(A[i]);
        }

        unpaired = set.iterator().next();

        return unpaired;
    }
}
