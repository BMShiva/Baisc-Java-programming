public class ReversingString {
    public static void main(String[] args) {
        String s1="Shiva";
        String  duplicateString="";
        int maxLength = s1.length()-1;
        System.out.println("the length of the string is"+maxLength);

        for (int i = maxLength; i >=0; i--) {
             duplicateString +=s1.charAt(i);
        }
        System.out.println("reversed string is '"+duplicateString+"'");


    }
}
