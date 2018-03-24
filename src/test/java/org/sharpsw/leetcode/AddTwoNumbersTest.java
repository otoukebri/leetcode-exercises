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
        assertThat(ListNodeUtils.stringifyContents(result), is(3));
    }

    @Test
    public void addEmptyLists() {
        ListNode result = cut.addTwoNumbers(null, null);

        assertThat(result, nullValue());
    }

    @Test
    public void addWithOneNullList() {
        ListNode root1 = new ListNode(5);
        ListNode result = cut.addTwoNumbers(root1, null);

        assertThat(result, notNullValue());
        assertThat(ListNodeUtils.getLength(result), is(1));
        assertThat(ListNodeUtils.stringifyContents(result), is(5));
    }

    @Test
    public void addTwoNodeLists() {

    }

}
