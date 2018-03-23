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
}
