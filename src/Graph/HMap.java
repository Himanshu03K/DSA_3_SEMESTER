package Graph;

import java.util.HashMap;
import java.util.Map;

public class HMap {

    public static void main(String[] args) {
        HashMap<String,Integer> obj= new HashMap<>();

        obj.put("A",50);
        obj.put("B",100);
        obj.put("C",200);
        obj.put("D",150);
        obj.put("E",69);
        obj.put("F",300);

        for (Map.Entry<String,Integer> res : obj.entrySet()) {
            System.out.println(res.getKey());
            System.out.println(res.getValue());
        }
        int res= obj.get("A");
        int res2= obj.getOrDefault("XYZ",0);

        System.out.println(res);
        System.out.println(res2);
        // System.out.println(obj.get);
    }
}
