import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        //country population
        HashMap<String, Integer> map = new HashMap<>();

        //insertion -> put() key exist: value update and doesnt exist: new pair is inserted

        map.put("India", 140);
        map.put("USA",20);
        map.put("china",150);
        System.out.println(map);

        map.put("china",180);
        System.out.println(map);

        //search operation/look operation
        if(map.containsKey("Indonesia")) {
            System.out.println("present");
        } else {
            System.out.println("absent");
        }

        //get function: if key exist value prints
        // get function and key doesnt exist null prints
        //contains function: key presnet: true not present false

        System.out.println(map.get("china"));//already exist
        System.out.println(map.get("Indonesia"));//doesnt exist


        // int arr[]={12,3,423,4};
        // for(int i=0;i<4;i++) { //iterator is used
        //     System.out.println(arr[i]+" ");
        // }
        // for(int val:arr) {  ///directly getting the value from the array
        //     System.out.println(val+" ");
        // }
        // for(int val:arr)
        
        // for(Map.Entry<String,Integer> e:map.entrySet()) {
        //     System.out.println(e.getKey());
        //     System.out.print(e.getValue());
        // }

        // Set<String> keys = map.keySet();
        // for(String key: keys) {
        //     System.out.println(key+ " "+ map.get(key));
        // }

        //remove of the pair
        map.remove("china");
        System.out.println(map );
    }
}
