package com.entertainment;

import org.junit.Before;
import org.junit.Test;

public class TelevisionChannelComparatorTest {
    private Television tv1;
    private Television tv2;

    @Before
    public void setUp() {
        tv1 = new Television(); // defaults to channel 3
        tv2 = new Television(); // defaults to channel 3
    }

    @Test
    public void compare_shouldReturnZero_whenSameChannel()
}
