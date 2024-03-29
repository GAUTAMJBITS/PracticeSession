import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 123);
        map.put("us", 345);
        map.put("china", 180);
        System.out.println(map);
        if(map.containsKey("India")){
            System.out.println("present");
        }else{
            System.out.println("not Present");
        }

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + "" +map.get(key));
        }
    }
}
