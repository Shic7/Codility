import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();

        if(A.length == 0)
            return 1;

        for(int i=1; i < A.length+1; i++)
        {
            set.add(i);
        }

        for(int i=0; i < A.length; i++)
        {
            if(set.contains(A[i]))
                set.remove(A[i]);
        }

        if(set.isEmpty())
        {
            return A[A.length-1]+1;
        }

        int ans = set.iterator().next();

        return ans;
    }
}
