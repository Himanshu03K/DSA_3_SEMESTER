package Stack;

public class Stack_LL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    static class Stackclass{
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data){
            Node temp= new Node(data);
            if (isEmpty()) {
                head = temp;
                return ;
            }
            temp.next=head;
            head=temp;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            return top;
        }

    }

    public static void main(String[] args) {
        Stackclass s = new Stackclass();
        s.push(45);
        s.push(34);
        s.push(60);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}