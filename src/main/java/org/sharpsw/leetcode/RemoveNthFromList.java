package org.sharpsw.leetcode;

public class RemoveNthFromList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head != null) {
            int length = calculateLength(head);
            int positionToRemove = length - n - 1;
            if(positionToRemove < 0) {
                return head;
            }
            return removeItem(head, positionToRemove);
        }
        return head;
    }

    private int calculateLength(ListNode head) {
        int size = 0;
        ListNode node = head;
        while(node != null) {
            size++;
            node = node.next;
        }

        return size;
    }

    private ListNode removeItem(ListNode head, int position) {
        ListNode root = head;
        if(position == 0) {
            root = head.next;
            return root;
        }

        ListNode node = head;
        int index = 0;

        while(index++ < position) {
            node = node.next;
        }

        node.next = node.next.next;
        return root;
    }
}
