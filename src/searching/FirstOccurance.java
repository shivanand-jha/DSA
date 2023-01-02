package Search;

public class FirstOccurance {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5,5,5,5,5,6,6,6,6,67};
//        System.out.println(a.length);
        System.out.println(lastIndex(a,5));
        System.out.println(indexOfFirst(a,5));
    }

    private static int indexOfFirst(int[] a, int i) {
        int l=0; int h=a.length;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if (a[mid]>i)
            {
                h=mid-1;
            }
            else if(a[mid]<i)
            {
                l=mid+1;
            }
            else {
                if(mid==0 || a[mid-1]!=a[mid])
                    return mid;
                else
                    h=mid-1;
            }
        }
        return -1;
    }
    private static int lastIndex(int[] a, int i)
    {
        int l=0; int h=a.length;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if (a[mid]>i)
            {
                h=mid-1;
            }
            else if(a[mid]<i)
            {
                l=mid+1;
            }
            else {
                if(mid==0 || a[mid+1]!=a[mid])
                    return mid;
                else
                    l=mid+1;
            }
        }
        return -1;
    }
}
