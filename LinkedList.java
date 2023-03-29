import java.security.DrbgParameters.NextBytes;

public class LinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public void addFirst(int data) {
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=null;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void printLinkedList(){
        if(head==null){
            return;
        }
        Node ptr=head;
        while (ptr!=null) {
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void addMiddle(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void removeFirst(){
        if(head==null){
            return;
        }
        Node temp=head;
        head=temp.next;
    }
    public void removeLast(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
              temp=temp.next;
        }
        temp.next=null;
    }
    public void search(int key){
        if(head==null){
            return ;
        }
        if(head.data==key){
            System.out.println("0");
        }
        int c=1;
        Node temp=head.next;
        while(temp.next!=null){
            if(temp.data==key){
              System.out.println(c);
            }
            temp=temp.next;
            c++;
        }
    }
    public void reserve(){
        if(head==null){
            return;
        }
        if(head.next==null){
            return ;
        }
        Node prev=null;
        Node curr=tail=head;
        Node fwrd;
        while(curr!=null){
             fwrd=curr.next;
             curr.next=prev;
             prev=curr;
             curr=fwrd;
        }
        head=prev;
    }
    public void deleteNthNodeFromEnd(int n){
        if(head==null){
            return;
        }
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int find=size-n;
        Node prev=head;
        int i=1;
        while(i<find){
          prev=prev.next;
          i++;
        }
        prev.next=prev.next.next;
        
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(2); 
        ll.addFirst(4);
        ll.addlast(5);
        ll.addlast(7);
        ll.addlast(6);
        ll.addlast(9);
        ll.addMiddle(3, 10);
        ll.removeLast();
        LinkedList.printLinkedList();
        // ll.reserve();
        // LinkedList.printLinkedList();
        ll.deleteNthNodeFromEnd(4);
        LinkedList.printLinkedList();
    }

    
}