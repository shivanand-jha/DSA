package array;

import java.util.Scanner;

public class NewArray {
    int[] arr;//instance variable
public NewArray(){
    arr=new int[5];
}

    public static void main(String[] args) {
        NewArray obj1= new NewArray();//object of class NewArray
        Scanner sc = new Scanner(System.in);
        //Static data structure;
        for (int i = 0; i < obj1.arr.length; i++) {
            obj1.arr[i]=sc.nextInt();
        }//array can be directly accessed using index of array
        for (int i = 0; i < obj1.arr.length; i++) {
            System.out.print(obj1.arr[i]+" ");
        }
    }
}
