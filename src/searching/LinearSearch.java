package searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr;
        int item,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        n = sc.nextInt();
        arr= new int[n];
        System.out.println("Enter element of Array");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the item to be searched");
        item=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==item){
                System.out.println("element "+item+" is at "+i+1);
                break;
            }
            else {
                System.out.println("item not found");
                break;
            }
        }

    }
}
