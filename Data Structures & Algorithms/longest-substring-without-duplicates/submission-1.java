class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int start = 0, end = 0,curr=0,max=0;
        while(end < s.length() && start < s.length()){
            if(!hs.contains(s.charAt(end))){
            curr = end -start+1;
            hs.add(s.charAt(end));
                end++;
            }
            else {
                hs.remove(s.charAt(start));
                start++;
            }
            max = Math.max(max,curr);

        }
        return max ;
    }
}
