class Solution {
    public int maximumWealth(int[][] a) {
        int[] sum= new int[a.length];
        for(int i=0; i<a.length; i++)
        {
            // int sum =0;
            for(int j=0; j<a[i].length; j++)
            {
                sum[i]+=a[i][j];
            }
        }
        Arrays.sort(sum);
        return sum[sum.length-1];
    }
}