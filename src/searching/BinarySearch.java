package searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the  element of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the item");
        int item = sc.nextInt();
        int found=binarySearch(arr,item);
        if(found>0)
        System.out.println("Position of item "+found);
        else
            System.out.println("Item Not Found");
    }
        public static  int binarySearch(int[] arr,int item){
//            System.out.println("Enter item");
            int first = 0, last = arr.length;
            while (first<=last) {
                int mid = (first + last) / 2;
                if (item == arr[mid])
                    return mid;
                else if (item>arr[mid])
                    first=mid+1;
                else
                    last=mid-1;
            }

            return -1;
        }

}
