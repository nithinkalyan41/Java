package DSA.Linkedlist;

public class circularLL {
    Node head;
    Node tail;
    circularLL(){
        this.head=null;
        this.tail=null;
    }
    class Node{
        int value;
        Node next;
        Node(int val){
            this.value=val;
        }
    }

    void insert(int val){
        Node node = new Node(val);
        if(head==null && tail==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    void delete(int val){
        Node current = head;
        if(current.value==val){
            head=head.next;
            tail.next=head;
        }
        do{
            Node n = current.next;
            if(n.value==val){
                current.next=n.next;
                break;
            }
            current=current.next;

        }while(current!=head);

    }
    void display(){
        Node current = head;
        while(current.next!=head){
            System.out.println("-->"+current.value);
            current=current.next;
        }
        System.out.println("-->"+current.value);

    }
    public static void main(String[] args) {
        circularLL ll = new circularLL();
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.display();
        ll.delete(40);
        System.out.println();
        ll.display();
    }
}
