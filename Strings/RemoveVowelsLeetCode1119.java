package Strings;

public class RemoveVowelsLeetCode1119 {
    public static void main(String[] args) {

        String input = "LeetCodeProblem1119";
        StringBuffer sb = new StringBuffer();

        for(char ch: input.toCharArray()){ //Convert the str to char array, iterate and check for aeiou values
            if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                sb.append(ch);
            }
        }
        System.out.println("result is "+sb.toString());
    }
}
