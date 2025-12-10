package day29;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("India", 140);
        map.put("USA", 33);
        map.put("UK", 6);
        map.put("India", 141); // Overwrites existing value

        System.out.println("HashMap Data: " + map);

        // Demonstrating collision with custom keys
        map.put("FB", 1);
        map.put("Ea", 2); // "FB" and "Ea" have same hashCode -> Collision

        System.out.println("After Collision Keys: " + map);
    }
}
