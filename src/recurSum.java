import java.util.Scanner;

public class recurSum {
    public static int NaturalSum(int n)
    {   if(n<0)
        return 0;
        if(n==1)
            return 1;
        int s=NaturalSum(n-1);
        return n+s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int ans = NaturalSum(n);
        System.out.println(ans);
    }
}
