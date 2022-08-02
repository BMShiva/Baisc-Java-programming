import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1= "abc";
        String s2= "bca";

        char[] cha1=s1.toCharArray();
        char[] cha2=s2.toCharArray();

        Arrays.sort(cha1);
        Arrays.sort(cha2);
       Arrays.equals(cha1, cha2);
       System.out.println( "Sorted string 1 is"+Arrays.toString(cha1));
       System.out.println( "Sorted string 2 is"+Arrays.toString(cha2));
       System.out.println(Arrays.equals(cha1, cha2));
    }
}
