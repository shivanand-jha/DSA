package queue;
public class Queue {
    nod front;
    nod rear;
    public void Enqueue(int data){
        nod n1=new nod();
        if(front==null){
            front=n1;
             rear=n1;
        }
        else
        {
            rear.next=n1;
            rear=n1;
            rear=rear.next;

        }

    }
//    public void traverse(){
//
//        if(front==null)
//            System.out.println("UnderFlow");
//        else
//        { nod temp=front;
//            while(temp.next!=null) {
//                System.out.println(temp.data);
//                temp = temp.next;
//            }
//        }
//    }

    public static void main(String[] args) {
        Queue q1= new Queue();
        q1.Enqueue(10);
        q1.Enqueue(20);
        q1.Enqueue(30);
        //q1.traverse();
        //System.out.println();
    }
}
class nod{
    int data;
   nod next;

}