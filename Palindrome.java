public class Palindrome {
    public static void main(String[] args) {

        String s1= "HIH";
        System.out.println(new Palindrome().Pali(s1));
        
    }

    public String Pali(String str){

        int maxLength = str.length()-1;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(maxLength-i))
            return "not a palindrome";
        }
        return "is palindrome";
    }
}
