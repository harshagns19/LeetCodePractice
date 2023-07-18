package Strings;

public class ReverseStringInPlaceLC344 {
    public static void main(String[] args) {

        //Reverse using String Buffer
        String input = "testing";
        StringBuffer sb = new StringBuffer();

        for(int i = input.length()-1; i >= 0 ;i--){
            sb.append(input.charAt(i));
        }
        System.out.println("Reverse of a String is "+sb.toString());

        //Doing it in place
        char[] s = {'t','e','s','t','i','n','g'};
        char temp;
        for(int i=0; i < s.length/2; i++){
            temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
        System.out.println("inplace is "+String.valueOf(s));

    }
}
