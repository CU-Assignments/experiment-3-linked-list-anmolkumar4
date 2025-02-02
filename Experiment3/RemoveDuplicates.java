package Experiment3;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newnode = new ListNode();
        newnode.next = head;
        ListNode dummy = newnode;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                dummy.next = head.next;
            } else {
                dummy = dummy.next;
            }
            head = head.next;
        }
        return newnode.next;
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = solution.deleteDuplicates(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}


