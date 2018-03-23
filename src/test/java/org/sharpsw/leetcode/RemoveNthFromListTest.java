package org.sharpsw.leetcode;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class RemoveNthFromListTest {
    private RemoveNthFromList service;

    @Before
    public void setup() {
        service = new RemoveNthFromList();
    }

    @Test
    public void shouldSupportEmptyList() {
        ListNode head = null;
        assertThat(service.removeNthFromEnd(head, 0), nullValue());
    }

    @Test
    public void shouldSupportSingleItemList() {
        ListNode root = new ListNode(9);
        assertThat(service.removeNthFromEnd(root, 0), nullValue());
    }

    @Test
    public void shouldSupportSingleItemListInvalidPosition() {
        ListNode root = new ListNode(9);
        ListNode result = service.removeNthFromEnd(root, 1);
        assertThat(result, notNullValue());
        assertThat(result.val, is(9));
        assertThat(result.next, nullValue());
    }
}
