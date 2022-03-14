package stack;

import java.util.Scanner;

public class stackByArray {
    int[] arr;
    int top;

    stackByArray() {
        arr = new int[5];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top== arr.length-1;
    }
    public void push(){
        if(!isFull())
        {
            Scanner sc = new Scanner(System.in);
            int data=sc.nextInt();
            top++;
            arr[top]=data;
        }
        else
            System.out.println("Stack full / overflow");
    }
    public void pop(){
        if (!isEmpty())
        {
            System.out.println(arr[top]);
            top--;
        }
        else
            System.out.println("Stack is empty");
    }
    public void peek(){
        System.out.println(arr[top]);
    }
    public void view(){
        if(isEmpty()){
            System.out.println("Stack empty");
        }
        else
        {
            for (int i = top; i >=0 ; i--) {
                System.out.println(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        stackByArray s= new stackByArray();
        //Scanner sc =new Scanner(System.in);
        s.push();
        s.push();
        s.push();
       // s.view();
        s.pop();
        //s.view();
        s.pop();
        //s.view();
    }
}
