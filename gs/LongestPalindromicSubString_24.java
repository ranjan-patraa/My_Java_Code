package gs;

public class LongestPalindromicSubString_24 {

    static class PallindromingResult {
         int start = 0;
        int maxLen = 1;
    }


    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        String str1 = "abcdefe";

        System.out.println(longestPalSubString(str));
        System.out.println(longestPalSubString(str1));

    }

    static String longestPalSubString(String s) {
        int len = s.length();
        if(len < 2){
            return s;
        }

        PallindromingResult result = new PallindromingResult();

        for(int i = 0; i < s.length()-1; i++){
            expandRange(s, i, i, result);
            expandRange(s, i, i+1, result);
        }
        return s.substring(result.start, result.start+result.maxLen);
    }

    private static void expandRange(String s, int low, int high, PallindromingResult pResult) { // "abcdefe";

        while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
            int currLen = high - low + 1;
            if(currLen > pResult.maxLen){
                pResult.start = low;
                pResult.maxLen = currLen;
            }
            low--;
            high++;
        }
    }
}
