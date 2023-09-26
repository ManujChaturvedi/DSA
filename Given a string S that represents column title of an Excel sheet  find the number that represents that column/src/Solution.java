public class Solution {
    public int excelColumnNumber(String s) {
        // Code here
        int len=s.length()-1;
        int result=0;
        for(int i=0;i<s.length();i++){
            int ascii =  (int)s.charAt(i) - 64;
            result += Math.pow(26,len)*ascii;
            len--;
        }

        return result;
    }
}