package com.nullpointerbay.eulerproject.project001;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Multiples3and5Test {

    private Multiples3and5 multiples3and5;

    @Before
    public void setUp() {
        multiples3and5 = new Multiples3and5();
    }

    @Test
    public void shouldReturnNumbersMultipliedBy5and3() {
        List<Integer> range = IntStream.range(1, 21).boxed().collect(Collectors.toList());
        List<Integer> filtered = multiples3and5.multiplyBy3and5(range);
        assertThat(filtered, hasItems(3, 5, 6, 9, 10, 12, 15, 18, 20));
    }

    @Test
    public void shouldReturnSumOfGivenNumbers() {
        List<Integer> range = IntStream.range(0, 5).boxed().collect(Collectors.toList());
        int sum = multiples3and5.sumNumbers(range);
        assertThat(sum, is(10));
    }

    @Test
    public void shouldEquals23forExample() {
        List<Integer> range = IntStream.range(1, 10).boxed().collect(Collectors.toList());
        int sumMultiplied = multiples3and5.sumMultipliedBy3and5(range);
        assertThat(sumMultiplied, is(23));
    }

}