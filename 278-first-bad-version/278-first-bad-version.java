/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         int l=1;
        int h=n;
        int r=0;
        int mid=l+(h-l)/2;
        while(l<=h){
            mid=l+(h-l)/2;
        if(isBadVersion(mid))
        {
            r=mid;
            h=mid-1;
        }
        else
        {
            l=mid+1;
        }
        }
        return r;
    }
}