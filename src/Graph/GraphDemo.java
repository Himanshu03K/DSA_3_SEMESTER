package Graph;

import java.util.LinkedList;
import java.util.Map;

public class GraphDemo {
    Map<Integer, LinkedList<Integer>> obj;
    public void addedge(int v1,int v2, boolean bidirectional){
        //Basic code
        LinkedList<Integer> v1neighbous= obj.getOrDefault(v1,new LinkedList<>());
        v1neighbous.add(v2);
        obj.put(v1,v1neighbous);

        // For Bidirectional

        if(bidirectional == true){
            LinkedList<Integer> v2neighbous= obj.getOrDefault(v2,new LinkedList<>());
            v2neighbous.add(v1);
            obj.put(v2,v2neighbous);
        }
    }

    public void display(){
        for (Map.Entry<Integer,LinkedList<Integer>> res : obj.entrySet()) {
            System.out.println(res.getKey());
            System.out.println(res.getValue());
        }
    }

    public static void main(String[] args) {


    }
}
