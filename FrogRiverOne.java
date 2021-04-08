import java.util.Set;
import java.util. HashSet;

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();

        for(int i=1; i <= X; i++)
            set.add(i);

        for(int i=0; i < A.length; i++)
        {
            if(set.contains(A[i]))
                set.remove(A[i]);

            if(set.isEmpty())
                return i;
        }        

        return -1;
    }
}
