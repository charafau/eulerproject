package com.nullpointerbay.eulerproject.project001;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution1 {
    public static void main(String[] args) {
        List<Integer> range = IntStream.range(1, 1000).boxed().collect(Collectors.toList());
        int sum = new Multiples3and5().sumMultipliedBy3and5(range);
        System.out.println(sum);
        // 233168
    }
}
