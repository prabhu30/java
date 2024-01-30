package Concepts;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

    public static void main(String[] args) {

        Map<String, String> obj = new HashMap<>();

        obj.put("prabhu", "web developer");
        obj.put("prakash", "accounts");
        obj.put("anuradha", "household chores");

        // System.out.println(obj);
        // System.out.println(obj.keySet());
        // System.out.println(obj.entrySet());
        // System.out.println(obj.get("anuradha"));

        for (String key : obj.keySet()) {
            System.out.println(key + " : " + obj.get(key));
        }
    }
}
