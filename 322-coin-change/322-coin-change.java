class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] a = new int[amount+1];
        a[0]=0;
        int max_val=amount+1;
        for(int i=1; i<a.length; i++ )
        {
            a[i]=max_val;
        }
        
        for(int i=1; i<a.length; i++)
        {
            int min = -1;
            for(int coin : coins)
            {
                if(i>=coin && a[i-coin]!=-1)
                {
                    int temp = a[i-coin]+1;
                    min = min<0 ? temp : (temp<min ? temp : min);
                }
            }
            a[i]=min;
        }
        return a[amount];
    }
}