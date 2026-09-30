class Solution {
    public long calculateHours(int [] piles, int k){
        long h = 0;
        for(int a : piles){
            int currState = a;
                h += (a+k-1) / k ;
        } return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0, min = Integer.MAX_VALUE;
        for(int a : piles){
            max = max < a ? a : max;
            min = min > a ? a : min;
        }   
        int low = 1 , high = max;
        int ans = 0;
        while(low <= high){
            int mid = (low+high) / 2;
            long var = calculateHours(piles,mid);
            if(var <= h ){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
