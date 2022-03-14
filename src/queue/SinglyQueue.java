package queue;

import java.util.Scanner;
public class SinglyQueue {
    int[] arr;
    int front,rear;
    SinglyQueue(){
    arr = new int[5];
    front = rear= -1;
    }
    void insert(){
        if(rear==arr.length-1)
            System.out.println("Queue Full");
        else{
        System.out.println("Data Enter");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if(rear==-1)front++;
        rear++;
        arr[rear]=data;
        System.out.println("Data inserted...");
        }
    }
    void delete(){
        if(front==-1 || rear==-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("deleted..."+arr[front]);
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else if(front<rear){
                front++;
            }
        }
    }
    void traverse(){
        if(front==-1 || rear==-1)
            System.out.println("SinglyQueue Empty");
        else
            for(int i=front;i<=rear;i++){
                System.out.println(arr[i]+" ");
                        
            }
    }
    public static void main(String args[]){
        SinglyQueue obj =new SinglyQueue();
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            
        
        System.out.println("Press 1 for insert");
        System.out.println("Press 2 for Delete");
        System.out.println("Press 3 for traverse");
        System.out.println("Press 4 for exit");
        choice=sc.nextInt();
        switch(choice){
            case 1:obj.insert(); break;
            case 2:obj.delete(); break;
            case 3:obj.traverse(); break;
            case 4:System.exit(0); break;
            default : System.out.println("Wrong choice");
        }
        
        }
    }
}
