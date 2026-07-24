class Solution {
    public static String clean(String s){
        String str = "";
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)) str+= ch+"";
        }
        return str.toLowerCase();
    }
    public boolean isPalindrome(String s) {
        s = clean(s);
        int low = 0, high = s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)) return false;
            low++; high --;
        }
        return true;
    }
}
