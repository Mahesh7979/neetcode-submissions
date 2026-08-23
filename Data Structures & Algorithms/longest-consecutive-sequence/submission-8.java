class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> hs = new HashSet<>();
        for(int a : nums){
            hs.add(a);
        }
        int max = 1;
        for(int curr : hs){
            int count = 1;
           if(!hs.contains(curr-1)){
            while(hs.contains(curr+1)){
                count++;
                curr++;
            }
           }
            max = Math.max(count,max);

        }
        return max;
    }
}
