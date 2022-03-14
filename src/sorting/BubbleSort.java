package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n= sc.nextInt();
        System.out.println("Enter the element of array");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort b= new BubbleSort();
        b.Sort(arr);

    }

    public void Sort(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j]>arr[j + 1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int z = 0; z < arr.length; z++) {
            System.out.println(arr[z]+" ");
        }
    }
}
