package recursion;

import java.util.Scanner;

public class recursion {
    // function calling itself
    //problem can divide into smaller part
    public static int fact(int n)
    {   if(n==0)//base case
        return 1;
        int sAns=fact(n-1);
        return n*sAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int ans=fact(n);
        System.out.println(ans);
    }
}
