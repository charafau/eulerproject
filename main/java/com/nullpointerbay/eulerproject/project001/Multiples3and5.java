package com.nullpointerbay.eulerproject.project001;


import java.util.List;
import java.util.stream.Collectors;

/**
 * return sum of numbers multiplied by 3 or 5
 * from given collection
 */
public class Multiples3and5 {
    /**
     * should return numbers which are multiplied by 3 and 5
     */
    List<Integer> multiplyBy3and5(List<Integer> rangeList) {
        return rangeList.stream().filter(i -> i % 5 == 0 || i % 3 == 0).collect(Collectors.toList());
    }

    int sumNumbers(List<Integer> range) {
        Integer reduce = range.stream().reduce(0, (i1, i2) -> i1 + i2);
        return reduce;
    }

    public int sumMultipliedBy3and5(List<Integer> range) {
        return sumNumbers(multiplyBy3and5(range));
    }
}
