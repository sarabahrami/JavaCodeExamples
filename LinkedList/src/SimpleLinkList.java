public class SimpleLinkList {
    public class Node {
        int value;
        Node next;
        public Node (int value) {
            this.value=value;
            next=null;
        }
        public int getvalue () {
            return this.value;
        }
    }
    Node head;
    Node tail;
    int size=0;
    public SimpleLinkList(int value) {
        head=new Node(value);
        tail=head;
        head.next=null;
        size++;

    }
    public Node returnhead () {
        return this.head;
    }
    public Node returntail() {
        return tail;
    }
    public void addtohead(int value) {
        Node newnode=new Node(value);
        if (head.next!=null) {
            Node temp=head.next;
            head.next=newnode;
            newnode.next=temp;
            size++;
        }
        else {
            head.next=newnode;
            tail=newnode;
            size++;
        }

    }

    public void addtotail(int value){
        Node newnode=new Node(value);
        tail.next=newnode;
        tail=newnode;
        size++;

    }

    public Node traversFromHead() {
        Node traverse=head;
        Node temp=head;

        while (traverse!=null){
            temp=traverse;
            System.out.println(traverse.value);
            traverse=traverse.next;
        }
        return temp;
    }

    public void deletenode (int value){
        Node traverse=head;
        Node temp;
        if (head.value==value){
            head=head.next;
            size--;
            return;
        }
            traverse=head.next;
            temp=head;
            while (traverse!=null){
                if(traverse.value==value) {
                    //check to see if it's the tail or not
                    if(traverse.next!=null){
                        temp.next=temp.next.next;
                        size--;
                        return;
                    }
                    else {
                        temp.next=null;
                        tail=temp;
                        size--;
                        return;
                    }
                }
                traverse=traverse.next;
                temp=temp.next;

            }



        }
public int getsize(){
        return size;
}

}
