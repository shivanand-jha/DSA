class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] a = new int[amount+1];
        int max =amount+1;
        Arrays.fill(a,max);
        a[0] = 0;
        for(int i=0; i<=amount; i++)
        {
            for(int j=0; j<coins.length; j++)
            {
                if(coins[j]<=i)
                {
                    a[i]=Math.min(a[i],a[i-coins[j]]+1);
                }
            }
        }
        return a[amount]>amount ? -1:a[amount];
    }
}