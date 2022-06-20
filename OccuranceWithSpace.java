import java.util.LinkedHashMap;
import java.util.Scanner;

public class OccuranceWithSpace {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 =sc.nextLine();//Hi my name is 
        int Count = 1;

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for (char Str : s1.toCharArray()) {
            System.out.println(Str);
            if(map.containsKey(Str) && Str != ' ')
                map.put(Str, map.get(Str)+1);

                else if (Str == ' '){
                map.put('z', Count);
                Count++;
                }

                else if (Str != ' ')
                 map.put(Str, 1);
        }

        System.out.println(map);
        System.out.println("Total spaces is "+(Count-1));

    }
}
