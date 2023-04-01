import java.util.Scanner;
public class PrefixSum{
     public static void prefixSum(int arr[],int n){
        int ans[]=new int[n];
        ans[0]=arr[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
  }

     public static void printArray(int arr[],int n){
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Element of an Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        prefixSum(arr, n);
    }
}
