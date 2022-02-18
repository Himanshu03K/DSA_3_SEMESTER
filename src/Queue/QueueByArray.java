package Queue;

public class QueueByArray {
    static class Queue{
        static int size;
        static int[] arr;
        static int rear=-1;

        Queue(int size){
            this.size=size;
            arr= new int[size];
        }

        public boolean isEmpty(){
            return rear==-1;
        }

        public void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public int delete(){
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1 ;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public int peek(){
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1 ;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue obj = new Queue(10);
        obj.add(10);
        obj.add(20);
        obj.add(40);
        obj.add(50);
        while(!obj.isEmpty()){
            System.out.print(obj.peek()+" | ");
            obj.delete();
        }

    }
}