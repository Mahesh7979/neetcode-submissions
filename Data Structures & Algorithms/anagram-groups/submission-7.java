class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hs = new HashMap<>();
        for (String s : strs) {
           char ch [] = s.toCharArray();
           Arrays.sort(ch);
           String str = new String(ch);
           hs.putIfAbsent(str,new ArrayList<>());
           hs.get(str).add(s);
        }
       
        return new ArrayList<>(hs.values());
    }
}

// {
//     "a1b1c1t1" : list of strings ["cat","act"],

// }