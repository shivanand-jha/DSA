package array;

import java.util.Scanner;

public class increAndDecRec {
    public static void print(int n)
    {
        if(n<=0)
            return ;
        System.out.println(n);
        print(n-1);
//        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        print(n);
    }
}
