package com.zipcodewilmington.looplabs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

        Integer[] integers;
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.integers = intArray;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<Integer> stream = Stream.of(integers);
        return null;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];
    }
}
