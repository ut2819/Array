import java.util.Scanner;
public class SecondLargetE {
     public static int sLargElement(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                if(smax<arr[i]){
                    smax=arr[i];
                }
            }
        }
        return smax;
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
        int res=sLargElement(arr);
        System.out.println(res);
    }
 
}
