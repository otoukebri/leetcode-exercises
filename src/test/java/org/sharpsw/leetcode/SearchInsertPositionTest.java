package org.sharpsw.leetcode;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchInsertPositionTest {
    private SearchInsertPosition service;

    @Before
    public void setup() {
        service = new SearchInsertPosition();
    }

    @Test
    public void shouldSupportEmptyArray() {
        int[] numbers = {};

        assertThat(service.searchInsert(numbers, 0), is(0));
    }
}
