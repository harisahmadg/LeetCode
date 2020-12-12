
public class SinglyLinkedList {

    //------ Nested Node Class --------- //
    public static class Node {
        private int Element;
        private Node next;

        public Node(int e, Node n) {
            Element = e;
            next = n;
        }

        public int getElement() {
            return Element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node n) {
            next = n;
        }
    }
    //------ End of nexted Node Class ----//

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    /* Initialize DS */
    public SinglyLinkedList () {
        // Constructs an empty list
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /* Returns first element but not remove */
    public int first() {
        if (isEmpty()) return -1;
        return head.getElement();
    }

    public int last() {
        if (isEmpty()) return -1;
        return tail.getElement();
    }

    /* UPDATE METHODS: add in the front of the SLL*/
    public void addFirst(int e) {
        head = new Node(e, head);       // next is pointed to the previous head
        if (isEmpty()) {
            tail = head;                // spec case: list is empty so head = tail
        }
        size++;
    }

    public void addLast(int e) {
        Node tmp = new Node(e, null);
        if (isEmpty())
            head = tmp;         // special case: empty list
        else
            tail.setNext(tmp);
        tail = tmp;             // happens regardless empty or not
        size++;
    }

    /* remove and return first element */
    public int removeFirst() {

        if (isEmpty()) return -1;
        int first = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) {            // spec case: list empty after removing
            tail = null;
        }
        return first;
    }


    // LEETCODE METHODS THEY ASKED TO ADD

    /* Get the val of the index-th node in the LL. If invalid index, return -1 */
    public int get(int index) {
        if (index >= size) return -1;               // e.g. 1>3>7>3>1, get(2) returns 7
        Node tmp = head;
        for (int i = 0; i <= size; i++) {
            if (i == index) {
                return tmp.Element;
            }
            tmp = tmp.next;
        }
        return -1;
    }

    public void addAtIndex(int index, int val) {

        if (index > size) return;
        else if (index == 0) addFirst(val);             // add at head if index = 0
        else if (index == size) addLast(val);
        else {
            Node tmp = head;
            for (int i = 0; i < size; i++) {
                if (i == index-1) {
                    Node newNode = new Node(val, tmp.next);
                    tmp.setNext(newNode);
                    size++;
                }
                tmp = tmp.next;
            }
        }
    }

    public void deleteAtIndex(int index) {
        
        if (index >= size) return;
        else if (index == 0) {
            head = head.next;
        }
        else {
            Node tmp = head;
            for (int i = 0; i < size; i++) {

                if (i == index-1) {
                    tmp.setNext(tmp.getNext().getNext());
                    size--;

                    if (tmp.getNext() == null) {
                        tail = tmp;
                    }

                }
                tmp = tmp.next;
            }
        }

        if (isEmpty()) {                    // special case: empty after deleting
            head = null;
            tail = null;
        }
    }
}

/*
- node in LL has 2 attributes, val, next, in Doubly LL , it has 3, prev
- get(index) : Get the value of the index-th node in the linked list. If the index is invalid, return -1.
- addAtHead(val) : Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
- addAtTail(val) : Append a node of value val to the last element of the linked list.
- addAtIndex(index, val) : Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
- deleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.


1. Gonna make it INT only for now, then update it to Generics later...
2.  First we need to make a Node class within it, make it private static class: why?
    - The nested static class doesn't need reference of outer class (Node newNode = new Node(), wont work if not static, need to make a new refernce of outer class first),
LinkedList list = new Linkedlist();, then do Node newNode = list.new Node();
    - intialize the constructor then put getters and setters and were done with the node class



































*/