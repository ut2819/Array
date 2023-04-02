import java.util.Scanner;

public class InsertionSort {
     public static void insertionSort(int arr[],int n){
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
               if(arr[j]>temp){
                arr[j+1]=arr[j];
               }
               else{
                break;
               }
            }
            arr[j+1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
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
        insertionSort(arr, n);
    }
}


