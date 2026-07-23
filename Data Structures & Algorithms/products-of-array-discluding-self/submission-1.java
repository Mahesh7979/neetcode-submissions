class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prev = 1;
        int pre[] = new int[nums.length+1];
        int ans[] = new int[nums.length];
        pre[nums.length] = 1;
        for(int i=nums.length-1;i>=0;i--){
            pre[i] = pre[i+1]*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i] = prev * pre[i+1];
            prev *= nums[i];
        }
        return ans;
    }
}  
