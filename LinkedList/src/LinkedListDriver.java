public class LinkedListDriver {
    public static void main (String args[]) {
        SimpleLinkList linklist=new SimpleLinkList(14);
        /*linklist.addtohead(11);
        linklist.addtohead(7);
        linklist.addtohead(17);*/
        linklist.addtotail(9);
        linklist.addtotail(8);
        linklist.addtotail(11);
        linklist.addtotail(6);
       // SimpleLinkList.Node tail=linklist.traversFromHead();
        //System.out.println("tail from traveres");
        //System.out.println(tail.getvalue());
        //System.out.println("tail from gettail()");
        //System.out.println(linklist.returntail().getvalue());
        //System.out.println("----------------");
        linklist.addtotail(2);
        linklist.addtotail(3);
        linklist.addtotail(4);
        System.out.println("------size--------");
        System.out.println(linklist.getsize());
        System.out.println("------size--------");
       // tail=linklist.traversFromHead();
        //System.out.println(tail.getvalue());
       // SimpleLinkList.Node tail=linklist.traversFromHead();
        linklist.deletenode(4);
        linklist.deletenode(2);
        System.out.println("------size--------");
        System.out.println(linklist.getsize());
        System.out.println("------size--------");
        SimpleLinkList.Node tail=linklist.traversFromHead();
        System.out.println("----------------");
        System.out.println(linklist.returnhead().getvalue());
        System.out.println(linklist.returntail().getvalue());

    }
}
