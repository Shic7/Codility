class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        long count = 0;
        long diff = Y - X;

        count = diff / D;

        if( diff % D !=0 )
            count += 1;
        
        return (int)count;
    }
}
