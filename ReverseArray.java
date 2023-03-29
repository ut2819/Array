import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int arr[],int n){
        int ans[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j]=arr[i];
            j++;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
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
        reverseArray(arr, n);
    }
}
