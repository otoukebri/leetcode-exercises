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

    public static Integer stringifyContents(ListNode root) {
        StringBuilder buffer = new StringBuilder();
        if(root == null) {
            return 0;
        }

        ListNode node = root;
        while(node != null) {
            buffer.append(node.val);
            node = node.next;
        }

        return Integer.valueOf(buffer.toString());
    }
}
