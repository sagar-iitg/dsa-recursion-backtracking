package linkedlist;

public class Client {
    public static void main(String[] args) {
           
        LinkedList ll=new LinkedList();
        
        ll.addLast(5);
        ll.addLast(4);
       // ll.addLast(1);
        ll.addLast(3);
        ll.addLast(2);
        ll.print();
       // System.out.println( LinkedList.head);
       
        //ll.reverse();
        


        ll.print();
        //System.out.println( ll.getLength());
       
        //int arr[]={2};
        //ll.printKFromEnd(LinkedList.head,arr);
    }
    
}
