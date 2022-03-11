import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the item");
        int item = sc.nextInt();
        int found=binarySearch(arr,item);
        System.out.println(found);
    }
        public static  int binarySearch(int[] arr,int item){
//            System.out.println("Enter item");
            int first = 0, last = arr.length;
            while (first<=last) {
                int mid = (first + last) / 2;
                if (item == arr[mid])
                    return item;
                else if (item>arr[mid])
                    first=mid+1;
                else
                    last=mid-1;
            }

            return -1;
        }

}
