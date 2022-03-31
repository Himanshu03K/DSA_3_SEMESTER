package Queue;

 class Node<T> {
    int data;
    Node<T> next;
    Node(int data) {
        this.data = data;
    }
}
public class QueueByLLGeneric<T> {

        public  Node<T> head;
        public  Node<T> tail;
        public boolean isEmpty() {
            return (head == null) && (tail == null);
        }

        public  void add(int data) {
            Node newnode = new Node(data);
            if (tail == null) {           //Linked List is empty
                tail = head = newnode;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public int delete() {
            if (isEmpty()) {
                //System.out.println("Empty list");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        public  int peek() {
            if (isEmpty()) {
                //System.out.println("Empty list");
                return -1;
            }
            return head.data;
        }


    public static void main(String[] args) {
        QueueByLLGeneric<Integer> obj = new QueueByLLGeneric<>();
//        obj.add(50);
//        obj.add(33);
//        obj.add(78);
        while(!obj.isEmpty()){
            System.out.print(obj.peek()+" | ");
            obj.delete();
        }

    }
}