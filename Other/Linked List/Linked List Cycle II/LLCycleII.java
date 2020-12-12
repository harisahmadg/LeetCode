import java.util.HashSet;

public class LLCycleII {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2; node2.next = node3; node3.next = node4;
        node4.next = node2;

        System.out.println(detectCycle(node1).val);
    }

    public static ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) return null;

        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;;

        while (temp.next != null) {

            if (set.contains(temp)) {
                return temp;
            }
            set.add(temp);

            temp = temp.next;
        }
        return null;
    }
}

// E.G.
// 3 -> 2 -> 0 -> -4 -> 2(back to 2)

/*
- we know if head or head.next is null its obv not a cycle
- while the next node is not null,
add it to set IFF its not already in there(THE NODE)
increment temp to get the next
if it is in there we just return node that was a dupe so that must be where the cycle was

*/