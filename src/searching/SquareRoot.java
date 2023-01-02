package Search;

public class SquareRoot {
    public static void main(String[] args) {
        int a=90;
        System.out.println(squareRoot(a));
    }

    private static int  squareRoot(int a) {
        int l=1;
        int h=a;
        int ans =-1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            int miSquare = mid*mid;
            if(miSquare==a)
            {
                return mid;
            }
            else if(miSquare>a){
                h=mid-1;
            }
            else {
                l=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
