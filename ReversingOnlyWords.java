public class ReversingOnlyWords {

        //INPUT: Hi my name     is
        //OUTPUT: iH ym eman    si
    public static void main(String[] args) {
        String reversedString = "";
        String s1 = "Hi my name        is";   //Input 
        String s2[] = s1.split(" ");

        for (int j = 0; j < s2.length; j++) {
            StringBuilder sb = new StringBuilder(s2[j]);
            reversedString = sb.reverse().toString()+" ";
            System.out.print(reversedString); //Output

        }
    }
    /*
    Here we are using string builders to reverse the word
    */
}
