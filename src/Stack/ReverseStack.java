package Stack;

import java.util.Stack;

public class ReverseStack {

    public static void addBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        addBottom(s,data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty())
            return;
        int top=s.pop();
        reverse(s);
        addBottom(s,top);
    }


    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
