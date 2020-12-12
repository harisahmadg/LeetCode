
public class LinkedListCycle {

    static class ListNode {

        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        System.out.println(hasCycle(node1));
    }

    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {

            if (fast == null || fast.next == null || slow == null) 
                return false;

            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}



/*
Given a LinkedList, determine if it has a cycle in it
One solution uses hash table, but a more efficient solution is using two-pointer technique

(1)
- IF we can modify the linkedlist, what we can do is go to everynode in the list and if we have 
visited it, mark it as such, upon crossing a node that has already been visited, we know theres a cycle.

(2)
The 2 pointer method, have one go normal speed, the other slower speed, if they collide at some point we know for
sure there was a loop.
*/ 