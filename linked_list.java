public class linkedList {

    class Node{
        int data;
        Node next;
        Node( int data){
            this.data=data;
            next=null;
        }
    }
    Node head;
    // insert at the start 
    void insert_at_start(int data){
        Node new_node= new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    public static void main(String[] args) {
       linkedList list=new linkedList();
       list.insert_at_start(10);
        list.insert_at_start(20);
        list.insert_at_start(30);
        Node temp = list.head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
    }
}
