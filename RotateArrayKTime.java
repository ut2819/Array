import java.util.Scanner;
     
public class RotateArrayKTime {
    public static int[] rotateArrayKTime(int arr[],int n){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int ans[]=new int[n];
        int j=0;
        for(int i=k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<k;i++){
            ans[j++]=arr[i];
        }
        return ans[];
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
    }
}
