import java.util.Scanner;
import java.util.Stack;

public class StackMidDelete {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int[] arr = new int[n];
            Stack<Integer> st = new Stack<Integer>();
            for(int i=0; i<n; i++)
            {
                arr[i] =sc.nextInt();
                st.push(arr[i]);

            }
            deleteMid(st,st.size(),0);
            while(!st.isEmpty()){
                int p =st.pop();
                System.out.print(p+" ");
            }

        }
        public static void deleteMid(Stack<Integer> st, int n,int curr ){
            if(st.empty() || curr==n)
                return;
            int x=st.pop();
            deleteMid(st , n , curr+1);
            if(curr!=n/2)
                st.push(x);
        }
    }

