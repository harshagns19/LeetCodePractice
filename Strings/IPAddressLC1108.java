package Strings;

public class IPAddressLC1108 {
    public static void main(String[] args) {

        System.out.println("Modified IP is "+defangIPaddr("255.100.50.0"));
    }
    public static String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        //using enhance for loop
        for(char ch: address.toCharArray()){
            if(ch == '.'){
                sb.append("[.]");
                continue;
            }
            sb.append(ch);
        }

        return sb.toString();

        //using traditional for loop
        /*for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                sb.append("[.]");
            else
                sb.append(address.charAt(i));
        }
        return sb.toString
        */

    }
}
