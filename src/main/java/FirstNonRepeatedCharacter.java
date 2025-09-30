import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "programming";

//Approcach #1 with Hashmap

/*        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> entrySet:map.entrySet()){
            if (entrySet.getValue()==1){
                System.out.println(entrySet.getKey());
                break;
            }
        }*/


//Approach #2 using for loop
        for (int i = 0; i < input.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < input.length(); j++) {
                if (i != j && input.charAt(i) == input.charAt(j)) {
                    unique = false;

                }
            }
            if (unique) {
                System.out.println(input.charAt(i));
                break;
            }
        }

    }

}
