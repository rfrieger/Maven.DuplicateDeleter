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
        String[] toBeRemoved = new String[0];
        int count = 0;


        for (int i = 0; i < strings.length; i++) {
            for (int k = 0; k < strings.length; k++) {

                if (strings[i].equals(strings[k])) {
                    count++;
                }
            }
            if (count >= maxNumberOfDuplications) {
                String[] tempArr = {strings[i]};
                toBeRemoved = merge(tempArr, toBeRemoved);
            }
            count = 0;

        }

        return remove(toBeRemoved);
    }


    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] toBeRemoved = new String[0];
        String[] result = new String[0];
        int count = 0;


        for (int i = 0; i < strings.length; i++) {
            for (int k = 0; k < strings.length; k++) {

                if (strings[i].equals(strings[k])) {
                    count++;
                    System.out.println(count);
                }
            }
            if (count == exactNumberOfDuplications) {
                String[] tempArr = {strings[i]};
                toBeRemoved = merge(tempArr, toBeRemoved);
            }
            count = 0;

        }

        return remove(toBeRemoved);
    }


    public String[] merge(String[] arr, String[] arr2){
        String[] arrMerged;

        int arrLength = arr2.length + arr.length;
        arrMerged = (String[]) new String[arrLength];
        int i;
        for(i = 0; i < arr2.length; i++){
            arrMerged[i] = arr2[i];
        }
        for (int j = 0; j< arr.length; j++){
            arrMerged[i] = arr[j];
            i++;
        }
        return arrMerged;
    }

    public String[] remove(String[] toBeRomoved) {
        String[] result = new String[0];
        for (int i = 0; i < strings.length; i++) {
            Boolean add = true;
            for (int k = 0; k < toBeRomoved.length; k++) {
                if(strings[i].equals(toBeRomoved[k])){
                    add = false;
                    break;
                }
            }
            if (add) {
                String[] tempArr = {strings[i]};
                result = merge(tempArr, result);
            }
        }
        return result;
    }
}


