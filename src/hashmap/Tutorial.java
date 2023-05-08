package hashmap;

import java.util.HashMap;
import java.util.Map;
public class Tutorial {
  //Tutorial of HashMap in java
    public static void main(String[] args) {
        //String is key and integer is the value1
        HashMap<String , Integer> map = new HashMap<>();
        //Insertion operation
        map.put("India", 91);
        map.put("china", 21);
        map.put("japan" ,55);
        map.put("us", 25);
        System.out.println(map);
        // Override the previous value present at the same key
        map.put("India", 52);
        System.out.println(map);
        // Searching 
        // .contains(key) gives boolean value 
        // Returns true if value is present at the given key 
        // Returns false if value is not present at the key
        if(map.containsKey("India")) {
            System.out.println("Key is present in the table");
        }else {
            System.out.println("key is not present in the table");
        }
        // to get value at particular key we use .get()
        System.out.println(map.get("India"));
        // return value if present otherwise return null
        
        //entry set method for iteration
        for(Map.Entry<String , Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
      
        //To remove .remove()
        map.remove("china");
        System.out.println(map);
    }
}
