import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }

    }
}
class test{
    int[] arr1;//declaration
    public test(){
        arr1=new int[5];//creation
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= Integer.MIN_VALUE;//initialization
        }
    }
    public void insert(int value,int index){//insert method
        try{
            if (arr1[index]==Integer.MIN_VALUE)
                arr1[index]=value;
            else
                System.out.println("already filled");
        }
        catch (ArrayIndexOutOfBoundsException obj){
            System.out.println("invalid index");
        }

    }
}