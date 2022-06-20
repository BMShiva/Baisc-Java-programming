import java.util.LinkedHashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String s1="Hiiiimynameis";
        s1=s1.toLowerCase();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (Character ch : s1.toCharArray()) {

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }         
        }
        System.out.println(map);
    }
}
