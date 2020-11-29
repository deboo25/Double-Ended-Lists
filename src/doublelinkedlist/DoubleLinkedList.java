
package doublelinkedlist;


public class DoubleLinkedList {

    
    public static void main(String[] args) {
        LinkList l=new LinkList();
        if(l.IsEmpty())
            System.out.println("Link is empty");
        else
            System.out.println("Link is not empty");
        l.insertFirst(5);
        l.insertFirst(4);
        l.insertFirst(3);
        l.insertFirst(2);
        l.insertFirst(1);
        l.insertLast(6);
        l.insertLast(7);
        l.insertLast(8);
        l.insertLast(9);
        l.insertLast(10);
        l.display();
        l.deletFirst();
        l.deletFirst();
        l.deletFirst();
        l.display();
        
    }
    
}
