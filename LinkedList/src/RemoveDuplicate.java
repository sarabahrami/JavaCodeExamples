import java.util.Hashtable;

//Write code to remove duplicates from an unsorted linked list.
//In the below solution, we simply iterate through the linked list, adding each element
// to a hash table.When we discover a duplicate element, we remove the element and
// continue iterating. We can do this all in one pass since we are using a linked list.
//time complexity (O(N))
// if you are not allowed to use the buffer (hash table) then we can iterate with two
// pointers: current which iterates through the linked list and runner which checks all subsequent nodes for duplicates.
// time complexity O(N^2)
public class RemoveDuplicate {
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
    public RemoveDuplicate(int value) {
        head=new Node(value);
        tail=head;
        head.next=null;
        size++;

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


    public void removetheduplicate() {
        Hashtable table=new Hashtable();
        Node traverse=head;
        Node temp=head;
        while(traverse!=null){
            //System.out.println(head.value);
            if(!table.containsKey(traverse.value)) {
                table.put(traverse.value,1);
                temp=traverse;
            }
            else {
                if(traverse.next!=null)
                    temp.next=traverse.next;
                else {
                    temp.next=null;
                }
            }
            traverse=traverse.next;
        }
    }

    public static void main(String args[]){
        RemoveDuplicate linklist=new RemoveDuplicate(14);
        linklist.addtotail(9);
        linklist.addtotail(8);
        linklist.addtotail(11);
        linklist.addtotail(9);
        linklist.addtotail(7);
        linklist.addtotail(7);
        linklist.addtotail(6);
        linklist.addtotail(6);
        System.out.println("-----traverse before remove------");
        Node tail=linklist.traversFromHead();
       linklist.removetheduplicate();
        System.out.println("-----traverse after remove------");
        tail=linklist.traversFromHead();
}

}
