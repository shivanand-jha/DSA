package Search;

import static java.util.Arrays.binarySearch;

public class Search_In {
    public static void main(String[] args) {
        int[]  a= {1,2,3,3,4,4,4,5,5,5,5,5};
        System.out.println(searchInInfinite(a,5));
    }

    private static int searchInInfinite(int[] a, int i) {
             int l=1;
             if(a[0]==i)
                 return 0;
             while (a[l]<i)
             {
                 l=l*2;
             }
             if(a[l]==i)
                 return l;
             return binarySearch(a,i,l/2+1,l-1);
    }
}
