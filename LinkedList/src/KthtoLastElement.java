//Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
//the non recursive solution is trivial
//recursive solution: Recurse through linkedlist when it hits the end return 0
// then each call add 1 to it
// each recursive function has an if else conidtion
// if conditition return else call f(n-1)

// both time and space complexity is o(n)

public class KthtoLastElement {
    //private static SimpleLinkList.Node node;

    public static void main(String args[]) {
       //node = new SimpleLinkList(12).new Node(12);
        SimpleLinkList linkedlist=new  SimpleLinkList(12);
        linkedlist.addtotail(13);
        linkedlist.addtotail(14);
        linkedlist.addtotail(8);
        linkedlist.addtotail(9);
        linkedlist.addtotail(10);
        linkedlist.addtotail(6);
        linkedlist.addtotail(12);
        System.out.println(Recursivetravers(linkedlist.returnhead(),3));
       // System.out.println(RecursivetraversWrapper(linkedlist.returnhead(),3,0).getvalue());
    }

  public static int Recursivetravers(SimpleLinkList.Node node, int k) {
        if (node.next == null) return 0;
        int position=Recursivetravers(node.next,k) + 1;
        if (position==k)
            System.out.println(k+"th to last node is "+node.getvalue());
        return position;
    }

  public static  SimpleLinkList.Node  RecursivetraversWrapper (SimpleLinkList.Node head, int k, int index) {
        if (head==null)
            return null;
      SimpleLinkList.Node temp= RecursivetraversWrapper(head.next,k,index);
      index ++;
      if (index ==k)
          return head;
      return temp ;
  }

}

