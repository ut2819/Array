public static int findUnique(int arr[]){
  int n=arr.lenght;
  int res=arr[0];
  for(int i=1;i<n;i++){
    res=res^arr[i];
  }
  return res;
}
    
