import java.util.Scanner;

import java.util.Scanner;

public class TargetSum {
    public static int targetSum(int arr[],int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
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
        
    }
 
}
