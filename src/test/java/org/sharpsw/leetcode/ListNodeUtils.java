package org.sharpsw.leetcode;

public class ListNodeUtils {
    public static int getLength(ListNode root) {
        int counter = 0;
        if(root == null) {
            return counter;
        }

        ListNode node = root;
        while(node != null) {
            counter++;
            node = node.next;
        }

        return counter;
    }

    public static Integer getValue(ListNode root) {
        String result = "";
        if(root == null) {
            return 0;
        }

        ListNode node = root;
        while(node != null) {
            result = node.val + result;
            node = node.next;
        }

        return Integer.valueOf(result);
    }
}
