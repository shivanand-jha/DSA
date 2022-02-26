import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        for (int a :arr)
        {
            System.out.print(a+" ");
        }
    }
}
