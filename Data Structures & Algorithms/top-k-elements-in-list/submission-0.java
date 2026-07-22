class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b) -> b.getValue()-a.getValue()
        );
        Map<Integer,Integer> hm = new HashMap<>();
        int ans [] = new int[k];

        for(int a: nums){
            hm.put(a,hm.getOrDefault(a,0)+1);

        }
        for(Map.Entry<Integer,Integer> me : hm.entrySet()){
            pq.add(me);
        }
        for(int i=0;i<k;i++){
            Map.Entry<Integer,Integer> me = pq.poll();
            ans[i] = me.getKey();
        }
        return ans;
    }
}
