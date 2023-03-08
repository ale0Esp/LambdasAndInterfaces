package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();
        String[][] arrStr = {{"Mexico","MX"},{"Estados Unidos","USA"},{"Italia","It"},{"Francia","FR"},{"España","ES"}};
        for (int i = 0; i < arrStr.length; i++) {
            mp.put(arrStr[i][1], arrStr[i][0]);
        }
        System.out.println("Traditional print map");
        Iterator<Map.Entry<String,String>> it = mp.entrySet().iterator();
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry<String, String> entry = it.next();
                System.out.println("Key: "+entry.getKey()+", value: "+entry.getValue());
            }
        }
        System.out.println("\nPrint using lambda and BiConsumer");
        //map has a foreach thats recieve a consumer; 
        mp.forEach((k,v)-> System.out.println("key: "+k+", value: "+v) );
        
    }
}
