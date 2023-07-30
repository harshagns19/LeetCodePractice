package Strings;

public class PalindromeLC9 {
    public static void main(String[] args) {
        boolean checkPalindrome = checkPalindrome(123);
        System.out.println("is Palindrome? "+checkPalindrome);
    }
    public static boolean checkPalindrome(int x){
        int original = x;
        int reverse = 0;
        while(x > 0){
            reverse = x%10 + reverse*10;
            x= x/10;
        }
        return reverse == original ? true : false;

        //To check if a string is palindrome or not
        /*String checkPalindrome = String.valueOf(x);
        StringBuffer sb = new StringBuffer();
        for(int i = checkPalindrome.length()-1; i>=0;i--){
            sb.append(checkPalindrome.charAt(i));
        }
        return sb.toString().equals(checkPalindrome)? true:false;*/
    }
}
