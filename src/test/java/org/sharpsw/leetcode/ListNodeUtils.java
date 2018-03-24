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

    public static String stringifyContents(ListNode root) {
        StringBuilder buffer = new StringBuilder();
        if(root == null) {
            return buffer.toString();
        }

        ListNode node = root;
        while(node != null) {
            buffer.append(node.val);
            if(node.next != null) {
                buffer.append("-");
            }

            node = node.next;
        }

        return buffer.toString();
    }
}
