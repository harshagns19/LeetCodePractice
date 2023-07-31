package Strings;
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */
public class MergeStringsLC1768 {

    public static void main(String[] args) {
        //My solution
        String word1 = "abcd", word2 = "prq";
        int w1len = word1.length();
        int w2len = word2.length();
        int shortWordLen = 0;
        StringBuffer sb = new StringBuffer();

        shortWordLen = (w1len > w2len) ? w2len:w1len;
        System.out.println("shortWordLen "+shortWordLen);

        for(int i =0;i<shortWordLen;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        System.out.println("w1len "+w1len);
        System.out.println("w2len "+w2len);
        if(w1len != w2len){
            sb =  (w1len > shortWordLen) ? sb.append(word1.substring(shortWordLen,w1len)):
                    sb.append(word2.substring(shortWordLen,w2len));

        }
        System.out.println("output is "+sb.toString());

        /*Better solution
        public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
        }
         */
    }
}
