package Graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    static HashMap<String,Integer> obj;
    static Scanner sc;
    public Test(){
        obj=new HashMap<>();
        sc=new Scanner(System.in);
    }
    public static void insert(){

        while (true) {

            System.out.println("If you want to terminate please enter the value of key to \"Stop\"");
            System.out.println("Enter key");

            String key=sc.next();
            if(key.equalsIgnoreCase("Stop"))
                break;
            System.out.println("Enter the value of key "+key);
            int value=sc.nextInt();

            obj.put(key, value);
        }
    }

    public static void print(){
        for (Map.Entry<String,Integer> res : obj.entrySet()) {
            System.out.println(res.getKey());
            System.out.println(res.getValue());
        }
    }
    public static void main(String[] args) {
        Test obj=new Test();
        insert();
        print();
    }
}
