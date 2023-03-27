import java.util.Scanner;

import java.util.Scanner;

public class TargetSum {
    public static int targetSum(int arr[],int target){
       int n = arr.length;
       int count = 0;
        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
             for(int k=j+1;k<n;k++){
               if(a[i]+a[j]+a[k]==x){
                count++;
             }
           }
         }
        }
        return count;
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
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
        int tar=7;
        int res=targetSum(arr,tar);
        System.out.println(res);
    }
 
}
