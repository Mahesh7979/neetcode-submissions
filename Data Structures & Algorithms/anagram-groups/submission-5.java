class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hs = new HashMap<>();
        for (String s : strs) {
            int arr[] = new int[27];
            String sn = "";
            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
            }
            for (int i = 0; i < arr.length; i++) {
                char letter = (char) ('a' + i);
                sn += "" + letter + arr[i];
            }
            hs.computeIfAbsent(sn, k -> new ArrayList<>()).add(s);
        }
       
        return new ArrayList<>(hs.values());
    }
}

// {
//     "a1b1c1t1" : list of strings ["cat","act"],

// }