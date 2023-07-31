package Strings;
/*Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWordsLC151 {

    public static void main(String[] args) {
        String s = "a good   example";
        StringBuffer sb = new StringBuffer();
        String[] spl = s.split("\\s+");
        for(int i = spl.length-1;i>=0;i--){
            sb.append(spl[i].trim()+" ");
        }
        System.out.println("Original words is "+s);
        System.out.println("Reverse  words is "+sb.toString().trim());
    }
}
