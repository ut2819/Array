import java.util.Scanner;

public class PrintOnlyPositiveElement {
    public static void printPositive(int arr[],int n) {
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                System.out.println(arr[i]);
            }
        }
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
        printPositive(arr, n);
    }
}
