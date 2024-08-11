package algorithim.searching.linkedList;

public class Main {

    public static void main(String[] args) {

        SingleLinkedList singleLinkedList = new SingleLinkedList() ;

        singleLinkedList.insertFirst(3) ;

        singleLinkedList.insertFirst(19) ;

        singleLinkedList.insertFirst(23) ;

        singleLinkedList.insertFirst(33) ;

        singleLinkedList.insertLast(12) ;

        singleLinkedList.insertIndex(100,3) ;

        singleLinkedList.display() ;


    }
}
