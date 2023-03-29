import java.util.ArrayList;
public class Swap {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
         int temp=list.get(idx2); 
         list.set(idx2,list.get(idx1));
         list.set(idx1,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
         list.add(2);
         list.add(4);
         list.add(3);
         list.add(12);
         list.add(32);
         list.add(23);
         System.out.println(list);
         int idx1=2;
         int idx2=5;
         swap(list, idx1, idx2);
         System.out.println(list);
    }
}
