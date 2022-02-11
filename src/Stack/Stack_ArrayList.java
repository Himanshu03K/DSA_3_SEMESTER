package Stack;

import java.util.ArrayList;

public class Stack_ArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty())
                return -1;

            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty())
                return -1;
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack obj = new Stack();
        //using java collection framework
        // Stack<Integer> s= new Stack<>();
        obj.push(45);
        obj.push(30);
        obj.push(100);
        obj.push(40);
        while(!obj.isEmpty()){
            System.out.println(obj.peek());
            obj.pop();
        }
    }
}
