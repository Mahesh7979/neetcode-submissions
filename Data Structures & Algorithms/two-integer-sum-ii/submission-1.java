class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length-1;
        while(low<high){
            int ans = numbers[low]+numbers[high];
            if(ans==target) return new int[]{low+1,high+1};
            if(ans>target){
                high--;
            }
            else{
                low++;
            }
        }
        return new int[]{0,0};
    }
}
