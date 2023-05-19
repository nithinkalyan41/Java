package DSA.Linkedlist;

class ll {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
    Node head;
    Node tail;
    int size;
    ll(){
        this.size=0;
    }

    void InsertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    void InsertLast(int val){
        if(tail==null){
            InsertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print("--->"+temp.val);
            temp=temp.next;
        }
    }
    void insertAtParticularPosition(int val,int index){
        if(index==0){
            InsertFirst(val);
            return;
        }
        if(index==size){
            InsertLast(val);
            return;
        }
        Node current = head;
        for(int i=1;i<index;i++){
            current=current.next;
        }
        Node node = new Node(val,current.next);
        current.next=node;
        size++;


    }
    void sum(){
        int sum=0;
        Node current=head;
        for(int i=0;i<size;i++){
            sum+=current.val;
            current=current.next;
        }
        System.out.println(sum);
    }
    void find(int value){
        Node current=head;
        int c =0;
        while(current!=null){
            if(value == current.val){
                System.out.println("found");
                c++;
            }
            current = current.next;
        }
        if(c==0){
            System.out.println("not found");
        }
    }
    void deleteFirst(){
        head=head.next;
        size--;
    }
    void deleteLast(){
        if(size<=1){
            deleteFirst();
            return;
        }
        Node current = get(size-2);
        int value = tail.val;
        tail=current;
        tail.next=null;
    }
    void deleteAtParticularPosition(int index){
        Node val = get(index-1);
        Node val1 = get(index+1);
        val.next=val1;

    }
    Node get(int index){
        Node current = head;
        for(int i=0;i<index;i++){
            current=current.next;

        }
        return current;
    }
    public static void main(String[] args) {
        ll obj = new ll();
        obj.InsertFirst(20);
        obj.InsertFirst(30);
        obj.InsertFirst(40);
        obj.InsertFirst(50);
        obj.InsertFirst(60);
        obj.InsertFirst(70);
        obj.display();
        System.out.println();
        obj.InsertLast(11);
        obj.InsertLast(22);
        obj.InsertLast(33);
        obj.InsertLast(44);
        obj.InsertLast(55);
        obj.display();
        System.out.println();
        System.out.println();
        obj.insertAtParticularPosition(111, 3);
        obj.display();
        obj.sum();
        obj.find(111);
        obj.display();
        System.out.println();
        obj.deleteAtParticularPosition(3);
        obj.display();
    }
}
