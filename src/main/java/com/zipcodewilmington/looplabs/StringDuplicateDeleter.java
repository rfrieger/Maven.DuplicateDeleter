package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    String[] strings;
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
        this.strings = intArray;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<String> stream = Stream.of(strings);
        stream.distinct().collect(Collectors.toList());
        return stream.toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new String[0];
    }
}
