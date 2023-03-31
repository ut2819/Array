import java.util.Scanner;
public class SortArr01{
     public static void sort(int arr[],int n){
        int zeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeros){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
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
        sort(arr, n);
        printArray(arr, n);
    }
}
