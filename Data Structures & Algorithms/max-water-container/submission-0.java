class Solution {
    public int maxArea(int[] heights) {
        int low = 0, high = heights.length-1;
        int min = 100000, max = 0;
        while(low<high){
            int len = high-low;
            min = Math.min(heights[low],heights[high]);
            max = Math.max(len*min,max);
            if(heights[low]<heights[high])
            low++;
            else
            high--;
        }
        return max;
    }
}
