package Search;

public class SortedRotatedSearch {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,8,9};
        int t=1;
        System.out.println(sortedRotated(a,t));
    }

    private static int sortedRotated(int[] a, int t) {
        int l=0; int h = a.length-1;
        while (l<=h)
        {
            int mid = (l+h)/2;
            if(a[mid]==t)
                return mid;
            if (a[mid] > a[l])
            {
                if (t>=a[l] && t<a[mid])
                     h=mid-1;
                else
                    l=mid+1;
            }
            else {
                if (t>a[mid] && t<=a[h])
                {
                    l=mid+1;
                }
                else {
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}
