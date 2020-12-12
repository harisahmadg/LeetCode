public class Test {
    
    public static void main(String[] args) {
        
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.addFirst(7);
        myList.addLast(0);
        myList.deleteAtIndex(1);
        myList.addLast(5);
        myList.addAtIndex(1,1);
        myList.addAtIndex(2,6);
        myList.deleteAtIndex(2);
        myList.deleteAtIndex(1);
        myList.addLast(7);
        myList.addAtIndex(1,7);
        myList.addLast(6);


        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + " is: " + myList.get(i));
        }
    }
}