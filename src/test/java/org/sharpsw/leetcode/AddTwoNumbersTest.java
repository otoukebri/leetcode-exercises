package org.sharpsw.leetcode;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class AddTwoNumbersTest {
    private AddTwoNumbers cut;

    @Before
    public void setup() {
        cut = new AddTwoNumbers();
    }

    @Test
    public void addSymmetricNumbers() {
        ListNode root1 = new ListNode(1);
        ListNode root2 = new ListNode(2);

        ListNode result = cut.addTwoNumbers(root1, root2);

        assertThat(result, notNullValue());
        assertThat(ListNodeUtils.getLength(result), is(1));
        assertThat(ListNodeUtils.stringifyContents(result), is("3"));
    }

    @Test
    public void addEmptyLists() {
        ListNode root1 = null;
        ListNode root2 = null;
        ListNode result = cut.addTwoNumbers(root1, root2);

        assertThat(result, nullValue());
    }
}
