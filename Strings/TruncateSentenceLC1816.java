package Strings;

public class TruncateSentenceLC1816 {
    public static void main(String[] args) {
        String truncatedSentence = truncateSentence("Truncate the sentence which is being passed",3);
        System.out.println("truncatedSentence is "+truncatedSentence);
    }

    public static String truncateSentence(String s, int k) {

        String[] words = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < k ; i++){
            sb.append(words[i]+" ");
        }
        return sb.toString().trim();

    }
}
